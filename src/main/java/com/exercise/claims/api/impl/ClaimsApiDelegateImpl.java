package com.exercise.claims.api.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.exercise.claims.api.ClaimsApiDelegate;
import com.exercise.claims.model.Claims;
import com.exercise.claims.model.Claim;
import com.exercise.claims.model.ClaimEntity;
import com.exercise.claims.service.ClaimService;


public class ClaimsApiDelegateImpl implements ClaimsApiDelegate{

	@Autowired
	ClaimService claimService;

	@Override
	public ResponseEntity<Claim> addClaim(Claim body) {
		ClaimEntity claimEntity = convertFrom(body);
		claimEntity.setStatus("INITIAL");
		claimEntity = claimService.addClaim(claimEntity);
		Claim claim = convertFrom(claimEntity);
		return new ResponseEntity<>(claim, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Claims> getAllclaims() {
		List<ClaimEntity> listClaimEntity = claimService.getAllClaims();
		Claims claims = new Claims();
		for (ClaimEntity ie : listClaimEntity) {
			Claim claim = convertFrom(ie);
			claims.addDataItem(claim);
		}
		return new ResponseEntity<>(claims, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Claim> getClaimByNumber(String claimNumber) {
		ClaimEntity ie = claimService.findByClaimNumber(claimNumber);
		Claim claim = convertFrom(ie);
		return new ResponseEntity<>(claim, HttpStatus.OK);
	}

	private ClaimEntity convertFrom(Claim claim) {
		ClaimEntity claimEntity = new ClaimEntity();
		claimEntity.setClaimNumber(claim.getClaimNumber());
		claimEntity.setApplicationDate(claim.getApplicationDate());
		claimEntity.setPolicyNumber(claim.getPolicyNumber());
		claimEntity.setAmount(claim.getAmount());
		claimEntity.setStatus(claim.getStatus());
		return claimEntity;
	}

	private Claim convertFrom(ClaimEntity claimEntity) {
		Claim claim = new Claim();
		claim.setClaimNumber(claimEntity.getClaimNumber());
		claim.setApplicationDate(claim.getApplicationDate());
		claim.setPolicyNumber(claimEntity.getPolicyNumber());
		claim.setAmount(claim.getAmount());
		claim.setStatus(claimEntity.getStatus());
		return claim;
	}


}
