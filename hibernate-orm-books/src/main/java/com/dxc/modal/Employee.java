package com.dxc.modal;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "employee_id")
    public Integer employeeId;

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;

    @Column(name = "email")
    public String email;

    @Column(name = "phone_int")
    public String phoneNumber;

    @Column(name = "hire_date")
    public LocalDate hireDate;

    @Column(name = "job_id")
    public String jobId;

    @Column(name = "salary")
    public float salary;

    @Column(name = "commission_pct")
    public float commissionPct;

    @Column(name = "manager_id")
    public Integer managerId;

    @Column(name = "department_id")
    public Integer departmentId;

}
