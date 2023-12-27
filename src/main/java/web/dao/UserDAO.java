package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(long userId);

    void updateUser(User user);

    Object getUserById(long userId);
}
