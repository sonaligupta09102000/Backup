package com.deskbook.SecurityDeskbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deskbook")
public class DeskBookController {

	@GetMapping
	public Object test() {

		return """
				{
				       "message":"This is DeskBook API"

				}
				""";
	}
}
