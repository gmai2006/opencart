package com.opencart.admin.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogAttributeDAO {
  public Response editAttribute1();
  public Response getAttribute();
  public Response getTotalAttributes();
  public Response addAttribute();
  public Response deleteAttribute();
  public Response editAttribute();
  public Response deleteAttribute1();
  public Response getTotalAttributesByAttributeGroupId();
  public Response addAttribute1();
  public Response editAttribute2();
  public Response getAttributeDescriptions();
}