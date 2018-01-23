package com.opencart.setting;

import java.util.List;
import com.opencart.entity.*;

public interface ModelSettingApiService {
   public List<OcApi> login(String username,String password);
}