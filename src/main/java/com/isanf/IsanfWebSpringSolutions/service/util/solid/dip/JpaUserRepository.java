package com.isanf.IsanfWebSpringSolutions.service.util.solid.dip;

import com.isanf.IsanfWebSpringSolutions.domain.entity.UserOld;

public abstract class JpaUserRepository implements UserRepository {
    @Override
    public void save(UserOld user) {
        // Save user using JPA
    }
}
