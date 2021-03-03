package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;



@Service
public class BookStorage {
    private BookRepository books;

    public BookStorage(BookRepository books){
        this.books = books;
    }

    public void addBook(Book book){
        books.save(book);
    }

}
