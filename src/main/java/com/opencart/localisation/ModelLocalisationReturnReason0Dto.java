package com.opencart.localisation;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelLocalisationReturnReason0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelLocalisationReturnReason0Dto.class.getName());

  private Integer return_reason_id ;
  private String name ;

  public Integer getReturn_reason_id() {
    return this.return_reason_id;
  }
  public void setReturn_reason_id( Integer value) {
    this.return_reason_id = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }

  public static ModelLocalisationReturnReason0Dto fromArray(Object[] o) {
    ModelLocalisationReturnReason0Dto result = new ModelLocalisationReturnReason0Dto();
    int i = 0;
    result.setReturn_reason_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.return_reason_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}