package com.exercise.claims.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.claims.model.ClaimEntity;
import com.exercise.claims.repository.ClaimRepository;

@Service
public class ClaimService {

	@Autowired
	ClaimRepository claimRepository;
	
	public List<ClaimEntity> getAllClaims() {
		List<ClaimEntity> claims = claimRepository.findAll();
		return claims;
	}
	
	public ClaimEntity addClaim(ClaimEntity claim) {
		return claimRepository.save(claim);
	}
	
	public ClaimEntity findByClaimNumber(String claimNumber) {
		return claimRepository.findByClaimNumber(claimNumber);
	}
	


}


