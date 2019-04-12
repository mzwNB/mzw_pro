package com.mzw.service;

import com.mzw.entity.User;

public interface UserService {
     User login(String username, String password);
}
