package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationCurrencyDAO {
  public Response getCurrency();
  public Response deleteCurrency();
  public Response getCurrencies();
  public Response refresh3();
  public Response refresh2();
  public Response getCurrencyByCode();
  public Response getTotalCurrencies();
  public Response refresh();
  public Response refresh1();
  public Response addCurrency();
  public Response editCurrency();
}