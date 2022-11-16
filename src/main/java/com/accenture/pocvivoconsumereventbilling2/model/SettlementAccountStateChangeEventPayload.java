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


public class SettlementAccountStateChangeEventPayload   {
  @JsonProperty("settlementAccount")
  private SettlementAccount settlementAccount = null;

  public SettlementAccountStateChangeEventPayload settlementAccount(SettlementAccount settlementAccount) {
    this.settlementAccount = settlementAccount;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return settlementAccount
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public SettlementAccount getSettlementAccount() {
    return settlementAccount;
  }

  public void setSettlementAccount(SettlementAccount settlementAccount) {
    this.settlementAccount = settlementAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementAccountStateChangeEventPayload settlementAccountStateChangeEventPayload = (SettlementAccountStateChangeEventPayload) o;
    return Objects.equals(this.settlementAccount, settlementAccountStateChangeEventPayload.settlementAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementAccountStateChangeEventPayload {\n");
    
    sb.append("    settlementAccount: ").append(toIndentedString(settlementAccount)).append("\n");
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

