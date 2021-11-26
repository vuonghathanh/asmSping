package com.example.asm_iasf.responsitory;

import com.example.asm_iasf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
