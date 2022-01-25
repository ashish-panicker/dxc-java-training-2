package com.dxc.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "teachers")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_specialization")
    private String specialization;

    @Column(name = "t_email")
    private String email;

    @Column(name = "t_phone")
    private String phone;

    @Embedded
    private Address address;
    

}
