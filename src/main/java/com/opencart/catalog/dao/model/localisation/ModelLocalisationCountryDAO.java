package com.opencart.catalog.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationCountryDAO {
  public Response getCountries();
  public Response getCountry();
}