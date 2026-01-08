package com.relearner.service;

import com.relearner.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user){
        users.add(user);
    }

    @Override
    public  List<User> getAllUsers(){
        return users;
    }
    @Override
    public User getById(Long id){
        return users.stream().filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getByRole(String role){
        return  users.stream().filter(user -> user.getRole().equals(role)).toList();
    }

    @Override
    public void updateUser(Long id, String name, String email){
        User user = getById(id);
        if(user !=null){
            user.setName(name);
        }
        if (email !=null){
            user.setEmail(email);
        }
    }

    @Override
    public void deleteUser(Long id){
        users.removeIf(user -> user.getId().equals(id));
    }
}
