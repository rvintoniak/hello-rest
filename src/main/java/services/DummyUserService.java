package services;

import beans.User;

import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 04.02.2016.
 */

@RequestScoped
public class DummyUserService implements UserService {

    private static List<User> users = new ArrayList<User>(){{
        add(new User((long) 1,"roman1", "test@gmail.com", "pass", "admin"));
        add(new User((long) 2,"roman2", "test@gmail.com", "pass", "admin"));
        add(new User((long) 3,"roman3", "test@gmail.com", "pass", "admin"));
        add(new User((long) 4,"roman4", "test@gmail.com", "pass", "admin"));
    }};

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void updateUser(User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(updatedUser.getId())) {
                users.set(i, updatedUser);
            }
        }
    }

    @Override
    public void removeUser(Long id) {
        users.removeIf(user -> (user.getId().equals(id)));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
