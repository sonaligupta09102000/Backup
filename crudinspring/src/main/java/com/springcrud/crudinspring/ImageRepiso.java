package com.springcrud.crudinspring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepiso extends JpaRepository<Image, Long>{

	String getImagePathById(Long id);

}
