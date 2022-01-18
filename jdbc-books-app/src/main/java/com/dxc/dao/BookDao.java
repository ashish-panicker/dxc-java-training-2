package com.dxc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.dxc.model.Book;


public class BookDao {

    private static final String INSERT_ONE_BOOK;

    private static final String SELECT_ALL_BOOKS;


    private static final String USER_NAME;
    private static final String PASSWORD;
    private static final String URL;


    static {
        INSERT_ONE_BOOK = "INSERT INTO books (title, author, isbn) VALUES (?, ?, ?)";
        SELECT_ALL_BOOKS = "SELECT * FROM books";

        USER_NAME = "root";
        PASSWORD = "password";

        // URL = "jdbc:mysql://server-name or server-ip-address:port/database-name";
        URL = "jdbc:mysql://localhost:3306/dxc";
    }

    public BookDao() {

    }

    public List<Book> findAll() throws SQLException{
        List<Book> books = null;
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
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

    public int save(Book book) throws SQLException {
        System.out.println("Saving book: " + book);

        // Load the JDBC Driver
        // Automatically done for version 8 and above
        // DriverManager.registerDriver(Driver.class);
        // Class.forName("com.mysql.cj.jdbc.Driver");

        // Get a connection to the database
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

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

}

