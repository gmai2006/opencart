package com.opencart.account;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAccountCustomerGroupService {
   public List<ModelAccountCustomerGroup0Dto> getCustomerGroup(Integer customer_group_id,Integer language_id);

   public List<ModelAccountCustomerGroup0Dto> getCustomerGroups(Integer language_id);
}