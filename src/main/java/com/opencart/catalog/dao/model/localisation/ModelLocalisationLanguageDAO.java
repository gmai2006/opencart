package com.opencart.catalog.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationLanguageDAO {
  public Response getLanguage();
  public Response getLanguages();
}