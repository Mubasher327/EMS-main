package com.ems.emploee.services;

import com.ems.emploee.Repository.registeredemployeerepository;
import com.ems.emploee.entity.Employee;
import com.ems.emploee.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisteredEmployeeService {

 @Autowired
 private registeredemployeerepository registeremployeeRepo;



 public EmployeeModel addEmployee(EmployeeModel employee){
  return employee.assemble(registeremployeeRepo.save(employee.dissamble()));

 }
 public void updateEmployee(Employee employee){
  registeremployeeRepo.save(employee);

 }

 public String deleteEmployee(int empl_id){
  registeremployeeRepo.deleteById(empl_id);
  return "Deleted";
 }

 public EmployeeModel getEmployee(int empl_id){
  return new EmployeeModel().assemble(registeremployeeRepo.findById(empl_id).get());
 }

}
