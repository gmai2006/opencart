package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountCustomer0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountCustomer0Dto.class.getName());

  private Integer customer_id ;
  private String firstname ;
  private String lastname ;
  private String email ;

  public Integer getCustomer_id() {
    return this.customer_id;
  }
  public void setCustomer_id( Integer value) {
    this.customer_id = value;
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

  public static ModelAccountCustomer0Dto fromArray(Object[] o) {
    ModelAccountCustomer0Dto result = new ModelAccountCustomer0Dto();
    int i = 0;
    result.setCustomer_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setFirstname((String)DaoUtils.getNullableValue(o[i++]));
    result.setLastname((String)DaoUtils.getNullableValue(o[i++]));
    result.setEmail((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.customer_id)); 
    builder.append(String.valueOf(this.firstname)); 
    builder.append(String.valueOf(this.lastname)); 
    builder.append(String.valueOf(this.email)); ;
    return builder.toString();
  }
}