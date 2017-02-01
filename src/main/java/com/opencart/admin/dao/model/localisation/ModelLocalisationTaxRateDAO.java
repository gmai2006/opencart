package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationTaxRateDAO {
  public Response addTaxRate();
  public Response editTaxRate2();
  public Response getTaxRate(  Integer TaxRateId);
  public Response editTaxRate1();
  public Response getTaxRateCustomerGroups();
  public Response editTaxRate();
  public Response deleteTaxRate();
  public Response getTotalTaxRates();
  public Response deleteTaxRate1();
  public Response addTaxRate1();
  public Response getTotalTaxRatesByGeoZoneId();
}