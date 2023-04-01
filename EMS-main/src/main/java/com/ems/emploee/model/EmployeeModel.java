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

    public static String addAttribute(String employee, EmployeeModel employeeModel)
    {
        return "Employee registered Successfully";
    }


    public Employee dissamble(){

    Employee employee=new Employee();
    employee.setId(empl_Id);
    employee.setFirstName(first_name);
    employee.setLastName(last_name);
    employee.setAge(age);
    employee.setDesignation(designation);
    employee.setSalary(salary);
    employee.setDepart(this.departmentModel.dissamble());

    return employee;
}

public EmployeeModel assemble(Employee employee){

    EmployeeModel employeeModel=new EmployeeModel();
    DepartmentModel departmentModel1=new DepartmentModel();

    employeeModel.setEmpl_Id(employee.getId());
    employeeModel.setFirst_name(employee.getFirstName());
    employeeModel.setLast_name(employee.getLastName());
    employeeModel.setAge(employee.getAge());
    employeeModel.setDesignation(employee.getDesignation());
    employeeModel.setSalary(employee.getSalary());
    employeeModel.setDepartmentModel(departmentModel1.assemble(employee.getDepart()));

    return employeeModel;
    }
}

