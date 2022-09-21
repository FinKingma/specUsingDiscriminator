/*
 * MS Project API
 * De API for testing the discriminator in openapi 6
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package nl.project.webclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Lizard
 */
@JsonPropertyOrder({
  Lizard.JSON_PROPERTY_LOVES_ROCKS,
  Lizard.JSON_PROPERTY_PET_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T09:34:09.177841100+02:00[Europe/Prague]")
public class Lizard {
  public static final String JSON_PROPERTY_LOVES_ROCKS = "lovesRocks";
  private Boolean lovesRocks;

  public static final String JSON_PROPERTY_PET_TYPE = "petType";
  private String petType;

  public Lizard() {
  }

  public Lizard lovesRocks(Boolean lovesRocks) {
    
    this.lovesRocks = lovesRocks;
    return this;
  }

   /**
   * Get lovesRocks
   * @return lovesRocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOVES_ROCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLovesRocks() {
    return lovesRocks;
  }


  @JsonProperty(JSON_PROPERTY_LOVES_ROCKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLovesRocks(Boolean lovesRocks) {
    this.lovesRocks = lovesRocks;
  }


  public Lizard petType(String petType) {
    
    this.petType = petType;
    return this;
  }

   /**
   * Get petType
   * @return petType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPetType() {
    return petType;
  }


  @JsonProperty(JSON_PROPERTY_PET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPetType(String petType) {
    this.petType = petType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lizard lizard = (Lizard) o;
    return Objects.equals(this.lovesRocks, lizard.lovesRocks) &&
        Objects.equals(this.petType, lizard.petType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lovesRocks, petType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lizard {\n");
    sb.append("    lovesRocks: ").append(toIndentedString(lovesRocks)).append("\n");
    sb.append("    petType: ").append(toIndentedString(petType)).append("\n");
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

