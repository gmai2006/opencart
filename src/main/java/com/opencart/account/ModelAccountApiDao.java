package com.opencart.account;

import java.util.List;

import com.opencart.entity.*;

public interface ModelAccountApiDao {
   public List<OcApi> getApiByKey(String key);

   public List<OcApiIp> getApiIps(Integer api_id);
}