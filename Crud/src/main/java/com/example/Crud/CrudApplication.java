package com.example.Crud;

import com.example.Crud.DAO.EmployeeDAO;
import com.example.Crud.DAO.EmployeeDAOInterface;
import com.example.Crud.Entity.EmployeeDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner clr(EmployeeDAOInterface employeeDAOInterface){
		return runner -> {
			createEmployee(employeeDAOInterface);
			System.out.println(findEmployee(employeeDAOInterface));
		};
	}

	private void createEmployee(EmployeeDAOInterface employeeDAOInterface) {
		EmployeeDetails employeeDetails = new EmployeeDetails("Virat","Kohli");
		employeeDAOInterface.save(employeeDetails);
		System.out.println("New employee generated "+employeeDetails.getId());
	}

	private EmployeeDetails findEmployee(EmployeeDAOInterface employeeDAOInterface){
		return employeeDAOInterface.findById(1);
	}


}
