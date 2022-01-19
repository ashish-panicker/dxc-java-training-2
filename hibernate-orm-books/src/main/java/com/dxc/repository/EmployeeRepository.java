package com.dxc.repository;

import java.util.List;
import java.util.Optional;
import com.dxc.modal.Employee;

public interface EmployeeRepository {

    public Employee save(Employee employee);

    public Optional<Employee> findById(int id);

    public void update(Employee employee);

    public void delete(Employee employee);

    public void deleteById(int id);

    public void deleteAll();

    public List<Employee> findAll();

    
}
