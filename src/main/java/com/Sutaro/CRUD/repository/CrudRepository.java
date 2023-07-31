package com.Sutaro.CRUD.repository;

import com.Sutaro.CRUD.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<EmployeeEntity, Long> {
}
