package com.opencart.admin.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogDownloadDAO {
  public Response editDownload();
  public Response deleteDownload1();
  public Response addDownload();
  public Response editDownload1();
  public Response getTotalDownloads();
  public Response getDownloadDescriptions();
  public Response editDownload2();
  public Response getDownload();
  public Response addDownload1();
  public Response deleteDownload();
}