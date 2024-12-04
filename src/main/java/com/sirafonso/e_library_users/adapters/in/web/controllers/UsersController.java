package com.sirafonso.e_library_users.adapters.in.web.controllers;

import com.sirafonso.e_library_users.core.ports.in.*;
import org.springframework.web.bind.annotation.*;

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
    String createNewUser(@RequestBody String username) {
        return this.saveUser.execute(username);
    }

    @GetMapping
    String getAllUsers() {
        return this.getAllUsers.execute();
    }

    @GetMapping("/{userId}")
    String getSingleUser(@PathVariable String userId) {
        return this.getSingleUser.execute(userId);
    }

    @PatchMapping("/{userId}")
    String updateUserUsername(@PathVariable String userId, @RequestBody String username) {
        return this.updateUserUsername.execute(userId, username);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId) {
        return this.deleteUser.execute(userId);
    }

}
