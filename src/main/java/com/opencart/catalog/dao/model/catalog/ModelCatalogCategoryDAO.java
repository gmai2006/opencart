package com.opencart.catalog.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogCategoryDAO {
  public Response getTotalCategoriesByCategoryId();
  public Response getCategoryFilters(  Integer FilterId);
  public Response getCategoryLayoutId();
  public Response getCategories();
  public Response getCategoryFilters2(  Integer FilterId);
  public Response getCategory();
  public Response getCategoryFilters1(  Integer FilterGroupId);
}