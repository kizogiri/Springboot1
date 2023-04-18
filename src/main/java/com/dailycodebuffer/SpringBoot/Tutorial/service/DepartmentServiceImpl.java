/* a service is a Java class that provides the business logic for
 an application. The service layer is responsible for processing data
 from the repository and transforming it into a format that can be
 consumed by the presentation layer
-Create a new Java class and annotate it with @Service annotation
-Inject the repository into the service class using @Autowired annotation
 */
package com.dailycodebuffer.SpringBoot.Tutorial.service;
import com.dailycodebuffer.SpringBoot.Tutorial.entity.Department;
import com.dailycodebuffer.SpringBoot.Tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl  implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }
}
