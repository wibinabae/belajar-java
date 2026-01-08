package com.relearner.model;

import java.time.LocalDate;

public class Ebook extends Book{
    private double fileSizeMB;

    public Ebook(Long id, String title, String author, LocalDate publishedDate,double fileSizeMB){
        super(id, title, author, BookType.EBOOK, publishedDate);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getDescription() {
        return "[EBOOK] " + getTitle() + " by " + getAuthor() +
                " | Published: " + getPublishedDate() + " | Size: " + fileSizeMB + " MB";
    }
}
