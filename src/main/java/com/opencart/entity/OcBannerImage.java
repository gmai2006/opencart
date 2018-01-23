
package com.opencart.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_banner_image")
public class OcBannerImage  {
  @Id
  @Column(name="\"banner_image_id\"" , length=10)
  @NotNull
  private Integer banner_image_id;

  @Basic
  @Column(name="\"banner_id\"" , length=10)
  @NotNull
  private Integer banner_id;

  @Basic
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer language_id;

  @Basic
  @Column(name="\"title\"" , length=64)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"link\"" , length=255)
  @NotNull
  private String link;

  @Basic
  @Column(name="\"image\"" , length=255)
  @NotNull
  private String image;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sort_order;

  public OcBannerImage() {
  }

  public void setBannerImageId( Integer value) {
    this.banner_image_id = value;
  }
  public Integer getBannerImageId() {
    return this.banner_image_id;
  }
  public void setBannerId( Integer value) {
    this.banner_id = value;
  }
  public Integer getBannerId() {
    return this.banner_id;
  }
  public void setLanguageId( Integer value) {
    this.language_id = value;
  }
  public Integer getLanguageId() {
    return this.language_id;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setSortOrder( Integer value) {
    this.sort_order = value;
  }
  public Integer getSortOrder() {
    return this.sort_order;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.banner_image_id)); 
     builder.append(String.valueOf(this.banner_id)); 
     builder.append(String.valueOf(this.language_id)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.link)); 
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.sort_order)); ;
    return builder.toString();
  }
}