package com.opencart.catalog.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationCurrencyDAO {
  public Response getCurrencies();
  public Response getCurrencyByCode();
}