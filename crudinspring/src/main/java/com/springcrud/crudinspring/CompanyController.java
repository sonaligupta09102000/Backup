package com.springcrud.crudinspring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springcrud.crudinspring.service.UserService;


@RestController
@RequestMapping("/company")
public class CompanyController {

	private static List<Company> comp = new ArrayList<Company>();

	@Autowired
	private UserService userService;

	@GetMapping("/firststring")

	public String Display() {
		return userService.Dispaly();
	}

	@PostMapping("/addcomp")
	public String adddetails(Company c) {
//		comp.add(new Company(1,"ABC","abc@123gmail.com","acb"));
//		comp.add(new Company(2,"DFG","dfg@321gmail.com","jkl"));
		return userService.adddetails(c);
	}

	@GetMapping("/getcomp")
	public List<Company> getdetails() {
		return userService.getdetails();
	}

	@GetMapping("/getcomp/{id}")
	public Company getCompany(@PathVariable int id) {
		return userService.getCompany(id);
	}

	@DeleteMapping("/delcomp/{id}")
	public String deleteCompany(@PathVariable int id) {
		return userService.deleteCompany(id);
	}

	@PutMapping("/updatecomp/{id}")
	public String updateCompany(@PathVariable int id, @RequestBody Company c) {
		return userService.updateCompany(id, c);
	}

//	@PostMapping("/image")
//	public String addProfileImage(@RequestBody Image request) throws IOException {
//		byte[] imageData = Base64.decodeBase64(request.getImage());
//		// System.out.println(encodedString);
//		return "k";
//
//	}
	@Autowired
	private ImageRepiso imageRepository;

	@PostMapping("/images")
	public ResponseEntity<String> saveImage(@RequestParam("file") MultipartFile file) throws IOException {
	    // Check if the uploaded file is empty
	    if (file.isEmpty()) {
	        return ResponseEntity.badRequest().body("No file uploaded");
	    }

	    // Load the image data from the uploaded file
	    byte[] imageDataBytes = file.getBytes();

	    // Create an instance of the ImageData entity with the image data and metadata
	    Image imageDataEntity = new Image();
	    imageDataEntity.setImageData(imageDataBytes);
	    // Set additional metadata fields (e.g. filename, content type, etc.)

	    // Save the entity to the database
	    imageRepository.save(imageDataEntity);

	    return ResponseEntity.ok("Image saved successfully");
	}

}
