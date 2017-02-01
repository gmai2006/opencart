package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationCountryDAO {
  public Response addCountry();
  public Response getCountries();
  public Response getCountry();
  public Response editCountry();
  public Response deleteCountry();
  public Response getTotalCountries();
}