package com.dxc;

import java.time.LocalDate;
import com.dxc.modal.Employee;
import com.dxc.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee emp1 = new Employee(1, "John", "Smith", "John.smith", "1234567890",
                LocalDate.of(2019, 1, 1), "IT_PROG", 1000.0f, 0.0f, 1, 1);
        session.getTransaction().begin();
        session.save(emp1);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
