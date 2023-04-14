package com.onerivet.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onerivet.dtoemployee.EmployeeDto;
import com.onerivet.entity.Emplyee;
import com.onerivet.repisotry.EmployeeRepisotry;

@Service
public class EmployeeImplies implements EmployeeService {
	
	@Autowired
	private EmployeeRepisotry employeerepisotry;
	
	@Autowired
	private ModelMapper modelMapper;
	
	//Entity to DTO conversion
	private EmployeeDto emptoempdto(Emplyee emp)
	{
		EmployeeDto employeedto=this.modelMapper.map(emp,EmployeeDto.class);
		return employeedto;
	}
	
	//DTO to Entity Conversion
	private Emplyee employeedtotoemp(EmployeeDto employeedto)
	{
		Emplyee emp=this.modelMapper.map(employeedto, Emplyee.class);
		return emp;
	}

	
	@Override
	public String addemp(EmployeeDto emp) {
		Emplyee savesall = employeerepisotry.save(this.employeedtotoemp(emp));
		return "SuccessFully";
	}

	@Override
	public List<EmployeeDto> getallemp() {
		
		 List<Emplyee> findAll = employeerepisotry.findAll();
		 return findAll.stream().map(x->emptoempdto(x)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto getbyid(int id) {
		Emplyee emp = employeerepisotry.findById(id).get();
		return this.emptoempdto(emp);
	}

	@Override
	public String deletebyid(int id) {
		employeerepisotry.deleteById(id);
		return "Delete By Id Success";
	}

	
	@Override
	public String updatebyid(int id, EmployeeDto emp) {
		//String emp1 =  addemp(employeedto);
			Emplyee emp1 = employeerepisotry.findById(id).get();
			//if(emp1.getId()==emp.getId())
			//if(emp1.equals(id))
			//{
			emp1.setFirstName(emp.getFirstName());
			emp1.setLastName(emp.getFirstName());
			emp1.setAddress(emp.getAddress());
			emp1.setEmailId(emp.getEmailId());
			emp1.setAge(emp.getAge());
			emp1.setEmailId(emp.getPassword());
		
			employeerepisotry.save(emp1);
		    return "Successfully Updated";
			//}
			//else
			//{
				//return "Not found such id";
			//}
	}

	@Override
	public List<EmployeeDto> findbyfirstname(String firstName) {
		
		List<Emplyee> getbyfirstname = employeerepisotry.getbyfirstname(firstName);
		
		return getbyfirstname.stream().map(x->emptoempdto(x)).collect(Collectors.toList());
	}

}
