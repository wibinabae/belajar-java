package com.relearner.model;

import java.time.LocalDate;

public class Book {
    private Long id;
    private String title, author;
    private BookType type;
    private LocalDate publishedDate;

    public Book(Long id, String title, String author, BookType type, LocalDate publishedDate){
        this.id =id;
        this.title = title;
        this.author = author;
        this.type = type;
        this.publishedDate = publishedDate;
    }

    //Getter
    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public BookType getType(){
        return type;
    }

    public LocalDate getPublishedDate(){
        return publishedDate;
    }

    // Setter
    public void setId(Long id){
        this.id = id;
    }

    public void setTitle(String title){
        if (title.isEmpty()){
            throw new IllegalArgumentException("Gaboleh kosong ih titlenya ....");
        }
        this.title = title;
    }

    public void setAuthor(String author){
        if (author.isEmpty()){
            throw new IllegalArgumentException("Masa buku gaada authornya si.. terus yang nulis siapa? .....");
        }
        this.author = author;
    }

    public void setType(BookType type){
        if (type == null){
            throw new IllegalArgumentException("Masukin type bukunya iih ...");
        }
        this.type = type;
    }

    public void setPublishedDate(LocalDate publishedDate){
        if (publishedDate.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Masa udah publish si, padahal sekarang aja masih tanggal " + LocalDate.now());
        }
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString(){
        return "Book{"+
                "id: "+id+
                "\ntitle: "+title+
                "\nauthor: "+author+
                "\ntype: "+type+
                "\npublished: "+publishedDate+"}\n";
    }
}
