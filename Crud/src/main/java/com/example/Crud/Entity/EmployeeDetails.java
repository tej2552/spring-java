package com.example.Crud.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "emp_data")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "f_name")
    private String fName;

    @Column(name = "l_name")
    private String lName;

    public EmployeeDetails() {
    }

    public EmployeeDetails(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Emp {" +
                "id = " +id+
                ", firstName = " +fName+
                ", lastName = " +lName+
                "}";
    }
}
