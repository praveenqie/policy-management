package com.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.policy.entity.Policies;
import com.policy.entity.PolicyDetails;
import com.policy.entity.Users;

@Repository
public interface PoliciesRepository extends JpaRepository<Policies, Long>{

}
