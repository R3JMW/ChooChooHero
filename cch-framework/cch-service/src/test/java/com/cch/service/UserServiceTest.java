package com.cch.service;

import com.cch.mapper.UserMapperExt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

  @InjectMocks private UserServiceImpl userServiceImpl;

  @Mock private UserMapperExt userMapperExt;

  @BeforeEach
  public void initialize() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  private void getUserByName() {
    this.userServiceImpl.getUserByName("admin");
  }
}
