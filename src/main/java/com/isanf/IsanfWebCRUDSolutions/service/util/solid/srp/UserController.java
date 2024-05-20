package com.isanf.IsanfWebCRUDSolutions.service.util.solid.srp;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.User;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser(User user) {
        // Validation logic
        userService.createUser(user);
    }
}
