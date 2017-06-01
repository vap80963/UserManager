package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.EmployeeVO;

public interface EmployeeDAO {
	
    public List<EmployeeVO> getAllEmployees();
    
}