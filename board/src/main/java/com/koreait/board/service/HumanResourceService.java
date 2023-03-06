package com.koreait.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.board.repository.DepartmentRepository;
import com.koreait.board.repository.EmployeeRepository;

@Service
public class HumanResourceService {
    
    @Autowired private EmployeeRepository employeeRepository;
    @Autowired private DepartmentRepository departmentRepository;


}
