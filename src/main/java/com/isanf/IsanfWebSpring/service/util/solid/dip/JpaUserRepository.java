package com.isanf.IsanfWebSpring.service.util.solid.dip;

import com.isanf.IsanfWebSpring.domain.entity.UserOld;

public abstract class JpaUserRepository implements UserRepository {
    @Override
    public void save(UserOld user) {
        // Save user using JPA
    }
}
