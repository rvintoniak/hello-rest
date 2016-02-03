package services;

import beans.User;

import java.util.List;

/**
 * Created by Roman on 04.02.2016.
 */
public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    void updateUser(User user);

    void removeUser(Long id);

    void addUser(User user);
}
