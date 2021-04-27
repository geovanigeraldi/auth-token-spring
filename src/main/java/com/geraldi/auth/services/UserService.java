package com.geraldi.auth.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geraldi.auth.dto.UserDTO;
import com.geraldi.auth.entities.User;
import com.geraldi.auth.repositories.UserRepository;
import com.geraldi.auth.services.exceptions.ResourceNotFoundException;

@Service
public class UserService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository repository;
	
	//@Autowired
	//private BCryptPasswordEncoder passwordEncoder;

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new UserDTO(entity);
	}

	@Override
	public UserDetails loadUserByUsername(String usuarioEmail) throws UsernameNotFoundException {
		User user = repository.findByUsuarioEmail(usuarioEmail);
		if (user == null) {
			logger.error("user not found: " + usuarioEmail);
			throw new UsernameNotFoundException("email not found");
		}
		logger.info("user found: " + user.getUsername() + " id: " + user.getUsuarioId().toString());
		//logger.info("senha: " + passwordEncoder.encode(user.getUsuarioSenha()));
		//logger.info("senha: " + user.getPassword());
		return user;
	}

}