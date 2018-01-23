package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountCustomerGroup0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountCustomerGroup0Dto.class.getName());

  private Integer customer_group_id ;
  private Integer approval ;
  private Integer sort_order ;
  private Integer customer_group_id0 ;
  private Integer language_id ;
  private String name ;
  private String description ;

  public Integer getCustomer_group_id() {
    return this.customer_group_id;
  }
  public void setCustomer_group_id( Integer value) {
    this.customer_group_id = value;
  }
  public Integer getApproval() {
    return this.approval;
  }
  public void setApproval( Integer value) {
    this.approval = value;
  }
  public Integer getSort_order() {
    return this.sort_order;
  }
  public void setSort_order( Integer value) {
    this.sort_order = value;
  }
  public Integer getCustomer_group_id0() {
    return this.customer_group_id0;
  }
  public void setCustomer_group_id0( Integer value) {
    this.customer_group_id0 = value;
  }
  public Integer getLanguage_id() {
    return this.language_id;
  }
  public void setLanguage_id( Integer value) {
    this.language_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }

  public static ModelAccountCustomerGroup0Dto fromArray(Object[] o) {
    ModelAccountCustomerGroup0Dto result = new ModelAccountCustomerGroup0Dto();
    int i = 0;
    result.setCustomer_group_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setApproval((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setSort_order((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setCustomer_group_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setDescription((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.customer_group_id)); 
    builder.append(String.valueOf(this.approval)); 
    builder.append(String.valueOf(this.sort_order)); 
    builder.append(String.valueOf(this.customer_group_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.description)); ;
    return builder.toString();
  }
}