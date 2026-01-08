package com.relearner.model;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private String role;

    //Constructor
    public User(Long id, String name, String email, LocalDate dob, String role){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.role = role;
    }

    //Getter
    public  Long getId(){
        return id;
    }

    public  String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public LocalDate getDob(){
        return dob;
    }

    public String getRole(){
        return role;
    }
    //Setter
    public void setName(String name){
        if (name==null || name.isEmpty()){
            throw new IllegalArgumentException("Nama Gaboleh Kosong Iiiih Kamu...");
        }
        this.name = name;
    }
    public void setEmail(String email) {

        this.email = email;
    }

    public void setDob(LocalDate dob){
        this.dob = dob;
    }

    public void setRole(String role){
        this.role = role;
    }

    // toString biar gampang print di Console
    @Override
    public String toString(){
        return "User{"+
                "id="+id +
                ", name'"+name+'\''+
                ", role'"+role+'\''+
                ", email='"+email+'\''+
                ", dob = "+dob+
                '}';
    }
}
