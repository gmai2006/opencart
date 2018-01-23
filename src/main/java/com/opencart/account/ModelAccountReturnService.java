package com.opencart.account;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAccountReturnService {
   public List<ModelAccountReturn0Dto> getReturns(Integer customer_id,Integer language_id);

   public java.math.BigInteger getTotalReturns(Integer customer_id);

   public List<ModelAccountReturn1Dto> getReturnHistories(Integer return_id,Integer language_id);

   public List<ModelAccountReturn2Dto> getReturn(String language_id,Integer return_id,Integer customer_id);
}