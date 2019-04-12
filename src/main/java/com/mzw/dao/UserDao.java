package com.mzw.dao;

import com.mzw.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User selectOne(@Param("username") String username, @Param("password") String password);
}
