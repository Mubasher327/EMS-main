package com.ems.emploee.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "department")
public class Department {

    @Id
    @Column(name="depart_id")
    private int Id;
    @Column(name="depart_name")
    private String departName;
    @Column(name="description")
    private String description;
    @Column(name="salary_range")
    private double salaryRange;
    @OneToMany
    private List<Employee> employ_list;
    


}
