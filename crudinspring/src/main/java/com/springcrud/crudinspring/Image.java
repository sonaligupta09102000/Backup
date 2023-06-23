package com.springcrud.crudinspring;

import java.util.Base64;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "path")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String imageData;
	
	
	public void setImageData(byte[] imageDataBytes) {
        this.imageData = Base64.getEncoder().encodeToString(imageDataBytes);
    }

    public byte[] getImageDataBytes() {
        return Base64.getDecoder().decode(this.imageData);
    }
	
	
	

}