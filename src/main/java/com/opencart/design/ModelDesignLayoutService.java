package com.opencart.design;

import java.util.List;
import com.opencart.entity.*;

public interface ModelDesignLayoutService {
   public List<OcLayoutRoute> getLayout(Integer store_id);

   public List<OcLayoutModule> getLayoutModules(Integer layout_id,String position);
}