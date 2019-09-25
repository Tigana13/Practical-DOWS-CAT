package com.example.delete;

import com.example.delete.models.Attachment;
import com.example.delete.models.Company;
import com.example.delete.models.DepartmentRejectionDto;
import com.example.delete.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class FeignBossApplication implements CommandLineRunner {
    public FeignBoss feignBoss;

    public FeignBossApplication(FeignBoss feignBoss){
        this.feignBoss = feignBoss;
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignBossApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student registeredStudent = feignBoss.register(new Student("087068", "Tigana Ochieng"));
        Long studentId = registeredStudent.getId();

        // Request attachment
        Attachment newAttachment = feignBoss.requestAttachment(studentId);
        Long departmentId = newAttachment.getId();

        //Request department
        Attachment department = feignBoss.requestDepartment(studentId, departmentId);

        Company company= department.getCompany();
        Long companyId = company.getId();

        DepartmentRejectionDto rejectionDto = new DepartmentRejectionDto(studentId, departmentId, companyId);
        //Reject department
        feignBoss.rejectDepartmentAllocation(rejectionDto);
    }
}
