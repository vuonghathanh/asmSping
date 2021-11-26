package com.example.asm_iasf.service;

import com.example.asm_iasf.entity.Employee;
import com.example.asm_iasf.responsitory.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee createEaffee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> findAllEprisees() {
        return employeeRepo.findAll();
    }
}
