package com.carlos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

}
