package com.dxc.dao;

import java.sql.SQLException;
import java.util.List;
import com.dxc.model.Book;

public interface BookDao {
    
    int save(Book book) throws SQLException;

    List<Book> findAll() throws SQLException;
}
