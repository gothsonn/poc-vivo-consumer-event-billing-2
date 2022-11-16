package com.accenture.pocvivoconsumereventbilling2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")


public class BillingAccountStateChangeEventPayload   {
  @JsonProperty("billingAccount")
  private BillingAccount billingAccount = null;

  public BillingAccountStateChangeEventPayload billingAccount(BillingAccount billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return billingAccount
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public BillingAccount getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccount billingAccount) {
    this.billingAccount = billingAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAccountStateChangeEventPayload billingAccountStateChangeEventPayload = (BillingAccountStateChangeEventPayload) o;
    return Objects.equals(this.billingAccount, billingAccountStateChangeEventPayload.billingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAccountStateChangeEventPayload {\n");
    
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

