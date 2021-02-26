package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookStorage {

    Map<String, Book> books;

    public BookStorage(){
        books = new HashMap<>();
    }

    public void addBook(Book book){
        books.put(book.getBookTitle(), book);
    }

}
