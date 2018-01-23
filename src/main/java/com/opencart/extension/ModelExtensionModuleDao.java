package com.opencart.extension;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionModuleDao {
   public List<OcModule> getModule(Integer module_id);
}