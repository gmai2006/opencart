package com.opencart.admin.dao.model.tool;

import javax.ws.rs.core.Response;

public interface ModelToolUploadDAO {
  public Response getUploadByCode();
  public Response addUpload();
  public Response getUpload();
  public Response deleteUpload();
}