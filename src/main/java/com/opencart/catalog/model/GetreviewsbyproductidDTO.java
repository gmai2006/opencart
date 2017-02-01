package com.opencart.catalog.model;

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
public class GetreviewsbyproductidDTO implements Serializable {
  static Log logger = LogFactory.getLog(GetreviewsbyproductidDTO.class);

  private Integer ReviewId ;
  private String Author ;
  private Integer Rating ;
  private String Text ;
  private Integer ProductId ;
  private String Name ;
  private Long Price ;
  private String Image ;
  private java.sql.Timestamp DateAdded ;

  public void setReviewId( Integer value) {
    this.ReviewId = value;
  }
  public Integer getReviewId() {
    return this.ReviewId;
  }
  public void setAuthor( String value) {
    this.Author = value;
  }
  public String getAuthor() {
    return this.Author;
  }
  public void setRating( Integer value) {
    this.Rating = value;
  }
  public Integer getRating() {
    return this.Rating;
  }
  public void setText( String value) {
    this.Text = value;
  }
  public String getText() {
    return this.Text;
  }
  public void setProductId( Integer value) {
    this.ProductId = value;
  }
  public Integer getProductId() {
    return this.ProductId;
  }
  public void setName( String value) {
    this.Name = value;
  }
  public String getName() {
    return this.Name;
  }
  public void setPrice( Long value) {
    this.Price = value;
  }
  public Long getPrice() {
    return this.Price;
  }
  public void setImage( String value) {
    this.Image = value;
  }
  public String getImage() {
    return this.Image;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.DateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.DateAdded;
  }

  public String toJson() {
    Gson gson = new GsonBuilder()
           .setDateFormat("yyyy-MM-dd").create();
    return gson.toJson(this);
  }

  public static GetreviewsbyproductidDTO fromArray(Object[] o) {
      GetreviewsbyproductidDTO result = new GetreviewsbyproductidDTO();
      int i = 0;
        result.setReviewId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setAuthor((String)BeanUtils.getNullableValue(o[i++]));
        result.setRating((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setText((String)BeanUtils.getNullableValue(o[i++]));
        result.setProductId((Integer)BeanUtils.getNullableValue(o[i++]));
        result.setName((String)BeanUtils.getNullableValue(o[i++]));
        result.setPrice((Long)BeanUtils.getNullableValue(o[i++]));
        result.setImage((String)BeanUtils.getNullableValue(o[i++]));
        result.setDateAdded((java.sql.Timestamp)BeanUtils.getNullableValue(o[i++]));
      return result;
    }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.ReviewId)); 
     builder.append(String.valueOf(this.Author)); 
     builder.append(String.valueOf(this.Rating)); 
     builder.append(String.valueOf(this.Text)); 
     builder.append(String.valueOf(this.ProductId)); 
     builder.append(String.valueOf(this.Name)); 
     builder.append(String.valueOf(this.Price)); 
     builder.append(String.valueOf(this.Image)); 
     builder.append(String.valueOf(this.DateAdded)); ;
    return builder.toString();
  }
}