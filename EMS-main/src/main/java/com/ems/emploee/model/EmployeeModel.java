package com.ems.emploee.model;
import com.ems.emploee.entity.Employee;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmployeeModel {
    private int empl_Id;
    private String first_name;
    private String last_name;
    private int age;
    private String designation;
    private double salary;
    private DepartmentModel departmentModel;


public Employee dissamble(){

    Employee employee=new Employee();
    employee.setId(empl_Id);
    employee.setFirstName(first_name);
    employee.setLastName(last_name);
    employee.setAge(age);
    employee.setDesignation(designation);
    employee.setSalary(salary);
    employee.setDepart(departmentModel.dissamble());
    ;
    return employee;
}

public EmployeeModel assemble(Employee employee){

    EmployeeModel employeeModel=new EmployeeModel();

    employeeModel.setEmpl_Id(employee.getId());
    employeeModel.setFirst_name(employee.getFirstName());
    employeeModel.setLast_name(employee.getLastName());
    employeeModel.setAge(employee.getAge());
    employeeModel.setDesignation(employee.getDesignation());
    employeeModel.setSalary(employee.getSalary());
    employeeModel.setDepartmentModel(departmentModel.assemble(employee.getDepart()));

    return employeeModel;
    }
}

