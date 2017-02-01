package com.opencart.catalog.dao.model.account;

import javax.ws.rs.core.Response;

public interface ModelAccountDownloadDAO {
  public Response getTotalDownloads();
  public Response getDownload(  String Filename);
  public Response getDownloads(  Integer DownloadId);
}