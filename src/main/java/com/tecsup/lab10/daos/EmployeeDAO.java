package com.tecsup.lab10.daos;

import com.tecsup.lab10.exception.DAOException;
import com.tecsup.lab10.exception.EmptyResultException;
import com.tecsup.lab10.model.Employee;

public interface EmployeeDAO {

	Employee findEmployee(int id) throws DAOException, EmptyResultException;

}
