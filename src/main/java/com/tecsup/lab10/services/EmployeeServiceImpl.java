package com.tecsup.lab10.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.lab10.daos.EmployeeDAO;
import com.tecsup.lab10.exception.DAOException;
import com.tecsup.lab10.exception.EmptyResultException;
import com.tecsup.lab10.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee find(int employee_id) throws DAOException, EmptyResultException {
		
		Employee emp = employeeDAO.findEmployee(employee_id);

		return emp;
	}
}
