package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(long userId);

    void updateUser(long userId, User updateUser);

    User getUserById(long userId);
}
