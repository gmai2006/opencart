package com.opencart.admin.dao.model.report;

import javax.ws.rs.core.Response;

public interface ModelReportCustomerDAO {
  public Response getTotalCustomersByYear();
  public Response getTotalCustomersByDay();
  public Response getTotalCustomersByWeek();
  public Response getTotalCustomersByMonth();
}