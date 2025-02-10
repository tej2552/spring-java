package com.example.Crud.DAO;

import com.example.Crud.Entity.EmployeeDetails;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface{

    private EntityManager en;

    @Autowired
    public EmployeeDAO(EntityManager entityManager) {
        this.en = entityManager;
    }

    @Override
    @Transactional
    public void save(EmployeeDetails empDetails) {
        en.persist(empDetails);
    }

    @Override
    public EmployeeDetails findById(Integer id) {
        return en.find(EmployeeDetails.class, id);
    }
}
