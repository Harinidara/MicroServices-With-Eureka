package com.createemployee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.createemployee.entities.Employee;
@Repository
public interface EmployeeCreateDao extends JpaRepository<Employee, Integer>{

}
