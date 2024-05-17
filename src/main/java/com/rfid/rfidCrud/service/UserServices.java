package com.rfid.rfidCrud.service;

import com.rfid.rfidCrud.model.User;

import java.util.List;

public interface UserServices {
    //get add user
    public User addUser(User user);

    // get update or edit  by id
    public User editUser(String id);

    // get User by id
    public User getAllUserById(String id);

    // get All List from user
    public List<User> getUsers();

    // Delete User by Id

    public User deleteUser(String id);
}
