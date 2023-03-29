package com.ems.emploee.model;
import com.ems.emploee.entity.Attendance;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AttendanceModel {
    private int id;
    private Boolean is_emplPresent;
    private int time_in;
    private int time_out;

    private EmployeeModel employeeModel;

    public Attendance dissamble(){

        Attendance attendance=new Attendance();
        attendance.setId(id);
        attendance.setIs_emplPresent(is_emplPresent);
        attendance.setTimeIn(time_in);
        attendance.setTimeOut(time_out);
        attendance.setEmploy(employeeModel.dissamble());
        return attendance;

    }
    public AttendanceModel assemble(Attendance attendance){

        AttendanceModel attendanceModel=new AttendanceModel();

        attendanceModel.setId(attendance.getId());
        attendanceModel.setIs_emplPresent(attendance.getIs_emplPresent());
        attendanceModel.setTime_in(attendance.getTimeIn());
        attendanceModel.setTime_out(attendance.getTimeOut());
        attendanceModel.setEmployeeModel(employeeModel.assemble(attendance.getEmploy()));

        return attendanceModel;
    }
}
