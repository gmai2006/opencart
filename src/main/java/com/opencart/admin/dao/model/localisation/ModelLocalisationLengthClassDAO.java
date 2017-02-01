package com.opencart.admin.dao.model.localisation;

import javax.ws.rs.core.Response;

public interface ModelLocalisationLengthClassDAO {
  public Response getLengthClass();
  public Response editLengthClass1();
  public Response editLengthClass();
  public Response editLengthClass2();
  public Response getLengthClassDescriptions();
  public Response getLengthClassDescriptionByUnit();
  public Response addLengthClass();
  public Response addLengthClass1();
  public Response deleteLengthClass1();
  public Response getTotalLengthClasses();
  public Response deleteLengthClass();
  public Response getLengthClasses();
}