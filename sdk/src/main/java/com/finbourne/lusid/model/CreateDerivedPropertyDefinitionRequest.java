/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3510
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateDerivedPropertyDefinitionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDerivedPropertyDefinitionRequest {
  /**
   * The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity
   */
  @JsonAdapter(DomainEnum.Adapter.class)
  public enum DomainEnum {
    NOTDEFINED("NotDefined"),
    
    TRANSACTION("Transaction"),
    
    PORTFOLIO("Portfolio"),
    
    HOLDING("Holding"),
    
    REFERENCEHOLDING("ReferenceHolding"),
    
    TRANSACTIONCONFIGURATION("TransactionConfiguration"),
    
    INSTRUMENT("Instrument"),
    
    CUTLABELDEFINITION("CutLabelDefinition"),
    
    ANALYTIC("Analytic"),
    
    PORTFOLIOGROUP("PortfolioGroup"),
    
    PERSON("Person"),
    
    ACCESSMETADATA("AccessMetadata"),
    
    ORDER("Order"),
    
    UNITRESULT("UnitResult"),
    
    MARKETDATA("MarketData"),
    
    CONFIGURATIONRECIPE("ConfigurationRecipe"),
    
    ALLOCATION("Allocation"),
    
    CALENDAR("Calendar"),
    
    LEGALENTITY("LegalEntity"),
    
    PLACEMENT("Placement"),
    
    EXECUTION("Execution"),
    
    BLOCK("Block"),
    
    PARTICIPATION("Participation"),
    
    PACKAGE("Package"),
    
    ORDERINSTRUCTION("OrderInstruction"),
    
    CUSTOMENTITY("CustomEntity");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DomainEnum fromValue(String value) {
      for (DomainEnum b : DomainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DomainEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DomainEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DomainEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DomainEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private DomainEnum domain;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DATA_TYPE_ID = "dataTypeId";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE_ID)
  private ResourceId dataTypeId;

  public static final String SERIALIZED_NAME_PROPERTY_DESCRIPTION = "propertyDescription";
  @SerializedName(SERIALIZED_NAME_PROPERTY_DESCRIPTION)
  private String propertyDescription;

  public static final String SERIALIZED_NAME_DERIVATION_FORMULA = "derivationFormula";
  @SerializedName(SERIALIZED_NAME_DERIVATION_FORMULA)
  private String derivationFormula;


  public CreateDerivedPropertyDefinitionRequest domain(DomainEnum domain) {
    this.domain = domain; 
    return this;
  }

   /**
   * The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity
   * @return domain
  **/
  @ApiModelProperty(required = true, value = "The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity")
  public DomainEnum getDomain() {
    return domain;
  }

  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }


  public CreateDerivedPropertyDefinitionRequest scope(String scope) {
    this.scope = scope; 
    return this;
  }

   /**
   * The scope that the property exists in.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "The scope that the property exists in.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  public CreateDerivedPropertyDefinitionRequest code(String code) {
    this.code = code; 
    return this;
  }

   /**
   * The code of the property. Together with the domain and scope this uniquely identifies the property.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The code of the property. Together with the domain and scope this uniquely identifies the property.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public CreateDerivedPropertyDefinitionRequest displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The display name of the property.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The display name of the property.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateDerivedPropertyDefinitionRequest dataTypeId(ResourceId dataTypeId) {
    this.dataTypeId = dataTypeId; 
    return this;
  }

   /**
   * Get dataTypeId
   * @return dataTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getDataTypeId() {
    return dataTypeId;
  }

  public void setDataTypeId(ResourceId dataTypeId) {
    this.dataTypeId = dataTypeId;
  }


  public CreateDerivedPropertyDefinitionRequest propertyDescription(String propertyDescription) {
    this.propertyDescription = propertyDescription; 
    return this;
  }

   /**
   * Describes the property
   * @return propertyDescription
  **/
  @ApiModelProperty(value = "Describes the property")
  public String getPropertyDescription() {
    return propertyDescription;
  }

  public void setPropertyDescription(String propertyDescription) {
    this.propertyDescription = propertyDescription;
  }


  public CreateDerivedPropertyDefinitionRequest derivationFormula(String derivationFormula) {
    this.derivationFormula = derivationFormula; 
    return this;
  }

   /**
   * The rule that defines how data is composed for a derived property.
   * @return derivationFormula
  **/
  @ApiModelProperty(value = "The rule that defines how data is composed for a derived property.")
  public String getDerivationFormula() {
    return derivationFormula;
  }

  public void setDerivationFormula(String derivationFormula) {
    this.derivationFormula = derivationFormula;
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
    sb.append("class CreateDerivedPropertyDefinitionRequest {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dataTypeId: ").append(toIndentedString(dataTypeId)).append("\n");
    sb.append("    propertyDescription: ").append(toIndentedString(propertyDescription)).append("\n");
    sb.append("    derivationFormula: ").append(toIndentedString(derivationFormula)).append("\n");
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
