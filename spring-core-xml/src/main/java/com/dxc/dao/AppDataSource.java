package com.dxc.dao;

import com.dxc.App;

public class AppDataSource {

    private String userName;

    private String password;

    private String url;

    private String driverClassName;

    public AppDataSource() {
        System.out.println("**********************************************************");
        System.out.println("\nInside AppDataSource constructor...\n");
        System.out.format("Username: %s Password: %s Url: %s DriverClassName: %s%n", userName,
                password, url, driverClassName);
        System.out.println("**********************************************************\n");
    }

    

    public AppDataSource(String userName, String password, String url, String driverClassName) {
        this.userName = userName;
        this.password = password;
        this.url = url;
        this.driverClassName = driverClassName;
        System.out.println("**********************************************************");
        System.out.println("\nInside AppDataSource constructor...\n");
        System.out.format("Username: %s Password: %s Url: %s DriverClassName: %s%n", userName,
                password, url, driverClassName);
        System.out.println("**********************************************************\n");
    }



    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return String.format("AppDataSource [driverClassName=%s, password=%s, url=%s, userName=%s]",
                driverClassName, password, url, userName);
    }


}
