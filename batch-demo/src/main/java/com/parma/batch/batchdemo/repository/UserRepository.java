package com.parma.batch.batchdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parma.batch.batchdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
