package com.ems.emploee.model;

import com.ems.emploee.entity.Department;
import com.ems.emploee.entity.Employee;
import com.ems.emploee.services.RegisteredEmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Data
public class DepartmentModel {
    int id;
    private String depart_name;
    private String description;
    private double salary_range;

    public Department dissamble(){
        Department department=new Department();

        department.setDepartName(depart_name);
        department.setId(id);
        department.setDescription(description);
        department.setSalaryRange(salary_range);


        return department;
    }

    public DepartmentModel assemble(Department department){

        DepartmentModel departmentModel=new DepartmentModel();
        departmentModel.setId(department.getId());
        departmentModel.setDepart_name(department.getDepartName());
        departmentModel.setDescription(department.getDescription());
        departmentModel.setSalary_range(department.getSalaryRange());

        return departmentModel;
    }
}

