package com.sirafonso.e_library_users.adapters.out.mappers;

import com.sirafonso.e_library_users.adapters.out.repository.entities.UserEntity;
import com.sirafonso.e_library_users.core.domain.models.UserModelIn;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity userModelInToUserEntity(UserModelIn userModelIn) {
        return UserEntity.builder()
            .name(userModelIn.name())
            .username(userModelIn.username())
            .email(userModelIn.email())
            .password(userModelIn.password())
            .build();
    }

    public UserModelOut userEntityToUserModelOut(UserEntity userEntity) {
        if (userEntity == null) return null;

        return UserModelOut.builder()
            .id(userEntity.getId())
            .name(userEntity.getName())
            .username(userEntity.getUsername())
            .email(userEntity.getEmail())
            .password(userEntity.getPassword())
            .build();
    }

}
