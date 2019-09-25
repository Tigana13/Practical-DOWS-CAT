package com.example.delete.models;


public class Attachment {
    private Long id;
    private Company company;
    private  Department department;
    private  Boolean rejected;

    public Attachment(Long id, Company company, Department department, Boolean rejected) {
        this.id = id;
        this.company = company;
        this.department = department;
        this.rejected = rejected;
    }

    public Long getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public Department getDepartment() {
        return department;
    }

    public Boolean getRejected() {
        return rejected;
    }
}
