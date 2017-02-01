package com.opencart.admin.dao.model.design;

import javax.ws.rs.core.Response;

public interface ModelDesignLanguageDAO {
  public Response editTranslation1();
  public Response editTranslation();
  public Response getTotalTranslations();
  public Response getTranslations();
}