package com.opencart.catalog.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationZoneDAO {
  public Response getZonesByCountryId();
  public Response getZone();
}