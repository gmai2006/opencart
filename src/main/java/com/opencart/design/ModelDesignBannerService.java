package com.opencart.design;

import java.util.List;
import com.opencart.entity.*;

public interface ModelDesignBannerService {
   public List<ModelDesignBanner0Dto> getBanner(Integer banner_id,Integer language_id);
}