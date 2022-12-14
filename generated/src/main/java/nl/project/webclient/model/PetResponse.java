/*
 * MS Pet API
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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import nl.project.webclient.model.Cat;
import nl.project.webclient.model.Dog;
import nl.project.webclient.model.Lizard;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PetResponse
 */
@JsonPropertyOrder({
  PetResponse.JSON_PROPERTY_CAT_NAME,
  PetResponse.JSON_PROPERTY_PET_TYPE,
  PetResponse.JSON_PROPERTY_BARK,
  PetResponse.JSON_PROPERTY_LOVES_ROCKS
})
@JsonTypeName("PetResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-21T09:59:54.243074600+02:00[Europe/Prague]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "petType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
  @JsonSubTypes.Type(value = Dog.class, name = "Dog"),
  @JsonSubTypes.Type(value = Lizard.class, name = "Lizard"),
})

public class PetResponse {
  public static final String JSON_PROPERTY_CAT_NAME = "catName";
  private String catName;

  public static final String JSON_PROPERTY_PET_TYPE = "petType";
  protected String petType;

  public static final String JSON_PROPERTY_BARK = "bark";
  private String bark;

  public static final String JSON_PROPERTY_LOVES_ROCKS = "lovesRocks";
  private Boolean lovesRocks;


  public PetResponse catName(String catName) {
    
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


  public void setCatName(String catName) {
    this.catName = catName;
  }


  public PetResponse petType(String petType) {
    
    this.petType = petType;
    return this;
  }

   /**
   * Get petType
   * @return petType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPetType() {
    return petType;
  }


  public void setPetType(String petType) {
    this.petType = petType;
  }


  public PetResponse bark(String bark) {
    
    this.bark = bark;
    return this;
  }

   /**
   * Get bark
   * @return bark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBark() {
    return bark;
  }


  public void setBark(String bark) {
    this.bark = bark;
  }


  public PetResponse lovesRocks(Boolean lovesRocks) {
    
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


  public void setLovesRocks(Boolean lovesRocks) {
    this.lovesRocks = lovesRocks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PetResponse petResponse = (PetResponse) o;
    return Objects.equals(this.catName, petResponse.catName) &&
        Objects.equals(this.petType, petResponse.petType) &&
        Objects.equals(this.bark, petResponse.bark) &&
        Objects.equals(this.lovesRocks, petResponse.lovesRocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catName, petType, bark, lovesRocks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetResponse {\n");
    sb.append("    catName: ").append(toIndentedString(catName)).append("\n");
    sb.append("    petType: ").append(toIndentedString(petType)).append("\n");
    sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
    sb.append("    lovesRocks: ").append(toIndentedString(lovesRocks)).append("\n");
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

