package com.isanf.IsanfWebSpring.service.util.solid.dip;

import com.isanf.IsanfWebSpring.domain.entity.UserOld;
import com.isanf.IsanfWebSpring.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserOld user) {
        userRepository.save(user);
    }
}