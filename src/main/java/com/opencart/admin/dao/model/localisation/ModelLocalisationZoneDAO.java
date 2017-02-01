package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationZoneDAO {
  public Response getZonesByCountryId();
  public Response addZone();
  public Response getTotalZonesByCountryId();
  public Response getTotalZones();
  public Response deleteZone();
  public Response editZone();
  public Response getZone();
}