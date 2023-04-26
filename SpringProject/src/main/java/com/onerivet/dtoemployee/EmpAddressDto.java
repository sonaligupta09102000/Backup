package com.onerivet.dtoemployee;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmpAddressDto {
	@JsonView(value = {View.External.class})
	private String city;
	@JsonView(value = {View.External.class})
	private String state;
	@JsonView(value = {View.External.class})
	private int pincode;
}
