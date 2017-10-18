package com.tecsup.lab10.services;

import com.tecsup.lab10.exception.DAOException;
import com.tecsup.lab10.exception.EmptyResultException;
import com.tecsup.lab10.model.Employee;

public interface EmployeeService {
	
	Employee find(int employee_id) throws DAOException, EmptyResultException;

}
