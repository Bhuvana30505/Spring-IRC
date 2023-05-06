package com.example.Kabbadi1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Kabbadi1.model.LoginPage;

public interface LoginRepo extends JpaRepository<LoginPage,Integer>{
	LoginPage  findByusername(String username);

}
