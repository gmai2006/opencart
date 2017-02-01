package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationLocationDAO {
  public Response deleteLocation();
  public Response getLocation();
  public Response editLocation();
  public Response addLocation();
  public Response getTotalLocations();
}