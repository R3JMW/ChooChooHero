package com.cch.mapper;

import com.cch.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapperExt extends UserMapper {

    User getUserByName(@Param("user_name") String name);

    int add(User user);
}
