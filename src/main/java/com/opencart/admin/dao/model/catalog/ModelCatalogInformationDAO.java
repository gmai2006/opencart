package com.opencart.admin.dao.model.catalog;

import javax.ws.rs.core.Response;

public interface ModelCatalogInformationDAO {
  public Response getInformationLayouts();
  public Response getTotalInformationsByLayoutId();
  public Response getInformations();
  public Response getInformationDescriptions();
  public Response addInformation();
  public Response getTotalInformations();
  public Response deleteInformation3();
  public Response deleteInformation2();
  public Response deleteInformation1();
  public Response getInformationStores();
  public Response editInformation6();
  public Response deleteInformation();
  public Response editInformation2();
  public Response editInformation3();
  public Response editInformation4();
  public Response editInformation5();
  public Response addInformation3();
  public Response editInformation();
  public Response editInformation1();
  public Response addInformation1();
  public Response addInformation2();
}