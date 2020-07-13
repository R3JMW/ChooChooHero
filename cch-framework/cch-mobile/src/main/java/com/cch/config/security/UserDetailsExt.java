package com.cch.config.security;

import com.cch.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class UserDetailsExt extends User implements UserDetails {

    public UserDetailsExt() {

    }

    public UserDetailsExt(User user) {
        super.setUserId(user.getUserId());
        super.setUserId(user.getUserId());
        super.setUserName(user.getUserName());
        super.setUserPassword(user.getUserPassword());
        super.setStatus(user.getStatus());
        super.setUserRole(user.getUserRole());
    }

    public User formatUser() {
        User user = new User();
        user.setUserId(this.getUserId());
        user.setUserName(this.getUserName());
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return super.getUserPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
