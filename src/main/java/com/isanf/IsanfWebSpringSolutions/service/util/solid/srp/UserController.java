package com.isanf.IsanfWebSpringSolutions.service.util.solid.srp;

import com.isanf.IsanfWebSpringSolutions.domain.entity.UserOld;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser(UserOld user) {
        // Validation logic
        userService.createUser(user);
    }
}
