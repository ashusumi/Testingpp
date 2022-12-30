package com.JobPortal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.JobPortal.Entity.User;
import com.JobPortal.Repositories.UserRepository;

public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService{

	@Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= repo.findByUserName(username).orElseThrow(()->new UsernameNotFoundException("user not found"+username));
		
		return com.JobPortal.Service.UserDetails.buildDetails(user);
	}

}
