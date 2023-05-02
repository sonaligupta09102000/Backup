package com.authentication.filter;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import com.authentication.service.JwtService;
import com.authentication.service.UsersDetailService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtService jwtService;

	@Autowired
	private UsersDetailService usersDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String authHeader = request.getHeader("Authorization");
		String token = null;
		String username = null;
		System.out.println(authHeader);
		if (authHeader != null && authHeader.startsWith("Bearer ")) {
			System.out.println("aknchb");
			token = authHeader.substring(7);
			username = jwtService.extractUsername(token);

		}

		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails loadUserByUsername = usersDetailsService.loadUserByUsername(username);
			if (jwtService.validateToken(token, loadUserByUsername)) {
				UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
						loadUserByUsername.getUsername(), null, loadUserByUsername.getAuthorities());
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}
		}

		filterChain.doFilter(request, response);

	}

}
