package com.dxc.dao;

public class AppDao {

    private AppDataSource dataSource;

    public void setDataSource(AppDataSource dataSource) {
        this.dataSource = dataSource;
    }
    public AppDataSource getDataSource() {
        return dataSource;
    }
}
