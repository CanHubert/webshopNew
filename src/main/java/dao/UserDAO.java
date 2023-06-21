package dao;

import entity.User;

public interface UserDAO {
    User getUserById(Long userId);
    User getUserByUsername(String username);
    void createUser(User user);
    void updateUser(User user);
    void deleteUser(Long userId);
}
