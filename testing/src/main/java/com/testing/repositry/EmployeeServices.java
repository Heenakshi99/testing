package com.testing.repositry;

import java.util.List;

//import com.microservice.modal.Employee;
import com.testing.Entity.Employee;

public interface EmployeeServices {
	List<Employee> getAllEmployee();
	void save(Employee employee);
	Employee getById(Long id);
	void deleteViaId(long id);
}
