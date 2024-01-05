//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import web.dao.UserDAO;
//import web.model.User;
//
//import java.util.List;
//
//@Service
//@Transactional(readOnly = true)
//public class UserServiceImpl implements UserService {
//
//    private final UserDAO userDAO;
//
//    @Autowired
//    public UserServiceImpl(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return userDAO.getAllUsers();
//    }
//
//    @Override
//    public void addUser(User user) {
//        userDAO.addUser(user);
//    }
//
//    @Override
//    public void deleteUser(long userId) {
//        userDAO.deleteUser(userId);
//    }
//
//    @Override
//    public void updateUser(long userId, User updateUser) {
//        userDAO.updateUser(userId, updateUser);
//    }
//
//    @Override
//    public User getUserById(long userId) {
//        return userDAO.getUserById(userId);
//    }
//}
