package com.testing.repositry;

import com.testing.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.microservice.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
