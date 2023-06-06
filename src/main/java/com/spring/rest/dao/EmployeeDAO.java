package com.spring.rest.dao;

import com.spring.rest.entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    Employee getEmployee(int id);

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public void deleteEmployee(int id);
}
