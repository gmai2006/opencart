package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountReturn1Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountReturn1Dto.class.getName());

  private java.sql.Timestamp date_added ;
  private String status ;
  private String comment ;

  public java.sql.Timestamp getDate_added() {
    return this.date_added;
  }
  public void setDate_added( java.sql.Timestamp value) {
    this.date_added = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setComment( String value) {
    this.comment = value;
  }

  public static ModelAccountReturn1Dto fromArray(Object[] o) {
    ModelAccountReturn1Dto result = new ModelAccountReturn1Dto();
    int i = 0;
    result.setDate_added((java.sql.Timestamp)DaoUtils.getNullableValue(o[i++]));
    result.setStatus((String)DaoUtils.getNullableValue(o[i++]));
    result.setComment((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.date_added)); 
    builder.append(String.valueOf(this.status)); 
    builder.append(String.valueOf(this.comment)); ;
    return builder.toString();
  }
}