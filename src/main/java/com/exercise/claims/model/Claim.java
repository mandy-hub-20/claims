package com.exercise.claims.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Claim
 */
@Validated
public class Claim   {
  @JsonProperty("claimNumber")
  private String claimNumber = null;

  @JsonProperty("applicationDate")
  private Date applicationDate = null;

  @JsonProperty("policyNumber")
  private String policyNumber = null;

  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("status")
  private String status = null;

  public Claim claimNumber(String claimNumber) {
    this.claimNumber = claimNumber;
    return this;
  }

  /**
   * Get claimNumber
   * @return claimNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getClaimNumber() {
    return claimNumber;
  }

  public void setClaimNumber(String claimNumber) {
    this.claimNumber = claimNumber;
  }

  public Claim applicationDate(Date applicationDate) {
    this.applicationDate = applicationDate;
    return this;
  }

  /**
   * Get applicationDate
   * @return applicationDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Date getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(Date applicationDate) {
    this.applicationDate = applicationDate;
  }

  public Claim policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * Get policyNumber
   * @return policyNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public Claim amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Claim status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Claim claim = (Claim) o;
    return Objects.equals(this.claimNumber, claim.claimNumber) &&
        Objects.equals(this.applicationDate, claim.applicationDate) &&
        Objects.equals(this.policyNumber, claim.policyNumber) &&
        Objects.equals(this.amount, claim.amount) &&
        Objects.equals(this.status, claim.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimNumber, applicationDate, policyNumber, amount, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Claim {\n");
    
    sb.append("    claimNumber: ").append(toIndentedString(claimNumber)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
