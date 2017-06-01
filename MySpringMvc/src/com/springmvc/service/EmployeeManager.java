package com.springmvc.service;

import java.util.List;

import com.springmvc.model.EmployeeVO;

public interface EmployeeManager {
	
    public List<EmployeeVO> getAllEmployees();
    
}
