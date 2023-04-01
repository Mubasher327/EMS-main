package com.ems.emploee.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column private int Id;
    @Column(name="employee_present")
    private Boolean is_emplPresent;
    @Column(name="time_in")
    private int timeIn;
    @Column(name="time_out")
    private int timeOut;
    @ManyToOne @JoinColumn (name="empl_Id")
    private Employee employ;
}
