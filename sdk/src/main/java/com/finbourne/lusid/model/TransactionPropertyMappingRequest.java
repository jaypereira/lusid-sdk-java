/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3469
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionPropertyMappingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionPropertyMappingRequest {
  public static final String SERIALIZED_NAME_PROPERTY_KEY = "propertyKey";
  @SerializedName(SERIALIZED_NAME_PROPERTY_KEY)
  private String propertyKey;

  public static final String SERIALIZED_NAME_MAP_FROM = "mapFrom";
  @SerializedName(SERIALIZED_NAME_MAP_FROM)
  private String mapFrom;

  public static final String SERIALIZED_NAME_SET_TO = "setTo";
  @SerializedName(SERIALIZED_NAME_SET_TO)
  private Object setTo;


  public TransactionPropertyMappingRequest propertyKey(String propertyKey) {
    this.propertyKey = propertyKey; 
    return this;
  }

   /**
   * Uniquely identifies the property definition and consists of a Domain, Scope and Code.
   * @return propertyKey
  **/
  @ApiModelProperty(required = true, value = "Uniquely identifies the property definition and consists of a Domain, Scope and Code.")
  public String getPropertyKey() {
    return propertyKey;
  }

  public void setPropertyKey(String propertyKey) {
    this.propertyKey = propertyKey;
  }


  public TransactionPropertyMappingRequest mapFrom(String mapFrom) {
    this.mapFrom = mapFrom; 
    return this;
  }

   /**
   * The Property Key of the Property to map from.
   * @return mapFrom
  **/
  @ApiModelProperty(value = "The Property Key of the Property to map from.")
  public String getMapFrom() {
    return mapFrom;
  }

  public void setMapFrom(String mapFrom) {
    this.mapFrom = mapFrom;
  }


  public TransactionPropertyMappingRequest setTo(Object setTo) {
    this.setTo = setTo; 
    return this;
  }

   /**
   * A pointer to the Property being mapped from.
   * @return setTo
  **/
  @ApiModelProperty(value = "A pointer to the Property being mapped from.")
  public Object getSetTo() {
    return setTo;
  }

  public void setSetTo(Object setTo) {
    this.setTo = setTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPropertyMappingRequest {\n");
    sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
    sb.append("    mapFrom: ").append(toIndentedString(mapFrom)).append("\n");
    sb.append("    setTo: ").append(toIndentedString(setTo)).append("\n");
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
