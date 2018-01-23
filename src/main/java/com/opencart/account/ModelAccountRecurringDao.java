package com.opencart.account;

import java.util.List;

import com.opencart.entity.*;

public interface ModelAccountRecurringDao {
   public List<ModelAccountRecurring0Dto> getOrderRecurring(Integer order_recurring_id,Integer customer_id);

   public java.math.BigInteger getTotalOrderRecurrings(Integer customer_id);

   public List<OcOrderRecurringTransaction> getOrderRecurringTransactions(Integer order_recurring_id);

   public List<OcOrderRecurring> getOrderRecurringByReference(String reference);

   public List<ModelAccountRecurring1Dto> getOrderRecurrings(Integer customer_id);
}