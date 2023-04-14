package com.onerivet.dtoemployee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpAddressDto {
	
	private String city;
	private String state;
	private int pincode;
}
