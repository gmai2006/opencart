package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationWeightClassDAO {
  public Response editWeightClass1();
  public Response getTotalWeightClasses();
  public Response deleteWeightClass();
  public Response getWeightClassDescriptions();
  public Response deleteWeightClass1();
  public Response getWeightClassDescriptionByUnit();
  public Response addWeightClass1();
  public Response editWeightClass2();
  public Response addWeightClass();
  public Response editWeightClass();
  public Response getWeightClass();
  public Response getWeightClasses();
}