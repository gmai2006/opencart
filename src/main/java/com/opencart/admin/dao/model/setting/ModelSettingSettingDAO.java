package com.opencart.admin.dao.model.setting;

import javax.ws.rs.core.Response;

public interface ModelSettingSettingDAO {
  public Response editSettingValue();
  public Response editSetting1();
  public Response editSettingValue1();
  public Response editSetting2();
  public Response getSetting();
  public Response editSetting();
  public Response getSettingValue(  String Value);
  public Response deleteSetting();
}