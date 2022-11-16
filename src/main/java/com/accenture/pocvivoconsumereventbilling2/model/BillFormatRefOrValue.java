package com.accenture.pocvivoconsumereventbilling2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * An attachment by value or by reference.
 */
@ApiModel(description = "An attachment by value or by reference.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")


public class BillFormatRefOrValue   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isRef")
  private Boolean isRef = true;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public BillFormatRefOrValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the bill format
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the bill format")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillFormatRefOrValue href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the bill format
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the bill format")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BillFormatRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explanatory text for this bill format
   * @return description
  **/
  @ApiModelProperty(value = "An explanatory text for this bill format")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BillFormatRefOrValue isRef(Boolean isRef) {
    this.isRef = isRef;
    return this;
  }

  /**
   * Get isRef
   * @return isRef
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsRef() {
    return isRef;
  }

  public void setIsRef(Boolean isRef) {
    this.isRef = isRef;
  }

  public BillFormatRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A short descriptive name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A short descriptive name")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillFormatRefOrValue baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public BillFormatRefOrValue schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public BillFormatRefOrValue type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BillFormatRefOrValue referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillFormatRefOrValue billFormatRefOrValue = (BillFormatRefOrValue) o;
    return Objects.equals(this.id, billFormatRefOrValue.id) &&
        Objects.equals(this.href, billFormatRefOrValue.href) &&
        Objects.equals(this.description, billFormatRefOrValue.description) &&
        Objects.equals(this.isRef, billFormatRefOrValue.isRef) &&
        Objects.equals(this.name, billFormatRefOrValue.name) &&
        Objects.equals(this.baseType, billFormatRefOrValue.baseType) &&
        Objects.equals(this.schemaLocation, billFormatRefOrValue.schemaLocation) &&
        Objects.equals(this.type, billFormatRefOrValue.type) &&
        Objects.equals(this.referredType, billFormatRefOrValue.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isRef, name, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillFormatRefOrValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRef: ").append(toIndentedString(isRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

