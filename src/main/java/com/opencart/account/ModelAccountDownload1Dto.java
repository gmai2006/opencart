package com.opencart.account;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelAccountDownload1Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelAccountDownload1Dto.class.getName());

  private String filename ;
  private String mask ;

  public String getFilename() {
    return this.filename;
  }
  public void setFilename( String value) {
    this.filename = value;
  }
  public String getMask() {
    return this.mask;
  }
  public void setMask( String value) {
    this.mask = value;
  }

  public static ModelAccountDownload1Dto fromArray(Object[] o) {
    ModelAccountDownload1Dto result = new ModelAccountDownload1Dto();
    int i = 0;
    result.setFilename((String)DaoUtils.getNullableValue(o[i++]));
    result.setMask((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.filename)); 
    builder.append(String.valueOf(this.mask)); ;
    return builder.toString();
  }
}