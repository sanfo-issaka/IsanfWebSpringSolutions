package com.isanf.IsanfWebCRUDSolutions.service.util.solid.dip;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.UserOld;

public abstract class MongoUserRepository implements UserRepository {
    @Override
    public void save(UserOld user) {
        // Save user using MongoDB
    }
}
