package com.sirafonso.e_library_users.adapters.in.web.controllers;

import com.sirafonso.e_library_users.adapters.in.web.controllers.dtos.request.SaveUserRequest;
import com.sirafonso.e_library_users.core.domain.models.UserModelOut;
import com.sirafonso.e_library_users.core.ports.in.*;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UsersController {

    private final SaveUserInputPort saveUser;
    private final GetAllUsersInputPort getAllUsers;
    private final GetSingleUserInputPort getSingleUser;
    private final UpdateUsernameInputPort updateUserUsername;
    private final DeleteUserInputPort deleteUser;

    public UsersController(
        SaveUserInputPort saveUser,
        GetAllUsersInputPort getAllUsers,
        GetSingleUserInputPort getSingleUser,
        UpdateUsernameInputPort updateUserUsername,
        DeleteUserInputPort deleteUser
    ) {
        this.saveUser = saveUser;
        this.getAllUsers = getAllUsers;
        this.getSingleUser = getSingleUser;
        this.updateUserUsername = updateUserUsername;
        this.deleteUser = deleteUser;
    }

    @PostMapping
    UserModelOut createNewUser(@RequestBody @Valid SaveUserRequest newUser) {
        return this.saveUser.execute(newUser.toUserModelIn());
    }

    @GetMapping
    List<UserModelOut> getAllUsers() {
        return this.getAllUsers.execute();
    }

    @GetMapping("/{userId}")
    UserModelOut getSingleUser(@PathVariable UUID userId) {
        return this.getSingleUser.execute(userId);
    }

    @PatchMapping("/{userId}")
    UserModelOut updateUserUsername(@PathVariable UUID userId, @RequestBody String username) {
        return this.updateUserUsername.execute(userId, username);
    }

    @DeleteMapping("/{userId}")
    void deleteUser(@PathVariable UUID userId) {
        this.deleteUser.execute(userId);
    }

}
