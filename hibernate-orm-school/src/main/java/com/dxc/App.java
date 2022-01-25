package com.dxc;

import com.dxc.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HibernateUtil.getSessionFactory().openSession();
    }
}
