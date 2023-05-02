package com.authentication.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.authentication.config.SecurityUser;
import com.authentication.entity.Users;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService{
	
	public static final String SECRET="33743677397A24432646294A404E635266546A576E5A7234753778214125442A";
	
	//retrieve username from jwt token
	public String extractUsername(String token)
	{
		return getClaimFromToken(token, Claims::getSubject);
	}
	
    //retrieve expiration date from jwt token
	public Date getExpirationDateFromToken(String token)
	{
	    return getClaimFromToken(token, Claims::getExpiration);	
	}
	
	
	public <T> T getClaimFromToken(String token,Function<Claims,T> claimsResolver)
	{
		final Claims claims=getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}
	
	
	private Claims getAllClaimsFromToken(String token)
	{
		
		return Jwts
        .parserBuilder()
        .setSigningKey(getSignKey())
        .build()
        .parseClaimsJws(token)
        .getBody();
		//return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
	}
	
	private boolean isTokenExpiration(String token)
	{
		final Date expiration =getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	


	public String getToken(String name)
	{
		Map<String,Object> claims=new HashMap<>();
		return createToken(claims,name);
	}

	private String createToken(Map<String, Object> claims, String name) {
		
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(name)                   //username 
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				.signWith(getSignKey(),SignatureAlgorithm.HS256)
				.compact();
				
	}

	private Key getSignKey() {
		byte[] keyBytes=Decoders.BASE64.decode(SECRET);
		return Keys.hmacShaKeyFor(keyBytes);
	}
	
	
	public boolean validateToken(String token, UserDetails loadUserByUsername)
	{
		final String name=extractUsername(token);
		return (name.equals(loadUserByUsername.getUsername()) && !isTokenExpiration(token));
		
	}
	

}
