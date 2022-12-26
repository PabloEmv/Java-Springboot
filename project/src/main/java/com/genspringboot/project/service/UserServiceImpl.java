package com.genspringboot.project.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.genspringboot.project.model.User;
import com.genspringboot.project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Integer id) {
        Optional<User> users = userRepository.findById(id);
        return users.orElse(null);

    }

    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
