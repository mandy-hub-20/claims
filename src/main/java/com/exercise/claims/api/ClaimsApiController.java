package com.exercise.claims.api;

import com.exercise.claims.model.Claim;
import com.exercise.claims.model.Claims;
import com.exercise.claims.api.ClaimsApiDelegate;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
public class ClaimsApiController implements ClaimsApi {

	private final ClaimsApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public ClaimsApiController(ClaimsApiDelegate delegate) {
        this.delegate = delegate;
    }
    public ResponseEntity<Claim> addClaim(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Claim body
) {
        return delegate.addClaim(body);
    }

    public ResponseEntity<Claims> getAllclaims() {
        return delegate.getAllclaims();
    }

    public ResponseEntity<Claim> getClaimByNumber(@ApiParam(value = "claim Number",required=true) @PathVariable("claimNumber") String claimNumber
) {
        return delegate.getClaimByNumber(claimNumber);
    }

}
