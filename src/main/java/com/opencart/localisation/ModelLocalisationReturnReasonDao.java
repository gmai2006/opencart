package com.opencart.localisation;

import java.util.List;

import com.opencart.entity.*;

public interface ModelLocalisationReturnReasonDao {
   public List<ModelLocalisationReturnReason0Dto> getReturnReasons(Integer language_id);
}