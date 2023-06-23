package com.onerivet.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.onerivet.models.Employee;
import com.onerivet.repositry.EmployeeRepositry;

@ExtendWith(MockitoExtension.class)
class EmployeeImplTest {

	@Mock
	private EmployeeRepositry employeerepositry;

//	@Mock
//	private EmployeeImpl employeeImpl;

	private EmployeeImpl employeeImpl;

	private Employee employee;

	@BeforeEach
	void setUp() throws Exception {
		this.employeeImpl = new EmployeeImpl(this.employeerepositry);
		employee = Employee.builder().id(2).userName("sonali").password("sonali09").emailId("sonali@gmail.com")
//				.id(2)
//				.userName("abc")
//				.emailId("abc09@gmail.com")
//				.password("123")
				.build();
	}

	@Test
	void testAddEmp() {
//		fail("Not yet implemented");
		mock(Employee.class);
		mock(EmployeeImpl.class);
		when(this.employeerepositry.save(employee)).thenReturn(employee);
		Employee addEmp1 = this.employeeImpl.addEmp(employee);
		Employee addEmp = this.employeeImpl.addEmp(employee);
		System.out.println(addEmp);
		System.out.println(addEmp1);
		assertEquals(employee, addEmp);

	}

	@Test
	void testGetAllEmp() {
		// fail("Not yet implemented");
		mock(Employee.class);
		mock(EmployeeImpl.class);
		Employee emp1 = new Employee(1, "so", "wrtt", "ss@gamil.com");
		Employee emp2 = new Employee(3, "aaa", "eeee", "ee@gmail.com");
		List<Employee> employees = Arrays.asList(emp1, emp2);
		when(this.employeerepositry.findAll()).thenReturn(employees);
		List<Employee> allEmp = this.employeeImpl.getAllEmp();
		System.out.println(allEmp);
		//assertEquals(employee, allEmp);
		assertEquals(employees.get(0).getId(), allEmp.get(0).getId());
		assertEquals(employees.get(1).getUserName(),allEmp.get(1).getUserName());
	}

	@Test
	void testGetById() {
		// fail("Not yet implemented");
		mock(Employee.class);
		mock(EmployeeImpl.class);
		when(this.employeerepositry.findById(2)).thenReturn(Optional.of(employee));
		Employee employee2 = this.employeeImpl.getById(2);
		System.out.println(employee2);
		assertEquals(employee, employee2);

	}

	@Test
	void testUpdateByEmployee() {
		// fail("Not yet implemented");
		mock(Employee.class);
		mock(EmployeeImpl.class);
		when(this.employeerepositry.findById(2)).thenReturn(Optional.of(employee));
		when(this.employeerepositry.save(employee)).thenReturn(employee);
		Employee updateEmp = new Employee();
		updateEmp.setId(2);
		updateEmp.setUserName("Selin");
		updateEmp.setPassword("selin09");
		updateEmp.setEmailId("selin@gmail.com");
		Employee updateByEmployee = this.employeeImpl.updateByEmployee(2, updateEmp);
		System.out.println(updateByEmployee);
		assertEquals(employee, updateByEmployee);
//		assertEquals(2,updateEmp.getId());
//		assertEquals("Selin", updateEmp.getUserName());
//		verify(employeerepositry,times(1)).findById(2);
//		verify(employeerepositry,times(1)).save(employee);
	}

	@Test
	void testDeleteEmployee() {
		// fail("Not yet implemented");
		mock(Employee.class);
		mock(EmployeeImpl.class);
		when(this.employeerepositry.findById(2)).thenReturn(Optional.of(employee));
		this.employeeImpl.deleteEmployee(2);
		verify(employeerepositry, times(1)).deleteById(2);
	}

}
