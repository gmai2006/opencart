package com.opencart.design;

import java.util.List;
import com.opencart.entity.*;

public interface ModelDesignTranslationService {
   public List<OcTranslation> getTranslations(Integer store_id,Integer language_id,String route);
}