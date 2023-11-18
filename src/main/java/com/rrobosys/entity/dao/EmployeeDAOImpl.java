package com.rrobosys.entity.dao;

import com.rrobosys.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    //Entity Manager

    private EntityManager entityManager;


    // Constructor injecions
    @Autowired
    private Employee employee;


    @Override
    public List<Employee> findAll() {


    }
}
