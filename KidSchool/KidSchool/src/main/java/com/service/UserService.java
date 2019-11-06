package com.service;

import com.model.*;

public interface UserService {
	public Utilisateur findUserByEmail(String email);
	public void saveUser(Utilisateur user);
}
