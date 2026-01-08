package com.relearner.main;

import com.relearner.model.Book;
import com.relearner.model.BookType;
import com.relearner.model.Ebook;
import com.relearner.model.Novel;
import com.relearner.service.BookService;
import com.relearner.service.BookServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class BookMain {
    public static void main(String[] args){
        BookMain app = new BookMain();
        app.run();
    }

    public void run(){
        List<Book> books = dataDummy();


//        books.forEach(System.out::println);

        List<Book> ebooks = books.stream().filter(book -> book.getType().equals(BookType.EBOOK)).toList();
        ebooks.forEach(System.out::println);
    }

    private List<Book> dataDummy(){
        return List.of(
                new Ebook(1L, "Java Dasar", "Syarif Hidayat", LocalDate.of(2025, 6, 1), 5.5),
                new Novel(2L, "Perjalanan Menuju Cinta Sejati", "Syarif", LocalDate.of(2024, 6, 7), "Romantis"),
                new Ebook(3L, "Python untuk Pemula", "Aisyah Nur", LocalDate.of(2023, 3, 15), 4.2),
                new Novel(4L, "Hujan di Bulan Juni", "Tere Liye", LocalDate.of(2021, 7, 20), "Drama"),
                new Ebook(5L, "React JS Step by Step", "Andi Wijaya", LocalDate.of(2022, 11, 5), 6.3),
                new Novel(6L, "Petualangan di Pulau Java", "Dewi Lestari", LocalDate.of(2020, 9, 10), "Petualangan"),
                new Ebook(7L, "Mindset Positif", "Carol Dweck", LocalDate.of(2019, 5, 22), 3.7),
                new Novel(8L, "Cinta di Bawah Hujan", "Mira W.", LocalDate.of(2018, 12, 1), "Romantis"),
                new Ebook(9L, "Algoritma dan Struktur Data", "Syarif Hidayat", LocalDate.of(2017, 2, 28), 7.0),
                new Novel(10L, "Filosofi Hidup Stoik", "Marcus Aurelius", LocalDate.of(2016, 4, 17), "Filsafat"),
                new Ebook(11L, "Belajar GoLang", "Rizky Pratama", LocalDate.of(2025, 1, 10), 5.9),
                new Novel(12L, "Detektif Cilik", "Agatha Christie", LocalDate.of(2024, 8, 12), "Misteri"),
                new Ebook(13L, "Spring Boot untuk Pemula", "Syarif Hidayat", LocalDate.of(2023, 6, 9), 6.5),
                new Novel(14L, "Novel Petualangan Hutan", "Dewi Lestari", LocalDate.of(2022, 10, 3), "Petualangan"),
                new Ebook(15L, "Belajar Data Science", "Andi Wijaya", LocalDate.of(2021, 11, 11), 8.1),
                new Novel(16L, "Cinta & Persahabatan", "Mira W.", LocalDate.of(2020, 5, 22), "Romantis"),
                new Ebook(17L, "Desain UI/UX", "Siti Aminah", LocalDate.of(2019, 2, 28), 4.8),
                new Novel(18L, "Filosofi Teras", "Henry Manampiring", LocalDate.of(2018, 7, 5), "Filsafat"),
                new Ebook(19L, "Docker & Kubernetes", "Rizky Pratama", LocalDate.of(2017, 9, 10), 7.2),
                new Novel(20L, "Cerita Malam Hari", "Tere Liye", LocalDate.of(2016, 12, 1), "Drama")
        );

    }


    private static void printByType(BookService bookService, String type){
        System.out.println("=========="+type+"==========");
        bookService.getBookByType(type).forEach(System.out::println);
        System.out.println();
    }
}
