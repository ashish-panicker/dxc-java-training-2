package com.dxc;

import com.dxc.dao.AppDao;
import com.dxc.dao.AppDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        // ctx.refresh();
        AppDao appDao = ctx.getBean("appDao", AppDao.class);
        System.out.println(appDao.getDataSource());
        ctx.registerShutdownHook();
    }
}
