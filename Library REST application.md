# Library REST application

Create a new Sprign boot project with the name `library-rest-app`. The application should have the following entity classes.
```java
class Author{
        private Integer id
        private String name
        private String email
        private LocalDate creationDate
}

class Book{
        private Integer id
        private String title
        private String isbn
        private LocalDate publicationDate
}

```

The applciation should have the following controllers with the following endpoints.

```
    AuthorController

    GET 		/authors		    all authors
    GET		    /authors/{id}	    author with the id
    POST		/authors		    create a new author
    PUT		    /authors/{id}	    update the author with the id
    DELETE	    /authors/{id}	    delete the author with the id


    BooksController

    GET 		/books		    all books
    GET		    /books/{id}	    book with the id
    POST		/books		    create a new book
    PUT		    /books/{id}	    update the book with the id
    DELETE	    /books/{id}	    delete the book with the id
```
