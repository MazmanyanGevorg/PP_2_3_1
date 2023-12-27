package web.dao;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class UserDaoImpl implements UserDAO{

    public User user;

    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImpl() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.user = (User) genericSuperclass
                .getActualTypeArguments()[0];
    }


    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.entityManager.persist(user);
    }

    @Override
    @Transactional
    public void deleteUser(@Param("id") long userId) {
        userId = this.entityManager.merge(userId);
        this.entityManager.remove(userId);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.entityManager.persist(user);
    }

    @Override
    public User getUserById(long userId) {
        return this.entityManager.find(User.class, userId);
    }
}
