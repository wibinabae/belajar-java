package com.relearner.main;

import com.relearner.model.User;
import com.relearner.service.UserService;
import com.relearner.service.UserServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public  static void main(String[] args){
        UserService userService = new UserServiceImpl();

        //Tambah user
        userService.addUser(new User(1L, "Syarif Hidayat", "syarifh@gmail.com", LocalDate.of(2001,06,02),"Admin"));
        userService.addUser(new User(2L, "Dewi Sintya", "dewsin@gmail.com", null, "Users"));
        userService.addUser(new User(3L, "Hidayat", "syarifh@gmail.com", LocalDate.of(2002,06,02),"Admin"));

        //Tampilkan semua user
        System.out.println(userService.getAllUsers());

        //Update user
//        userService.updateUser(2L, "Ani Updated", null);
//        System.out.println(userService.getAllUsers());

//        userService.deleteUser(2L);
//        System.out.println(userService.getAllUsers());

        List<User> admins = userService.getByRole("Admin");
        admins.forEach(System.out::println);

    }
}
