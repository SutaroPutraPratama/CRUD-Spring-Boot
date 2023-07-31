package com.Sutaro.CRUD.controller;

import com.Sutaro.CRUD.entity.EmployeeEntity;
import com.Sutaro.CRUD.service.CrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CrudController {
    private final CrudService crudService;

    public CrudController(CrudService crudService){
        this.crudService = crudService;
    }

    @GetMapping
    public List<EmployeeEntity> findAllEmployee(){
        return crudService.findAllEmployee();
    }


    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id){
        return crudService.findById(id);
    }


    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return crudService.saveEmployee(employeeEntity);
    }


    @PutMapping("/update/{id}")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return crudService.updateEmployee(employeeEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        crudService.deleteEmployee(id);
    }
}
