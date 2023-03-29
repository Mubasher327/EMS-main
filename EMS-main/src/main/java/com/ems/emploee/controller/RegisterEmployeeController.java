package com.ems.emploee.controller;

import com.ems.emploee.entity.Employee;
import com.ems.emploee.model.EmployeeModel;
import com.ems.emploee.services.RegisteredEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/Employee")
public class RegisterEmployeeController {
    @Autowired
    RegisteredEmployeeService registeredEmployeeServices;
    @PostMapping("/save")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employeeModel)
    {
        return registeredEmployeeServices.addEmployee(employeeModel);
    }
@PutMapping("/update")
    public void updateEmployee(@RequestBody Employee employee)
{
        registeredEmployeeServices.updateEmployee(employee);
    }
@DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int empl_id){
       return registeredEmployeeServices.deleteEmployee(empl_id);
}

@GetMapping("/getById/{id}")

   public Employee getEmployee(@PathVariable("id") int empl_Id)
    {
        return registeredEmployeeServices.getEmployee(empl_Id);
}


}
