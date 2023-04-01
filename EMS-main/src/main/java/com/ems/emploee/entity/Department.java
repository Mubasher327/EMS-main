package com.ems.emploee.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="depart_id")
    private int Id;
    @Column(name="depart_name")
    private String departName;
    @Column(name="description")
    private String description;
    @Column(name="salary_range")
    private double salaryRange;
    @OneToMany(mappedBy = "depart")
    private List<Employee> employ_list;
}
