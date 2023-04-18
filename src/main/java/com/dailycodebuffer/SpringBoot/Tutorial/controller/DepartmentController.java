package com.dailycodebuffer.SpringBoot.Tutorial.controller;
import com.dailycodebuffer.SpringBoot.Tutorial.entity.Department;
import com.dailycodebuffer.SpringBoot.Tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {


    @Autowired
    //making object
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/department")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();

    }
}




/*

 */
