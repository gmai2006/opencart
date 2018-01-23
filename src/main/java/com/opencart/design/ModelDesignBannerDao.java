package com.opencart.design;

import java.util.List;

import com.opencart.entity.*;

public interface ModelDesignBannerDao {
   public List<ModelDesignBanner0Dto> getBanner(Integer banner_id,Integer language_id);
}