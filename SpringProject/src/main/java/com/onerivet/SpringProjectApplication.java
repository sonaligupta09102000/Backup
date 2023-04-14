package com.onerivet;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringProjectApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
//	@Autowired
//	private EmployeeRepisotry employeerepisotry;
//
//	@Override
//	public void run(String... args) throws Exception {
//	
//		Emplyee employee =new Emplyee(null, 1, "jimmy","shah","sonali09","jimmy09@gmail.com", null, "8945632541", 22);
//		
//		Department department=new Department(1,"computer",20000);
//		
//		employee.setDepartment_details(department);
//		
//		employeerepisotry.save(employee);
//		
//	}

}
