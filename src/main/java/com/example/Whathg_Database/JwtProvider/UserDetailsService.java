package com.example.Whathg_Database.JwtProvider;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserDetailsService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
 Optional<User> findUserByResetToken(String resetToken);
 void save(User user);
 Optional<User> findUserByEmail(String email);
 
}