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

    public Book getBookById(Long id) {
        if (books.findById(id).isPresent()) {
            return books.findById(id).get();
        }
        else{
            return null;
        }

    }

}
