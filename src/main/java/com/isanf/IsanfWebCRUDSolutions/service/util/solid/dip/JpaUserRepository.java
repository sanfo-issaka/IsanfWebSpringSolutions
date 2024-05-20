package com.isanf.IsanfWebCRUDSolutions.service.util.solid.dip;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.User;

public abstract class JpaUserRepository implements UserRepository {
    @Override
    public void save(User user) {
        // Save user using JPA
    }
}
