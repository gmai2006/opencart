package com.opencart.setting;

import java.util.List;
import com.opencart.entity.*;

public interface ModelSettingSettingService {
   public List<OcSetting> getSetting(Integer store_id,String code);
}