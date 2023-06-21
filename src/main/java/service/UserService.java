package service;

import entity.User;
import org.springframework.stereotype.Repository;
import repository.UserRepository;

@Repository
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User authenticateUser(String username, String password) {return userRepository.findByUsername(username);}
}
