package com.exercise.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exercise.claims.model.ClaimEntity;

public interface ClaimRepository extends JpaRepository<ClaimEntity, String> {
	public ClaimEntity findByClaimNumber(String claimNumber);

}
