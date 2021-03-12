package ru.flamesyt.springcourse.services;

import org.springframework.stereotype.Service;
import ru.flamesyt.springcourse.entity.UserEntity;
import ru.flamesyt.springcourse.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<UserEntity> getAllusers() {
        return userRepository.findAll();
    }
}
