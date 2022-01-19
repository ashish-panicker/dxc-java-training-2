package com.dxc;

import java.time.LocalDate;
import com.dxc.modal.Employee;
import com.dxc.repository.EmployeeRepository;
import com.dxc.repository.EmployeeRepositoryImpl;
import com.dxc.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        // employeeRepository.findById(3).ifPresentOrElse(emp -> System.out.println(emp),
                // () -> System.out.println("Employee not found"));
        employeeRepository.findAll().forEach(e -> System.out.println(e));

    }

    static void createEmployee() {
        Employee employee = new Employee("John", "Smith", "j.smith", "0123124", LocalDate.now(),
                "SA_REP", 5999.0f, 1.35f, 0, 10);
        Employee employee1 = new Employee("Jane", "Oliver", "j.oliver", "012346679",
                LocalDate.now(), "SA_MGR", 8999.0f, 2.10f, 0, 10);


        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        employee = employeeRepository.save(employee);
        System.out.println(employee);
        employee1 = employeeRepository.save(employee1);
        System.out.println(employee1);
    }
}
