package com.example.Crud.DAO;

import com.example.Crud.Entity.EmployeeDetails;

public interface EmployeeDAOInterface {

    void save(EmployeeDetails empDetails);
    EmployeeDetails findById(Integer id);
}
