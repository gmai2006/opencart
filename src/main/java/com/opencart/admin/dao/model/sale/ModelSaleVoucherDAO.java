package com.opencart.admin.dao.model.sale;

import javax.ws.rs.core.Response;

public interface ModelSaleVoucherDAO {
  public Response deleteVoucher();
  public Response editVoucher();
  public Response deleteVoucher1();
  public Response getVoucherByCode();
  public Response addVoucher();
  public Response getTotalVouchersByVoucherThemeId();
  public Response getVoucher();
  public Response getTotalVoucherHistories();
  public Response getVoucherHistories(  Integer OrderId);
  public Response getTotalVouchers();
}