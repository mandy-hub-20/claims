package com.exercise.claims.api;

import com.exercise.claims.model.Claim;
import com.exercise.claims.model.Claims;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link ClaimsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface ClaimsApiDelegate {

    /**
     * @see ClaimsApi#addClaim
     */
    ResponseEntity<Claim> addClaim(Claim  body);

    /**
     * @see ClaimsApi#getAllclaims
     */
    ResponseEntity<Claims> getAllclaims();

    /**
     * @see ClaimsApi#getClaimByNumber
     */
    ResponseEntity<Claim> getClaimByNumber( String  claimNumber);

}
