package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationTaxClassDAO {
  public Response editTaxClass();
  public Response getTaxClass();
  public Response addTaxClass();
  public Response deleteTaxClass();
  public Response getTotalTaxClasses();
  public Response editTaxClass2();
  public Response getTotalTaxRulesByTaxRateId(  Integer TaxClassId);
  public Response editTaxClass1();
  public Response getTaxRules();
  public Response deleteTaxClass1();
  public Response getTaxClasses();
  public Response addTaxClass1();
}