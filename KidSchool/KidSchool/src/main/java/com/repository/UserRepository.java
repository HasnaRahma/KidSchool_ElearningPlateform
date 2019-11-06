package com.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.*;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Utilisateur, Long> {
	 Utilisateur findByEmail(String email);
}
