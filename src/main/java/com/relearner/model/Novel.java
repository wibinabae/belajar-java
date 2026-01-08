package com.relearner.model;

import java.time.LocalDate;

public class Novel extends Book{
    private String genre;
    public Novel(Long id, String title, String author, LocalDate publishedDate, String genre){
        super(id, title, author, BookType.NOVEL, publishedDate);
        this.genre = genre;
    }

    @Override
    public String getDescription() {
        return "[Novel] " + getTitle() + " by " + getAuthor() +
                " | Published: " + getPublishedDate() + " | Genre: " + genre;
    }
}
