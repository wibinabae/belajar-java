package com.relearner.main;

import com.relearner.model.Book;
import com.relearner.service.BookService;
import com.relearner.service.BookServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    String inputType, inputAuthor, inputTitle;
    Integer inputMenu;
    public static void main(String[] args){
        BookMain app = new BookMain();
        app.run();
    }

    public void run(){


        BookService bService = new BookServiceImpl();
        // Bikin data dummy
        createDataDummy(bService);

        // Input Output buat user
        inputUser(bService);

    }


    private static void printByType(BookService bookService, String type){
        System.out.println("========== "+type+" ==========");
        bookService.getBookByType(type).forEach(System.out::println);
        System.out.println();
    }

    private static void createDataDummy(BookService bService){
        bService.addBook(new Book(1L, "Buku Pertama di Tahun 2026", "Syarif Hidayat, S.Kom", "Pengembangan Diri", LocalDate.of(2025, 6, 9)));
        bService.addBook(new Book(2L, "Filosofi Teras", "Henry Manampiring", "Filsafat", LocalDate.of(2024, 8, 12)));
        bService.addBook(new Book(3L, "Manajemen Waktu Efektif", "Andi Wijaya", "Pengembangan Diri", LocalDate.of(2023, 3, 15)));
        bService.addBook(new Book(4L, "Meditasi Modern", "Siti Aminah", "Filsafat", LocalDate.of(2022, 11, 5)));
        bService.addBook(new Book(5L, "Novel Petualangan di Java", "Dewi Lestari", "Novel", LocalDate.of(2021, 7, 20)));
        bService.addBook(new Book(6L, "Berpikir Cepat dan Lambat", "Daniel Kahneman", "Filsafat", LocalDate.of(2020, 9, 10)));
        bService.addBook(new Book(7L, "Kebiasaan 7 Orang Sukses", "Stephen R. Covey", "Pengembangan Diri", LocalDate.of(2019, 5, 22)));
        bService.addBook(new Book(8L, "Novel Cinta di Bawah Hujan", "Mira W.", "Novel", LocalDate.of(2018, 12, 1)));
        bService.addBook(new Book(9L, "Filsafat Hidup Stoik", "Marcus Aurelius", "Filsafat", LocalDate.of(2017, 2, 28)));
        bService.addBook(new Book(10L, "Mindset: Psychology of Success", "Carol Dweck", "Pengembangan Diri", LocalDate.of(2016, 4, 17)));
    }

    public void inputUser(BookService bService){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("======= SELAMAT DATANG DI PERPUSTAKAAN SYARIF ===============");
        System.out.println("=== Silahkan pilih menu yang ada ===");
        System.out.println("1. Pencarian Buku \n2. Pencarian Buku Berdasarkan Type \n3.Pencarian Buku Berdasarkan Author");
        System.out.print("Masukan angka pada menu yang dipilih : ");
        inputMenu = keyboard.nextInt();
        keyboard.nextLine();
        switch (inputMenu){
            case 1 :
                System.out.print("Masukan keyword: ");
                inputTitle = keyboard.nextLine();
                System.out.println(inputTitle);
                break;
            case 2:
                System.out.print("Kamu mau cari buku type apa? ");
                inputType = keyboard.nextLine();
                printByType(bService, inputType);
                break;
            case 3:
                System.out.print("Nama author yang kamu cari siapa? ");
                inputAuthor = keyboard.nextLine();
                printByType(bService, inputAuthor);
                break;
            default:
                System.out.println("Hmmmm gajelas, kan di situ sudah di kasih tau, MASUKIN ANGKA YANG ADA DI MENU, emang di menu ada angka "+inputMenu+"????");
                break;
        }

    }
}
