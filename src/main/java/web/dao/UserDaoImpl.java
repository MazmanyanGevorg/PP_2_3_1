//package web.dao;
//
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//import web.model.User;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
////@Repository
//@Component
//@Transactional(readOnly = true)
//public class UserDaoImpl implements UserDAO {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<User> getAllUsers() {
//        return entityManager
//                .createQuery("SELECT u FROM User u", User.class)
//                .getResultList();
//    }
//
//    @Override
//    @Transactional
//    public void addUser(User user) {
//        entityManager.persist(user);
//    }
//
//    @Override
//    @Transactional
//    public void deleteUser(@Param("id") long userId) {
//        entityManager.remove(getUserById(userId));
//    }
//
//    @Override
//    @Transactional
//    public void updateUser(long userId, User updateUser) {
//        entityManager.merge(updateUser);
//    }
//
//    @Override
//    public User getUserById(long userId) {
//        TypedQuery<User> a = entityManager.createQuery(
//                "select u from User u where u.id = :userId", User.class
//        );
//        a.setParameter("userId", userId);
//        return a.getResultList().stream().findAny().orElse(null);
//    }
//}
