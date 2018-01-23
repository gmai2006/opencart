package com.opencart.design;

import java.util.List;
import com.opencart.entity.*;

public interface ModelDesignThemeService {
   public List<OcTheme> getTheme(Integer store_id,String theme,String route);
}