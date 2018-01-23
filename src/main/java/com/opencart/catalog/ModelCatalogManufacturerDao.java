package com.opencart.catalog;

import java.util.List;

import com.opencart.entity.*;

public interface ModelCatalogManufacturerDao {
   public List<ModelCatalogManufacturer0Dto> getManufacturer(Integer manufacturer_id,Integer store_id);

   public List<ModelCatalogManufacturer0Dto> getManufacturers(Integer store_id);
}