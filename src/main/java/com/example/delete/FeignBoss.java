package com.example.delete;

import com.example.delete.models.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "testing", url = "http://10.51.10.111:2000")
public interface FeignBoss {
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student register(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "companies/{companyId}/attachments")
    Attachment requestAttachment(@RequestParam Long companyId);

    @RequestMapping(method = RequestMethod.PATCH, value = "companies/{companyId}/attachments")
    Attachment requestDepartment(@RequestParam Long studentId, @RequestParam Long departmentId);

    @RequestMapping(method = RequestMethod.DELETE, value = "departments")
    Void rejectDepartmentAllocation(@RequestBody DepartmentRejectionDto departmentRejectionDto);

}
