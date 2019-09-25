package com.example.delete.models;


public class DepartmentRejectionDto {
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public DepartmentRejectionDto(Long studentId, Long departmentId, Long companyId) {
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.companyId = companyId;
    }

    public Long studentId;
    public Long departmentId;
    public Long companyId;
}
