package com.dxc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.dxc.model.Book;

public class BookDaoImpl implements BookDao {

    private DataSource dataSource;

    private static final String INSERT_ONE_BOOK;

    private static final String SELECT_ALL_BOOKS;

    static {
        INSERT_ONE_BOOK = "INSERT INTO books (title, author, isbn) VALUES (?, ?, ?)";
        SELECT_ALL_BOOKS = "SELECT * FROM books";
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int save(Book book) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement ps = connection.prepareStatement(INSERT_ONE_BOOK);
        ps.setString(1, book.getTitle());
        ps.setString(2, book.getAuthor());
        ps.setString(3, book.getIsbn());

        int rows = 0;
        rows = ps.executeUpdate();

        ps.close();
        connection.close();
        return rows;
    }

    @Override
    public List<Book> findAll() throws SQLException {

        Connection connection = dataSource.getConnection();
        List<Book> books;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(SELECT_ALL_BOOKS);
        books = new ArrayList();
        while (rs.next()) {
            books.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        rs.close();
        statement.close();
        connection.close();
        return books;
    }

}
