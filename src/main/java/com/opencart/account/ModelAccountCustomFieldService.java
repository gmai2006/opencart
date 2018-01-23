package com.opencart.account;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAccountCustomFieldService {
   public List<ModelAccountCustomField0Dto> getCustomFieldValueQuery(Integer custom_field_id,Integer language_id);

   public List<ModelAccountCustomField1Dto> getCustomFieldQuery(Integer language_id,Integer customer_group_id);

   public List<ModelAccountCustomField2Dto> getCustomField(Integer custom_field_id,Integer language_id);
}