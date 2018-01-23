package com.opencart.checkout;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelCheckoutOrder0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelCheckoutOrder0Dto.class.getName());

  private Integer order_id ;
  private Integer invoice_no ;
  private String invoice_prefix ;
  private Integer store_id ;
  private String store_name ;
  private String store_url ;
  private Integer customer_id ;
  private Integer customer_group_id ;
  private String firstname ;
  private String lastname ;
  private String email ;
  private String telephone ;
  private String fax ;
  private String custom_field ;
  private String payment_firstname ;
  private String payment_lastname ;
  private String payment_company ;
  private String payment_address_1 ;
  private String payment_address_2 ;
  private String payment_city ;
  private String payment_postcode ;
  private String payment_country ;
  private Integer payment_country_id ;
  private String payment_zone ;
  private Integer payment_zone_id ;
  private String payment_address_format ;
  private String payment_custom_field ;
  private String payment_method ;
  private String payment_code ;
  private String shipping_firstname ;
  private String shipping_lastname ;
  private String shipping_company ;
  private String shipping_address_1 ;
  private String shipping_address_2 ;
  private String shipping_city ;
  private String shipping_postcode ;
  private String shipping_country ;
  private Integer shipping_country_id ;
  private String shipping_zone ;
  private Integer shipping_zone_id ;
  private String shipping_address_format ;
  private String shipping_custom_field ;
  private String shipping_method ;
  private String shipping_code ;
  private String comment ;
  private java.math.BigDecimal total ;
  private Integer order_status_id ;
  private Integer affiliate_id ;
  private java.math.BigDecimal commission ;
  private Integer marketing_id ;
  private String tracking ;
  private Integer language_id ;
  private Integer currency_id ;
  private String currency_code ;
  private java.math.BigDecimal currency_value ;
  private String ip ;
  private String forwarded_ip ;
  private String user_agent ;
  private String accept_language ;
  private java.sql.Timestamp date_added ;
  private java.sql.Timestamp date_modified ;
  private String order_status ;

  public Integer getOrder_id() {
    return this.order_id;
  }
  public void setOrder_id( Integer value) {
    this.order_id = value;
  }
  public Integer getInvoice_no() {
    return this.invoice_no;
  }
  public void setInvoice_no( Integer value) {
    this.invoice_no = value;
  }
  public String getInvoice_prefix() {
    return this.invoice_prefix;
  }
  public void setInvoice_prefix( String value) {
    this.invoice_prefix = value;
  }
  public Integer getStore_id() {
    return this.store_id;
  }
  public void setStore_id( Integer value) {
    this.store_id = value;
  }
  public String getStore_name() {
    return this.store_name;
  }
  public void setStore_name( String value) {
    this.store_name = value;
  }
  public String getStore_url() {
    return this.store_url;
  }
  public void setStore_url( String value) {
    this.store_url = value;
  }
  public Integer getCustomer_id() {
    return this.customer_id;
  }
  public void setCustomer_id( Integer value) {
    this.customer_id = value;
  }
  public Integer getCustomer_group_id() {
    return this.customer_group_id;
  }
  public void setCustomer_group_id( Integer value) {
    this.customer_group_id = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getEmail() {
    return this.email;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getCustom_field() {
    return this.custom_field;
  }
  public void setCustom_field( String value) {
    this.custom_field = value;
  }
  public String getPayment_firstname() {
    return this.payment_firstname;
  }
  public void setPayment_firstname( String value) {
    this.payment_firstname = value;
  }
  public String getPayment_lastname() {
    return this.payment_lastname;
  }
  public void setPayment_lastname( String value) {
    this.payment_lastname = value;
  }
  public String getPayment_company() {
    return this.payment_company;
  }
  public void setPayment_company( String value) {
    this.payment_company = value;
  }
  public String getPayment_address_1() {
    return this.payment_address_1;
  }
  public void setPayment_address_1( String value) {
    this.payment_address_1 = value;
  }
  public String getPayment_address_2() {
    return this.payment_address_2;
  }
  public void setPayment_address_2( String value) {
    this.payment_address_2 = value;
  }
  public String getPayment_city() {
    return this.payment_city;
  }
  public void setPayment_city( String value) {
    this.payment_city = value;
  }
  public String getPayment_postcode() {
    return this.payment_postcode;
  }
  public void setPayment_postcode( String value) {
    this.payment_postcode = value;
  }
  public String getPayment_country() {
    return this.payment_country;
  }
  public void setPayment_country( String value) {
    this.payment_country = value;
  }
  public Integer getPayment_country_id() {
    return this.payment_country_id;
  }
  public void setPayment_country_id( Integer value) {
    this.payment_country_id = value;
  }
  public String getPayment_zone() {
    return this.payment_zone;
  }
  public void setPayment_zone( String value) {
    this.payment_zone = value;
  }
  public Integer getPayment_zone_id() {
    return this.payment_zone_id;
  }
  public void setPayment_zone_id( Integer value) {
    this.payment_zone_id = value;
  }
  public String getPayment_address_format() {
    return this.payment_address_format;
  }
  public void setPayment_address_format( String value) {
    this.payment_address_format = value;
  }
  public String getPayment_custom_field() {
    return this.payment_custom_field;
  }
  public void setPayment_custom_field( String value) {
    this.payment_custom_field = value;
  }
  public String getPayment_method() {
    return this.payment_method;
  }
  public void setPayment_method( String value) {
    this.payment_method = value;
  }
  public String getPayment_code() {
    return this.payment_code;
  }
  public void setPayment_code( String value) {
    this.payment_code = value;
  }
  public String getShipping_firstname() {
    return this.shipping_firstname;
  }
  public void setShipping_firstname( String value) {
    this.shipping_firstname = value;
  }
  public String getShipping_lastname() {
    return this.shipping_lastname;
  }
  public void setShipping_lastname( String value) {
    this.shipping_lastname = value;
  }
  public String getShipping_company() {
    return this.shipping_company;
  }
  public void setShipping_company( String value) {
    this.shipping_company = value;
  }
  public String getShipping_address_1() {
    return this.shipping_address_1;
  }
  public void setShipping_address_1( String value) {
    this.shipping_address_1 = value;
  }
  public String getShipping_address_2() {
    return this.shipping_address_2;
  }
  public void setShipping_address_2( String value) {
    this.shipping_address_2 = value;
  }
  public String getShipping_city() {
    return this.shipping_city;
  }
  public void setShipping_city( String value) {
    this.shipping_city = value;
  }
  public String getShipping_postcode() {
    return this.shipping_postcode;
  }
  public void setShipping_postcode( String value) {
    this.shipping_postcode = value;
  }
  public String getShipping_country() {
    return this.shipping_country;
  }
  public void setShipping_country( String value) {
    this.shipping_country = value;
  }
  public Integer getShipping_country_id() {
    return this.shipping_country_id;
  }
  public void setShipping_country_id( Integer value) {
    this.shipping_country_id = value;
  }
  public String getShipping_zone() {
    return this.shipping_zone;
  }
  public void setShipping_zone( String value) {
    this.shipping_zone = value;
  }
  public Integer getShipping_zone_id() {
    return this.shipping_zone_id;
  }
  public void setShipping_zone_id( Integer value) {
    this.shipping_zone_id = value;
  }
  public String getShipping_address_format() {
    return this.shipping_address_format;
  }
  public void setShipping_address_format( String value) {
    this.shipping_address_format = value;
  }
  public String getShipping_custom_field() {
    return this.shipping_custom_field;
  }
  public void setShipping_custom_field( String value) {
    this.shipping_custom_field = value;
  }
  public String getShipping_method() {
    return this.shipping_method;
  }
  public void setShipping_method( String value) {
    this.shipping_method = value;
  }
  public String getShipping_code() {
    return this.shipping_code;
  }
  public void setShipping_code( String value) {
    this.shipping_code = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public java.math.BigDecimal getTotal() {
    return this.total;
  }
  public void setTotal( java.math.BigDecimal value) {
    this.total = value;
  }
  public Integer getOrder_status_id() {
    return this.order_status_id;
  }
  public void setOrder_status_id( Integer value) {
    this.order_status_id = value;
  }
  public Integer getAffiliate_id() {
    return this.affiliate_id;
  }
  public void setAffiliate_id( Integer value) {
    this.affiliate_id = value;
  }
  public java.math.BigDecimal getCommission() {
    return this.commission;
  }
  public void setCommission( java.math.BigDecimal value) {
    this.commission = value;
  }
  public Integer getMarketing_id() {
    return this.marketing_id;
  }
  public void setMarketing_id( Integer value) {
    this.marketing_id = value;
  }
  public String getTracking() {
    return this.tracking;
  }
  public void setTracking( String value) {
    this.tracking = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public Integer getCurrency_id() {
    return this.currency_id;
  }
  public void setCurrency_id( Integer value) {
    this.currency_id = value;
  }
  public String getCurrency_code() {
    return this.currency_code;
  }
  public void setCurrency_code( String value) {
    this.currency_code = value;
  }
  public java.math.BigDecimal getCurrency_value() {
    return this.currency_value;
  }
  public void setCurrency_value( java.math.BigDecimal value) {
    this.currency_value = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getForwarded_ip() {
    return this.forwarded_ip;
  }
  public void setForwarded_ip( String value) {
    this.forwarded_ip = value;
  }
  public String getUser_agent() {
    return this.user_agent;
  }
  public void setUser_agent( String value) {
    this.user_agent = value;
  }
  public String getAccept_language() {
    return this.accept_language;
  }
  public void setAccept_language( String value) {
    this.accept_language = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public java.sql.Timestamp getDate_modified() {
    return this.date_modified;
  }
  public void setDate_modified( java.sql.Timestamp value) {
    this.date_modified = value;
  }
  public String getOrder_status() {
    return this.order_status;
  }
  public void setOrder_status( String value) {
    this.order_status = value;
  }

  public static ModelCheckoutOrder0Dto fromArray(Object[] o) {
    ModelCheckoutOrder0Dto result = new ModelCheckoutOrder0Dto();
    int i = 0;
    result.setOrder_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setInvoice_no((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setInvoice_prefix((String)DaoUtils.getNullableValue(o[i++]));
    result.setStore_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setStore_name((String)DaoUtils.getNullableValue(o[i++]));
    result.setStore_url((String)DaoUtils.getNullableValue(o[i++]));
    result.setCustomer_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustomer_group_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setFirstname((String)DaoUtils.getNullableValue(o[i++]));
    result.setLastname((String)DaoUtils.getNullableValue(o[i++]));
    result.setEmail((String)DaoUtils.getNullableValue(o[i++]));
    result.setTelephone((String)DaoUtils.getNullableValue(o[i++]));
    result.setFax((String)DaoUtils.getNullableValue(o[i++]));
    result.setCustom_field((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_firstname((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_lastname((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_company((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_address_1((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_address_2((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_city((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_postcode((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_country((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_country_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_zone((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_zone_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_address_format((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_custom_field((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_method((String)DaoUtils.getNullableValue(o[i++]));
    result.setPayment_code((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_firstname((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_lastname((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_company((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_address_1((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_address_2((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_city((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_postcode((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_country((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_country_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_zone((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_zone_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_address_format((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_custom_field((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_method((String)DaoUtils.getNullableValue(o[i++]));
    result.setShipping_code((String)DaoUtils.getNullableValue(o[i++]));
    result.setComment((String)DaoUtils.getNullableValue(o[i++]));
    result.setTotal((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setOrder_status_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setAffiliate_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCommission((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setMarketing_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setTracking((String)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCurrency_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCurrency_code((String)DaoUtils.getNullableValue(o[i++]));
    result.setCurrency_value((java.math.BigDecimal)DaoUtils.getNullableValue(o[i++]));
    result.setIp((String)DaoUtils.getNullableValue(o[i++]));
    result.setForwarded_ip((String)DaoUtils.getNullableValue(o[i++]));
    result.setUser_agent((String)DaoUtils.getNullableValue(o[i++]));
    result.setAccept_language((String)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setDate_modified((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setOrder_status((String)DaoUtils.getNullableValue(o[i++]));
    return result;
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
    builder.append(String.valueOf(this.date_modified)); 
    builder.append(String.valueOf(this.order_status)); ;
    return builder.toString();
  }
}