package com.opencart.account;

import java.util.List;

import com.opencart.entity.*;

public interface ModelAccountRewardDao {
   public java.math.BigDecimal getTotalPoints(Integer customer_id);

   public java.math.BigInteger getTotalRewards(Integer customer_id);
}