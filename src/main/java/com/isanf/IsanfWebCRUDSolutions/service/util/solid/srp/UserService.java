package com.isanf.IsanfWebCRUDSolutions.service.util.solid.srp;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.UserOld;
import com.isanf.IsanfWebCRUDSolutions.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserOld user) {
        // Business logic for creating a user
        userRepository.save(user);
    }
}