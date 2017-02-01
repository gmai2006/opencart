package com.opencart.catalog.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogProductDAO {
  public Response getProductDiscounts();
  public Response getProductAttributes1(  Integer AttributeId);
  public Response getProductOptions();
  public Response getProduct();
  public Response getProductImages();
  public Response getProductAttributes(  Integer AttributeGroupId);
  public Response getProductOptions1();
  public Response getProfile();
  public Response getTotalProductSpecials(  Integer ProductId);
  public Response getProductRelated();
  public Response getLatestProducts(  Integer ProductId);
  public Response getBestSellerProducts(  Integer ProductId);
  public Response getProductLayoutId();
  public Response getCategories();
  public Response getPopularProducts(  Integer ProductId);
  public Response getProfiles();
  public Response updateViewed();
}