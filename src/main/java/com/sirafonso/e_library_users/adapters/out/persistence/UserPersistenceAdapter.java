package com.sirafonso.e_library_users.adapters.out.persistence;

import com.sirafonso.e_library_users.adapters.out.mappers.UserMapper;
import com.sirafonso.e_library_users.adapters.out.repository.UserEntityRepository;
import com.sirafonso.e_library_users.adapters.out.repository.entities.UserEntity;
import com.sirafonso.e_library_users.core.domain.models.UserModelIn;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import com.sirafonso.e_library_users.core.ports.out.UserPersistenceOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class UserPersistenceAdapter implements UserPersistenceOutputPort {

    private final UserEntityRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserPersistenceAdapter(
            UserEntityRepository userRepository,
            UserMapper userMapper
    ) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserModelOut saveUser(UserModelIn newUser) {
        UserEntity newUserEntity = this.userMapper.userModelInToUserEntity(newUser);
        UserEntity savedUser = this.userRepository.save(newUserEntity);
        return this.userMapper.userEntityToUserModelOut(savedUser);
    }

    @Override
    public List<UserModelOut> getAllUsers() {
        return this.userRepository
            .findAll()
            .stream()
            .map(this.userMapper::userEntityToUserModelOut)
            .toList();
    }

    @Override
    public UserModelOut getSingleUser(UUID userId) {
        UserEntity foundUser = this.userRepository
                .findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("There is no user with such id"));

        return this.userMapper.userEntityToUserModelOut(foundUser);
    }

    @Override
    public UserModelOut updateUserUsername(UUID userId, String newUsername) {
        UserEntity updatedUser = this.userRepository.findById(userId)
                .map(user -> {
                    user.setUsername(newUsername);
                    return this.userRepository.save(user);
                }).orElseThrow(() -> new IllegalArgumentException("There is no user with such id"));

        return this.userMapper.userEntityToUserModelOut(updatedUser);
    }

    @Override
    public void deleteUser(UUID userId) {
        this.userRepository.deleteById(userId);
    }
}
