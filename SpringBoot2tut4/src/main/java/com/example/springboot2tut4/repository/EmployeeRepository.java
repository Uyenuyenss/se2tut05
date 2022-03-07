package com.example.springboot2tut4.repository;

import com.example.springboot2tut4.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
