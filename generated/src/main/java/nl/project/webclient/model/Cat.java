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
 * Cat
 */
@JsonPropertyOrder({
  Cat.JSON_PROPERTY_CAT_NAME,
  Cat.JSON_PROPERTY_PET_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T09:34:09.177841100+02:00[Europe/Prague]")
public class Cat {
  public static final String JSON_PROPERTY_CAT_NAME = "catName";
  private String catName;

  public static final String JSON_PROPERTY_PET_TYPE = "petType";
  private String petType;

  public Cat() {
  }

  public Cat catName(String catName) {
    
    this.catName = catName;
    return this;
  }

   /**
   * Get catName
   * @return catName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCatName() {
    return catName;
  }


  @JsonProperty(JSON_PROPERTY_CAT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatName(String catName) {
    this.catName = catName;
  }


  public Cat petType(String petType) {
    
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
    Cat cat = (Cat) o;
    return Objects.equals(this.catName, cat.catName) &&
        Objects.equals(this.petType, cat.petType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catName, petType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    catName: ").append(toIndentedString(catName)).append("\n");
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

