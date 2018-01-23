package com.opencart.extension.total;

import java.io.Serializable;
import java.util.logging.Logger;

import com.opencart.util.DaoUtils;

@SuppressWarnings("serial")
public class ModelExtensionTotalVoucherTheme0Dto implements Serializable {
  private final static Logger logger = Logger.getLogger(ModelExtensionTotalVoucherTheme0Dto.class.getName());

  private Integer voucher_theme_id ;
  private String image ;
  private Integer voucher_theme_id0 ;
  private Integer language_id ;
  private String name ;

  public Integer getVoucher_theme_id() {
    return this.voucher_theme_id;
  }
  public void setVoucher_theme_id( Integer value) {
    this.voucher_theme_id = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public Integer getVoucher_theme_id0() {
    return this.voucher_theme_id0;
  }
  public void setVoucher_theme_id0( Integer value) {
    this.voucher_theme_id0 = value;
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

  public static ModelExtensionTotalVoucherTheme0Dto fromArray(Object[] o) {
    ModelExtensionTotalVoucherTheme0Dto result = new ModelExtensionTotalVoucherTheme0Dto();
    int i = 0;
    result.setVoucher_theme_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setImage((String)DaoUtils.getNullableValue(o[i++]));
    result.setVoucher_theme_id0((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setLanguage_id((Integer)DaoUtils.getNullableValue(o[i++]));
    result.setName((String)DaoUtils.getNullableValue(o[i++]));
    return result;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(String.valueOf(this.voucher_theme_id)); 
    builder.append(String.valueOf(this.image)); 
    builder.append(String.valueOf(this.voucher_theme_id0)); 
    builder.append(String.valueOf(this.language_id)); 
    builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}