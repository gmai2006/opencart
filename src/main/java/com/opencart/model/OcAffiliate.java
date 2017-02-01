package com.opencart.model;

import com.google.gson.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.opencart.utils.BeanUtils;

@Entity
@Table(name="oc_affiliate")
public class OcAffiliate  {
  @Basic
  @Column(name="firstname" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="bank_account_number" , length=64)
  @NotNull
  private String bankAccountNumber;

  @Basic
  @Column(name="code" , length=64)
  @NotNull
  private String code;

  @Id
  @Column(name="affiliate_id" , length=10)
  @NotNull
  private Integer affiliateId;

  @Basic
  @Column(name="city" , length=128)
  @NotNull
  private String city;

  @Basic
  @Column(name="address_1" , length=128)
  @NotNull
  private String address1;

  @Basic
  @Column(name="address_2" , length=128)
  @NotNull
  private String address2;

  @Basic
  @Column(name="bank_swift_code" , length=64)
  @NotNull
  private String bankSwiftCode;

  @Basic
  @Column(name="zone_id" , length=10)
  @NotNull
  private Integer zoneId;

  @Basic
  @Column(name="password" , length=40)
  @NotNull
  private String password;

  @Basic
  @Column(name="approved" )
  @NotNull
  private Boolean approved;

  @Basic
  @Column(name="bank_name" , length=64)
  @NotNull
  private String bankName;

  @Basic
  @Column(name="bank_branch_number" , length=64)
  @NotNull
  private String bankBranchNumber;

  @Basic
  @Column(name="company" , length=40)
  @NotNull
  private String company;

  @Basic
  @Column(name="commission" , length=4)
  @NotNull
  private Long commission;

  @Basic
  @Column(name="payment" , length=6)
  @NotNull
  private String payment;

  @Basic
  @Column(name="fax" , length=32)
  @NotNull
  private String fax;

  @Basic
  @Column(name="paypal" , length=64)
  @NotNull
  private String paypal;

  @Basic
  @Column(name="email" , length=96)
  @NotNull
  private String email;

  @Basic
  @Column(name="website" , length=255)
  @NotNull
  private String website;

  @Basic
  @Column(name="salt" , length=9)
  @NotNull
  private String salt;

  @Basic
  @Column(name="ip" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="postcode" , length=10)
  @NotNull
  private String postcode;

  @Basic
  @Column(name="telephone" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="tax" , length=64)
  @NotNull
  private String tax;

  @Basic
  @Column(name="lastname" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="bank_account_name" , length=64)
  @NotNull
  private String bankAccountName;

  @Basic
  @Column(name="date_added" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="cheque" , length=100)
  @NotNull
  private String cheque;

  @Basic
  @Column(name="country_id" , length=10)
  @NotNull
  private Integer countryId;

  @Basic
  @Column(name="status" )
  @NotNull
  private Boolean status;

  public OcAffiliate() {
  }

  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setBankAccountNumber( String value) {
    this.bankAccountNumber = value;
  }
  public String getBankAccountNumber() {
    return this.bankAccountNumber;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setAffiliateId( Integer value) {
    this.affiliateId = value;
  }
  public Integer getAffiliateId() {
    return this.affiliateId;
  }
  public void setCity( String value) {
    this.city = value;
  }
  public String getCity() {
    return this.city;
  }
  public void setAddress1( String value) {
    this.address1 = value;
  }
  public String getAddress1() {
    return this.address1;
  }
  public void setAddress2( String value) {
    this.address2 = value;
  }
  public String getAddress2() {
    return this.address2;
  }
  public void setBankSwiftCode( String value) {
    this.bankSwiftCode = value;
  }
  public String getBankSwiftCode() {
    return this.bankSwiftCode;
  }
  public void setZoneId( Integer value) {
    this.zoneId = value;
  }
  public Integer getZoneId() {
    return this.zoneId;
  }
  public void setPassword( String value) {
    this.password = value;
  }
  public String getPassword() {
    return this.password;
  }
  public void setApproved( Boolean value) {
    this.approved = value;
  }
  public Boolean getApproved() {
    return this.approved;
  }
  public void setBankName( String value) {
    this.bankName = value;
  }
  public String getBankName() {
    return this.bankName;
  }
  public void setBankBranchNumber( String value) {
    this.bankBranchNumber = value;
  }
  public String getBankBranchNumber() {
    return this.bankBranchNumber;
  }
  public void setCompany( String value) {
    this.company = value;
  }
  public String getCompany() {
    return this.company;
  }
  public void setCommission( Long value) {
    this.commission = value;
  }
  public Long getCommission() {
    return this.commission;
  }
  public void setPayment( String value) {
    this.payment = value;
  }
  public String getPayment() {
    return this.payment;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setPaypal( String value) {
    this.paypal = value;
  }
  public String getPaypal() {
    return this.paypal;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }
  public void setWebsite( String value) {
    this.website = value;
  }
  public String getWebsite() {
    return this.website;
  }
  public void setSalt( String value) {
    this.salt = value;
  }
  public String getSalt() {
    return this.salt;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setPostcode( String value) {
    this.postcode = value;
  }
  public String getPostcode() {
    return this.postcode;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setTax( String value) {
    this.tax = value;
  }
  public String getTax() {
    return this.tax;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setBankAccountName( String value) {
    this.bankAccountName = value;
  }
  public String getBankAccountName() {
    return this.bankAccountName;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCheque( String value) {
    this.cheque = value;
  }
  public String getCheque() {
    return this.cheque;
  }
  public void setCountryId( Integer value) {
    this.countryId = value;
  }
  public Integer getCountryId() {
    return this.countryId;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toJson() {
      OcAffiliate obj = this; 
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(obj);
  }

  public static OcAffiliate fromJson(JsonObject o) {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
      return gson.fromJson(o, OcAffiliate.class);
    }

  public static OcAffiliate fromArray(Object[] o) {
      OcAffiliate result = new OcAffiliate();
      int i = 0;
        result.setFirstname((String)BeanUtils.getNullableValue(o[i++]));
        result.setBankAccountNumber((String)BeanUtils.getNullableValue(o[i++]));
        result.setCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setAffiliateId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setCity((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddress1((String)BeanUtils.getNullableValue(o[i++]));
        result.setAddress2((String)BeanUtils.getNullableValue(o[i++]));
        result.setBankSwiftCode((String)BeanUtils.getNullableValue(o[i++]));
        result.setZoneId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setPassword((String)BeanUtils.getNullableValue(o[i++]));
        result.setApproved((Boolean)BeanUtils.getNullableValue(o[i++]));
        result.setBankName((String)BeanUtils.getNullableValue(o[i++]));
        result.setBankBranchNumber((String)BeanUtils.getNullableValue(o[i++]));
        result.setCompany((String)BeanUtils.getNullableValue(o[i++]));
        result.setCommission((Long)BeanUtils.getNullableValue(o[i++]));
        result.setPayment((String)BeanUtils.getNullableValue(o[i++]));
        result.setFax((String)BeanUtils.getNullableValue(o[i++]));
        result.setPaypal((String)BeanUtils.getNullableValue(o[i++]));
        result.setEmail((String)BeanUtils.getNullableValue(o[i++]));
        result.setWebsite((String)BeanUtils.getNullableValue(o[i++]));
        result.setSalt((String)BeanUtils.getNullableValue(o[i++]));
        result.setIp((String)BeanUtils.getNullableValue(o[i++]));
        result.setPostcode((String)BeanUtils.getNullableValue(o[i++]));
        result.setTelephone((String)BeanUtils.getNullableValue(o[i++]));
        result.setTax((String)BeanUtils.getNullableValue(o[i++]));
        result.setLastname((String)BeanUtils.getNullableValue(o[i++]));
        result.setBankAccountName((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
        result.setCheque((String)BeanUtils.getNullableValue(o[i++]));
        result.setCountryId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setStatus((Boolean)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public static JsonArray toJsonArray(List<OcAffiliate> list) {
      JsonArray array = new JsonArray();
      for (OcAffiliate dao : list) {
        array.add(dao.toJson());
      }
      return array;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.bankAccountNumber)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.affiliateId)); 
     builder.append(String.valueOf(this.city)); 
     builder.append(String.valueOf(this.address1)); 
     builder.append(String.valueOf(this.address2)); 
     builder.append(String.valueOf(this.bankSwiftCode)); 
     builder.append(String.valueOf(this.zoneId)); 
     builder.append(String.valueOf(this.password)); 
     builder.append(String.valueOf(this.approved)); 
     builder.append(String.valueOf(this.bankName)); 
     builder.append(String.valueOf(this.bankBranchNumber)); 
     builder.append(String.valueOf(this.company)); 
     builder.append(String.valueOf(this.commission)); 
     builder.append(String.valueOf(this.payment)); 
     builder.append(String.valueOf(this.fax)); 
     builder.append(String.valueOf(this.paypal)); 
     builder.append(String.valueOf(this.email)); 
     builder.append(String.valueOf(this.website)); 
     builder.append(String.valueOf(this.salt)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.postcode)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.tax)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.bankAccountName)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.cheque)); 
     builder.append(String.valueOf(this.countryId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}