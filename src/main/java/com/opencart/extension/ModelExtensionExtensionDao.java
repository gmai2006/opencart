package com.opencart.extension;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionExtensionDao {
   public List<OcExtension> getExtensions(String type);
}