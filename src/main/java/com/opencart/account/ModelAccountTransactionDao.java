package com.opencart.account;

import java.util.List;

import com.opencart.entity.*;

public interface ModelAccountTransactionDao {
   public java.math.BigInteger getTotalTransactions(Integer customer_id);

   public java.math.BigDecimal getTotalAmount(Integer customer_id);
}