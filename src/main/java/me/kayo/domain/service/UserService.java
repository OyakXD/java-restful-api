package me.kayo.domain.service;

import me.kayo.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
