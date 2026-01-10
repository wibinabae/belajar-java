package com.relearner.service;

import com.relearner.model.Book;
import com.relearner.model.BookType;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getAllBooks();
    List<Book> getBookByAuthor(String author);
    List<Book> getBookByType(BookType type);
    Book getBookById(Long id);

}
