package com.example.Whathg_Database.JwtProvider;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	 @Autowired
	  UserRepository userRepository;
	 
	  @Override
	  @Transactional
	  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	 
	    User user = userRepository.findByUsername(username).orElseThrow(
	        () -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));
	 
	    return UserPrinciple.build(user);
	  }
	  
	  
	  
	  
		public Optional<User> findUserByEmail(String email) {
			return userRepository.findByEmail(email);
		}


		public Optional<User> findUserByResetToken(String resetToken) {
			return userRepository.findByResetToken(resetToken);
		}


		public void save(User user) {
			userRepository.save(user);
		}
 

}