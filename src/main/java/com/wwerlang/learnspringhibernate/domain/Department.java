package com.wwerlang.learnspringhibernate.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "department")
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int id;

    @Column(name = "department_name")
    private String name;

    @Column(name = "department_description")
    private String description;

}
