package com.isanf.IsanfWebCRUDSolutions.service.util.solid.dip;

import com.isanf.IsanfWebCRUDSolutions.domain.entity.UserOld;

public interface UserRepository {
    void save(UserOld user);
}
