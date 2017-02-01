package com.opencart.admin.dao.model.setting;

import javax.ws.rs.core.Response;

public interface ModelSettingStoreDAO {
  public Response getTotalStoresByLanguage();
  public Response getTotalStoresByCountryId();
  public Response getStores();
  public Response getTotalStoresByCustomerGroupId();
  public Response getStore();
  public Response getTotalStoresByInformationId1();
  public Response editStore();
  public Response getTotalStoresByZoneId();
  public Response deleteStore1();
  public Response addStore();
  public Response getTotalStoresByCurrency();
  public Response deleteStore();
  public Response getTotalStoresByInformationId();
  public Response addStore2();
  public Response addStore1();
  public Response getTotalStoresByOrderStatusId();
  public Response getTotalStores();
  public Response getTotalStoresByLayoutId();
}