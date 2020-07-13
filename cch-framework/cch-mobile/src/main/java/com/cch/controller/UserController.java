package com.cch.controller;

import com.cch.model.User;
import com.cch.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  private final PasswordEncoder passwordEncoder;

  @Autowired
  public UserController(
      @Qualifier("userServiceImpl") UserService userService, PasswordEncoder passwordEncoder) {
    this.userService = userService;
    this.passwordEncoder = passwordEncoder;
  }


  /**
   * controller is defining a PathVariable /{userId} which is conflicting with the /swagger-ui.html
   * https://github.com/springfox/springfox/issues/3102
   * @param userId
   * @return
   */
  @ApiOperation("获取指定用户信息")
  @ApiImplicitParams(
          @ApiImplicitParam(paramType = "path", name = "userId", value = "用户编号", defaultValue = "", dataType = "String")
  )
  @GetMapping("/{userId}")
  public User searchUserById(@PathVariable String userId) {
    return null;
  }

  @GetMapping
  public List<User> search(@RequestParam() int page, @RequestParam() int size) {
    return Collections.emptyList();
  }

  @PostMapping
  public int register(@RequestBody() User user) {
    user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
    return this.userService.add(user);
  }

  @PutMapping
  public int update(@RequestBody() User user) {
    return 0;
  }

  @DeleteMapping
  public int inactive() {
    return 0;
  }
}
