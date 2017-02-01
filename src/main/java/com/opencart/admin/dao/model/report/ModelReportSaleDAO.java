package com.opencart.admin.dao.model.report;

import javax.ws.rs.core.Response;

public interface ModelReportSaleDAO {
  public Response getTotalOrdersByYear();
  public Response getTotalOrdersByDay();
  public Response getTotalOrdersByCountry();
  public Response getTotalOrdersByWeek();
  public Response getTotalOrdersByMonth();
}