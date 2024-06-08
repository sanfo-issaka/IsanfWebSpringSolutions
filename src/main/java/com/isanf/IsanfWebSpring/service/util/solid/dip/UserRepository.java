package com.isanf.IsanfWebSpring.service.util.solid.dip;

import com.isanf.IsanfWebSpring.domain.entity.UserOld;

public interface UserRepository {
    void save(UserOld user);
}
