package com.dxc;

import java.sql.SQLException;
import java.util.List;
import com.dxc.dao.BookDao;
import com.dxc.model.Book;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        findAllBooks();
    }

    static void findAllBooks(){
        
        BookDao dao = new BookDao();
        try {
            List<Book> books = dao.findAll();
            if (books.size() == 0) {
                System.out.println("No books found");
                return;
            }
            books.forEach(bk -> System.out.println(bk));
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

    }

    static void createBooks() {
        Book animalFarm = new Book("Animal Farm", "George Orwell", "978-0-395-19395-8");
        Book dune = new Book("Dune", "Frank Herbert", "978-0-553-37704-3");
        Book theHobbit = new Book("The Hobbit", "J.R.R. Tolkien", "978-0-395-19395-8");
        Book theLordOfTheRings =
                new Book("The Lord of the Rings", "J.R.R. Tolkien", "978-0-395-19395-8");
        Book theSilmarillion = new Book("The Silmarillion", "J.R.R. Tolkien", "978-0-395-19395-8");
        Book theChroniclesOfNarnia =
                new Book("The Chronicles of Narnia", "C.S. Lewis", "978-0-395-19395-8");

        List<Book> books = List.of(animalFarm, dune, theHobbit, theLordOfTheRings, theSilmarillion,
                theChroniclesOfNarnia);
        BookDao bookDao = new BookDao();

        books.forEach(bk -> {
            try {
                int rows = bookDao.save(bk);
                System.out.println("Rows affected: " + rows);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        });
    }
}
