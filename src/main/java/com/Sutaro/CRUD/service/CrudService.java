package com.Sutaro.CRUD.service;

import com.Sutaro.CRUD.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface CrudService {
    List<EmployeeEntity> findAllEmployee();

    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(Long id);
}
