package com.wlorente.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlorente.workshopmongo.domain.User;
import com.wlorente.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
				
			//	Optional<Categoria> obj = repo.findById(id); return obj.orElse(null);
	}

}
