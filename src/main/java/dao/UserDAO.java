package dao;

import models.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void removeUserById(int id);
    User getUserById(int id);
    List<User> getAllUsers();
}
