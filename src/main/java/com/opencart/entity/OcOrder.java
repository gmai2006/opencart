
package com.opencart.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_order")
public class OcOrder  {
  @Id
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer order_id;

  @Basic
  @Column(name="\"invoice_no\"" , length=10)
  @NotNull
  private Integer invoice_no;

  @Basic
  @Column(name="\"invoice_prefix\"" , length=26)
  @NotNull
  private String invoice_prefix;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer store_id;

  @Basic
  @Column(name="\"store_name\"" , length=64)
  @NotNull
  private String store_name;

  @Basic
  @Column(name="\"store_url\"" , length=255)
  @NotNull
  private String store_url;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customer_id;

  @Basic
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customer_group_id;

  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="\"email\"" , length=96)
  @NotNull
  private String email;

  @Basic
  @Column(name="\"telephone\"" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="\"fax\"" , length=32)
  @NotNull
  private String fax;

  @Basic
  @Column(name="\"custom_field\"" , length=65535)
  @NotNull
  private String custom_field;

  @Basic
  @Column(name="\"payment_firstname\"" , length=32)
  @NotNull
  private String payment_firstname;

  @Basic
  @Column(name="\"payment_lastname\"" , length=32)
  @NotNull
  private String payment_lastname;

  @Basic
  @Column(name="\"payment_company\"" , length=60)
  @NotNull
  private String payment_company;

  @Basic
  @Column(name="\"payment_address_1\"" , length=128)
  @NotNull
  private String payment_address_1;

  @Basic
  @Column(name="\"payment_address_2\"" , length=128)
  @NotNull
  private String payment_address_2;

  @Basic
  @Column(name="\"payment_city\"" , length=128)
  @NotNull
  private String payment_city;

  @Basic
  @Column(name="\"payment_postcode\"" , length=10)
  @NotNull
  private String payment_postcode;

  @Basic
  @Column(name="\"payment_country\"" , length=128)
  @NotNull
  private String payment_country;

  @Basic
  @Column(name="\"payment_country_id\"" , length=10)
  @NotNull
  private Integer payment_country_id;

  @Basic
  @Column(name="\"payment_zone\"" , length=128)
  @NotNull
  private String payment_zone;

  @Basic
  @Column(name="\"payment_zone_id\"" , length=10)
  @NotNull
  private Integer payment_zone_id;

  @Basic
  @Column(name="\"payment_address_format\"" , length=65535)
  @NotNull
  private String payment_address_format;

  @Basic
  @Column(name="\"payment_custom_field\"" , length=65535)
  @NotNull
  private String payment_custom_field;

  @Basic
  @Column(name="\"payment_method\"" , length=128)
  @NotNull
  private String payment_method;

  @Basic
  @Column(name="\"payment_code\"" , length=128)
  @NotNull
  private String payment_code;

  @Basic
  @Column(name="\"shipping_firstname\"" , length=32)
  @NotNull
  private String shipping_firstname;

  @Basic
  @Column(name="\"shipping_lastname\"" , length=32)
  @NotNull
  private String shipping_lastname;

  @Basic
  @Column(name="\"shipping_company\"" , length=60)
  @NotNull
  private String shipping_company;

  @Basic
  @Column(name="\"shipping_address_1\"" , length=128)
  @NotNull
  private String shipping_address_1;

  @Basic
  @Column(name="\"shipping_address_2\"" , length=128)
  @NotNull
  private String shipping_address_2;

  @Basic
  @Column(name="\"shipping_city\"" , length=128)
  @NotNull
  private String shipping_city;

  @Basic
  @Column(name="\"shipping_postcode\"" , length=10)
  @NotNull
  private String shipping_postcode;

  @Basic
  @Column(name="\"shipping_country\"" , length=128)
  @NotNull
  private String shipping_country;

  @Basic
  @Column(name="\"shipping_country_id\"" , length=10)
  @NotNull
  private Integer shipping_country_id;

  @Basic
  @Column(name="\"shipping_zone\"" , length=128)
  @NotNull
  private String shipping_zone;

  @Basic
  @Column(name="\"shipping_zone_id\"" , length=10)
  @NotNull
  private Integer shipping_zone_id;

  @Basic
  @Column(name="\"shipping_address_format\"" , length=65535)
  @NotNull
  private String shipping_address_format;

  @Basic
  @Column(name="\"shipping_custom_field\"" , length=65535)
  @NotNull
  private String shipping_custom_field;

  @Basic
  @Column(name="\"shipping_method\"" , length=128)
  @NotNull
  private String shipping_method;

  @Basic
  @Column(name="\"shipping_code\"" , length=128)
  @NotNull
  private String shipping_code;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="\"total\"" , length=15)
  @NotNull
  private java.math.BigDecimal total = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"order_status_id\"" , length=10)
  @NotNull
  private Integer order_status_id;

  @Basic
  @Column(name="\"affiliate_id\"" , length=10)
  @NotNull
  private Integer affiliate_id;

  @Basic
  @Column(name="\"commission\"" , length=15)
  @NotNull
  private java.math.BigDecimal commission;

  @Basic
  @Column(name="\"marketing_id\"" , length=10)
  @NotNull
  private Integer marketing_id;

  @Basic
  @Column(name="\"tracking\"" , length=64)
  @NotNull
  private String tracking;

  @Basic
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"currency_id\"" , length=10)
  @NotNull
  private Integer currency_id;

  @Basic
  @Column(name="\"currency_code\"" , length=3)
  @NotNull
  private String currency_code;

  @Basic
  @Column(name="\"currency_value\"" , length=15)
  @NotNull
  private java.math.BigDecimal currency_value = new java.math.BigDecimal(0.00);

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"forwarded_ip\"" , length=40)
  @NotNull
  private String forwarded_ip;

  @Basic
  @Column(name="\"user_agent\"" , length=255)
  @NotNull
  private String user_agent;

  @Basic
  @Column(name="\"accept_language\"" , length=255)
  @NotNull
  private String accept_language;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_added;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp date_modified;

  public OcOrder() {
  }

  public void setOrderId( Integer value) {
    this.order_id = value;
  }
  public Integer getOrderId() {
    return this.order_id;
  }
  public void setInvoiceNo( Integer value) {
    this.invoice_no = value;
  }
  public Integer getInvoiceNo() {
    return this.invoice_no;
  }
  public void setInvoicePrefix( String value) {
    this.invoice_prefix = value;
  }
  public String getInvoicePrefix() {
    return this.invoice_prefix;
  }
  public void setStoreId( Integer value) {
    this.store_id = value;
  }
  public Integer getStoreId() {
    return this.store_id;
  }
  public void setStoreName( String value) {
    this.store_name = value;
  }
  public String getStoreName() {
    return this.store_name;
  }
  public void setStoreUrl( String value) {
    this.store_url = value;
  }
  public String getStoreUrl() {
    return this.store_url;
  }
  public void setCustomerId( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomerId() {
    return this.customer_id;
  }
  public void setCustomerGroupId( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getCustomerGroupId() {
    return this.customer_group_id;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setCustomField( String value) {
    this.custom_field = value;
  }
  public String getCustomField() {
    return this.custom_field;
  }
  public void setPaymentFirstname( String value) {
    this.payment_firstname = value;
  }
  public String getPaymentFirstname() {
    return this.payment_firstname;
  }
  public void setPaymentLastname( String value) {
    this.payment_lastname = value;
  }
  public String getPaymentLastname() {
    return this.payment_lastname;
  }
  public void setPaymentCompany( String value) {
    this.payment_company = value;
  }
  public String getPaymentCompany() {
    return this.payment_company;
  }
  public void setPaymentAddress1( String value) {
    this.payment_address_1 = value;
  }
  public String getPaymentAddress1() {
    return this.payment_address_1;
  }
  public void setPaymentAddress2( String value) {
    this.payment_address_2 = value;
  }
  public String getPaymentAddress2() {
    return this.payment_address_2;
  }
  public void setPaymentCity( String value) {
    this.payment_city = value;
  }
  public String getPaymentCity() {
    return this.payment_city;
  }
  public void setPaymentPostcode( String value) {
    this.payment_postcode = value;
  }
  public String getPaymentPostcode() {
    return this.payment_postcode;
  }
  public void setPaymentCountry( String value) {
    this.payment_country = value;
  }
  public String getPaymentCountry() {
    return this.payment_country;
  }
  public void setPaymentCountryId( Integer value) {
    this.payment_country_id = value;
  }
  public Integer getPaymentCountryId() {
    return this.payment_country_id;
  }
  public void setPaymentZone( String value) {
    this.payment_zone = value;
  }
  public String getPaymentZone() {
    return this.payment_zone;
  }
  public void setPaymentZoneId( Integer value) {
    this.payment_zone_id = value;
  }
  public Integer getPaymentZoneId() {
    return this.payment_zone_id;
  }
  public void setPaymentAddressFormat( String value) {
    this.payment_address_format = value;
  }
  public String getPaymentAddressFormat() {
    return this.payment_address_format;
  }
  public void setPaymentCustomField( String value) {
    this.payment_custom_field = value;
  }
  public String getPaymentCustomField() {
    return this.payment_custom_field;
  }
  public void setPaymentMethod( String value) {
    this.payment_method = value;
  }
  public String getPaymentMethod() {
    return this.payment_method;
  }
  public void setPaymentCode( String value) {
    this.payment_code = value;
  }
  public String getPaymentCode() {
    return this.payment_code;
  }
  public void setShippingFirstname( String value) {
    this.shipping_firstname = value;
  }
  public String getShippingFirstname() {
    return this.shipping_firstname;
  }
  public void setShippingLastname( String value) {
    this.shipping_lastname = value;
  }
  public String getShippingLastname() {
    return this.shipping_lastname;
  }
  public void setShippingCompany( String value) {
    this.shipping_company = value;
  }
  public String getShippingCompany() {
    return this.shipping_company;
  }
  public void setShippingAddress1( String value) {
    this.shipping_address_1 = value;
  }
  public String getShippingAddress1() {
    return this.shipping_address_1;
  }
  public void setShippingAddress2( String value) {
    this.shipping_address_2 = value;
  }
  public String getShippingAddress2() {
    return this.shipping_address_2;
  }
  public void setShippingCity( String value) {
    this.shipping_city = value;
  }
  public String getShippingCity() {
    return this.shipping_city;
  }
  public void setShippingPostcode( String value) {
    this.shipping_postcode = value;
  }
  public String getShippingPostcode() {
    return this.shipping_postcode;
  }
  public void setShippingCountry( String value) {
    this.shipping_country = value;
  }
  public String getShippingCountry() {
    return this.shipping_country;
  }
  public void setShippingCountryId( Integer value) {
    this.shipping_country_id = value;
  }
  public Integer getShippingCountryId() {
    return this.shipping_country_id;
  }
  public void setShippingZone( String value) {
    this.shipping_zone = value;
  }
  public String getShippingZone() {
    return this.shipping_zone;
  }
  public void setShippingZoneId( Integer value) {
    this.shipping_zone_id = value;
  }
  public Integer getShippingZoneId() {
    return this.shipping_zone_id;
  }
  public void setShippingAddressFormat( String value) {
    this.shipping_address_format = value;
  }
  public String getShippingAddressFormat() {
    return this.shipping_address_format;
  }
  public void setShippingCustomField( String value) {
    this.shipping_custom_field = value;
  }
  public String getShippingCustomField() {
    return this.shipping_custom_field;
  }
  public void setShippingMethod( String value) {
    this.shipping_method = value;
  }
  public String getShippingMethod() {
    return this.shipping_method;
  }
  public void setShippingCode( String value) {
    this.shipping_code = value;
  }
  public String getShippingCode() {
    return this.shipping_code;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setTotal( java.math.BigDecimal value) {
    this.total = value;
  }
  public java.math.BigDecimal getTotal() {
    return this.total;
  }
  public void setOrderStatusId( Integer value) {
    this.order_status_id = value;
  }
  public Integer getOrderStatusId() {
    return this.order_status_id;
  }
  public void setAffiliateId( Integer value) {
    this.affiliate_id = value;
  }
  public Integer getAffiliateId() {
    return this.affiliate_id;
  }
  public void setCommission( java.math.BigDecimal value) {
    this.commission = value;
  }
  public java.math.BigDecimal getCommission() {
    return this.commission;
  }
  public void setMarketingId( Integer value) {
    this.marketing_id = value;
  }
  public Integer getMarketingId() {
    return this.marketing_id;
  }
  public void setTracking( String value) {
    this.tracking = value;
  }
  public String getTracking() {
    return this.tracking;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setCurrencyId( Integer value) {
    this.currency_id = value;
  }
  public Integer getCurrencyId() {
    return this.currency_id;
  }
  public void setCurrencyCode( String value) {
    this.currency_code = value;
  }
  public String getCurrencyCode() {
    return this.currency_code;
  }
  public void setCurrencyValue( java.math.BigDecimal value) {
    this.currency_value = value;
  }
  public java.math.BigDecimal getCurrencyValue() {
    return this.currency_value;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setForwardedIp( String value) {
    this.forwarded_ip = value;
  }
  public String getForwardedIp() {
    return this.forwarded_ip;
  }
  public void setUserAgent( String value) {
    this.user_agent = value;
  }
  public String getUserAgent() {
    return this.user_agent;
  }
  public void setAcceptLanguage( String value) {
    this.accept_language = value;
  }
  public String getAcceptLanguage() {
    return this.accept_language;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.date_added;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.date_modified;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.order_id)); 
     builder.append(String.valueOf(this.invoice_no)); 
     builder.append(String.valueOf(this.invoice_prefix)); 
     builder.append(String.valueOf(this.store_id)); 
     builder.append(String.valueOf(this.store_name)); 
     builder.append(String.valueOf(this.store_url)); 
     builder.append(String.valueOf(this.customer_id)); 
     builder.append(String.valueOf(this.customer_group_id)); 
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.email)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.fax)); 
     builder.append(String.valueOf(this.custom_field)); 
     builder.append(String.valueOf(this.payment_firstname)); 
     builder.append(String.valueOf(this.payment_lastname)); 
     builder.append(String.valueOf(this.payment_company)); 
     builder.append(String.valueOf(this.payment_address_1)); 
     builder.append(String.valueOf(this.payment_address_2)); 
     builder.append(String.valueOf(this.payment_city)); 
     builder.append(String.valueOf(this.payment_postcode)); 
     builder.append(String.valueOf(this.payment_country)); 
     builder.append(String.valueOf(this.payment_country_id)); 
     builder.append(String.valueOf(this.payment_zone)); 
     builder.append(String.valueOf(this.payment_zone_id)); 
     builder.append(String.valueOf(this.payment_address_format)); 
     builder.append(String.valueOf(this.payment_custom_field)); 
     builder.append(String.valueOf(this.payment_method)); 
     builder.append(String.valueOf(this.payment_code)); 
     builder.append(String.valueOf(this.shipping_firstname)); 
     builder.append(String.valueOf(this.shipping_lastname)); 
     builder.append(String.valueOf(this.shipping_company)); 
     builder.append(String.valueOf(this.shipping_address_1)); 
     builder.append(String.valueOf(this.shipping_address_2)); 
     builder.append(String.valueOf(this.shipping_city)); 
     builder.append(String.valueOf(this.shipping_postcode)); 
     builder.append(String.valueOf(this.shipping_country)); 
     builder.append(String.valueOf(this.shipping_country_id)); 
     builder.append(String.valueOf(this.shipping_zone)); 
     builder.append(String.valueOf(this.shipping_zone_id)); 
     builder.append(String.valueOf(this.shipping_address_format)); 
     builder.append(String.valueOf(this.shipping_custom_field)); 
     builder.append(String.valueOf(this.shipping_method)); 
     builder.append(String.valueOf(this.shipping_code)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.order_status_id)); 
     builder.append(String.valueOf(this.affiliate_id)); 
     builder.append(String.valueOf(this.commission)); 
     builder.append(String.valueOf(this.marketing_id)); 
     builder.append(String.valueOf(this.tracking)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.currency_id)); 
     builder.append(String.valueOf(this.currency_code)); 
     builder.append(String.valueOf(this.currency_value)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.forwarded_ip)); 
     builder.append(String.valueOf(this.user_agent)); 
     builder.append(String.valueOf(this.accept_language)); 
     builder.append(String.valueOf(this.date_added)); 
     builder.append(String.valueOf(this.date_modified)); ;
    return builder.toString();
  }
}