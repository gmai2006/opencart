package com.opencart.extension;

import java.util.List;
import com.opencart.entity.*;

public interface ModelExtensionModuleService {
   public List<OcModule> getModule(Integer module_id);
}