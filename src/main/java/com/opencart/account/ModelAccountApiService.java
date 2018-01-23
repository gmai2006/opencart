package com.opencart.account;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAccountApiService {
   public List<OcApi> getApiByKey(String key);

   public List<OcApiIp> getApiIps(Integer api_id);
}