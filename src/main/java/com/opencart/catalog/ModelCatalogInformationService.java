package com.opencart.catalog;

import java.util.List;
import com.opencart.entity.*;

public interface ModelCatalogInformationService {
   public List<ModelCatalogInformation0Dto> getInformation(Integer information_id,Integer language_id,Integer store_id);

   public List<ModelCatalogInformation0Dto> getInformations(Integer language_id,Integer store_id);

   public List<OcInformationToLayout> getInformationLayoutId(Integer information_id,Integer store_id);
}