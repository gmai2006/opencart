package com.opencart.localisation;

import java.util.List;
import com.opencart.entity.*;

public interface ModelLocalisationLanguageService {
   public List<OcLanguage> getLanguage(Integer language_id);

   public List<OcLanguage> getLanguages();
}