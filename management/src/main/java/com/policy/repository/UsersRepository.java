package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
