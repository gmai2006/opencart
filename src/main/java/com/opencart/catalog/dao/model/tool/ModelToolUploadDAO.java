package com.opencart.catalog.dao.model.tool;

import javax.ws.rs.core.Response;

public interface ModelToolUploadDAO {
  public Response getUploadByCode();
  public Response addUpload();
}