package com.relearner.service;

import com.relearner.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book){books.add(book);};

    @Override
    public List<Book> getAllBooks(){
        return books;
    }

    @Override
    public List<Book> getBookByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getBookByType(String type) {
        return books.stream().filter(book -> book.getType().equals(type)).toList();
    }

    @Override
    public Book getBookById(Long id) {
        return null;
    }
}
