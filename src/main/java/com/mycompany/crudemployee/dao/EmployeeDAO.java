package com.mycompany.crudemployee.dao;

import com.mycompany.crudemployee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
