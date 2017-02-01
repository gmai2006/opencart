package com.opencart.admin.dao.model.sale;

import javax.ws.rs.core.Response;

public interface ModelSaleVoucherThemeDAO {
  public Response getVoucherThemes();
  public Response editVoucherTheme1();
  public Response editVoucherTheme2();
  public Response deleteVoucherTheme();
  public Response getTotalVoucherThemes();
  public Response addVoucherTheme();
  public Response getVoucherThemeDescriptions();
  public Response addVoucherTheme1();
  public Response editVoucherTheme();
  public Response deleteVoucherTheme1();
  public Response getVoucherTheme();
}