package com.isanf.IsanfWebSpringSolutions.service.util.solid.dip;

import com.isanf.IsanfWebSpringSolutions.domain.entity.UserOld;
import com.isanf.IsanfWebSpringSolutions.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserOld user) {
        userRepository.save(user);
    }
}