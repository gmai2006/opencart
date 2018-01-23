package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountDownload0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountDownload0Dto.class.getName());

  private Integer download_id ;
  private Integer order_id ;
  private java.sql.Timestamp date_added ;
  private String name ;
  private String filename ;

  public Integer getDownload_id() {
    return this.download_id;
  }
  public void setDownload_id( Integer value) {
    this.download_id = value;
  }
  public Integer getOrder_id() {
    return this.order_id;
  }
  public void setOrder_id( Integer value) {
    this.order_id = value;
  }
  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getFilename() {
    return this.filename;
  }
  public void setFilename( String value) {
    this.filename = value;
  }

  public static ModelAccountDownload0Dto fromArray(Object[] o) {
    ModelAccountDownload0Dto result = new ModelAccountDownload0Dto();
    int i = 0;
    result.setDownload_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setOrder_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    result.setFilename((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.download_id)); 
    builder.append(String.valueOf(this.order_id)); 
    builder.append(String.valueOf(this.date_added)); 
    builder.append(String.valueOf(this.name)); 
    builder.append(String.valueOf(this.filename)); ;
    return builder.toString();
  }
}