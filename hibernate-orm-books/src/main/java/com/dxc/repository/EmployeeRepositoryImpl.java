package com.dxc.repository;

import java.util.List;
import java.util.Optional;
import com.dxc.modal.Employee;
import com.dxc.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private SessionFactory sessionFactory;

    public EmployeeRepositoryImpl() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Employee save(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        return employee;

    }

    @Override
    public Optional<Employee> findById(int id) {
        Session session = sessionFactory.openSession();
        Optional<Employee> empOptional = Optional.ofNullable(session.get(Employee.class, id));
        session.close();
        return empOptional;
    }

    @Override
    public void update(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Employee employee) {
        

    }

    @Override
    public void deleteById(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Employee> findAll() {
        Session session = sessionFactory.openSession();
        List<Employee> employees = session.createQuery("from Employee e").list();
        session.close();
        return employees;

    }

}
