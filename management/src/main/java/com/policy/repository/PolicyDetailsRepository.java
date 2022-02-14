package com.policy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.policy.entity.PolicyDetails;

@Repository
public interface PolicyDetailsRepository extends JpaRepository<PolicyDetails, Long>{

	
	@Query(value = "select u from PolicyDetails u where u.users.id = :custId")
	public List<PolicyDetails> getPolicyDetailsByCustId(Long custId);

}
