package com.isanf.IsanfWebSpringSolutions.service.util.solid.dip;

import com.isanf.IsanfWebSpringSolutions.domain.entity.UserOld;

public interface UserRepository {
    void save(UserOld user);
}
