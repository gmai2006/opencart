package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationGeoZoneDAO {
  public Response addGeoZone();
  public Response getGeoZone();
  public Response editGeoZone3();
  public Response editGeoZone();
  public Response getTotalGeoZones();
  public Response getTotalZoneToGeoZoneByZoneId();
  public Response editGeoZone1();
  public Response getGeoZones();
  public Response editGeoZone2();
  public Response addGeoZone2();
  public Response getZoneToGeoZones();
  public Response getTotalZoneToGeoZoneByGeoZoneId();
  public Response addGeoZone1();
  public Response deleteGeoZone1();
  public Response getTotalZoneToGeoZoneByCountryId();
  public Response deleteGeoZone();
}