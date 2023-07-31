package com.Sutaro.CRUD.service.impl;

import com.Sutaro.CRUD.entity.EmployeeEntity;
import com.Sutaro.CRUD.repository.CrudRepository;
import com.Sutaro.CRUD.service.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudServiceImpl implements CrudService {

    private final CrudRepository crudRepository;

    public CrudServiceImpl(CrudRepository crudRepository){
        this.crudRepository = crudRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return crudRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return crudRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return crudRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return crudRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        crudRepository.deleteById(id);
    }
}
