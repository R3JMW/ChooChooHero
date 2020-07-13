package com.cch.service;

import com.cch.mapper.UserMapperExt;
import com.cch.model.User;
import com.cch.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @author dajin
 */
@Service
public class UserServiceImpl implements UserService {

  private final UserMapperExt userMapperExt;

  @Autowired
  public UserServiceImpl(UserMapperExt userMapperExt) {
    this.userMapperExt = userMapperExt;
  }

  @Override
  public int add(User user) {
    user.setUserId(IdWorker.next());
    user.setRegDate(new Timestamp(System.currentTimeMillis()));
    user.setStatus("A");
    user.setUserRole("USER");
    return userMapperExt.add(user);
  }

  @Override
  public User getUserByName(String name) {
    return userMapperExt.getUserByName(name);
  }
}
