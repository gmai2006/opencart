package com.opencart.admin.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencart.utils.BeanUtils;

/**
*/
@XmlRootElement
public class CreateinvoicenoDTO implements Serializable {
  static Log logger = LogFactory.getLog(CreateinvoicenoDTO.class);

  private String invoice_no ;

  public void setInvoiceNo( String value) {
    this.invoice_no = value;
  }
  public String getInvoiceNo() {
    return this.invoice_no;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static CreateinvoicenoDTO fromArray(Object[] o) {
      CreateinvoicenoDTO result = new CreateinvoicenoDTO();
      int i = 0;
        result.setInvoiceNo((String)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.invoice_no)); ;
    return builder.toString();
  }
}