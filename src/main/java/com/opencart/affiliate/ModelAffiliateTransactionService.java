package com.opencart.affiliate;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAffiliateTransactionService {
   public java.math.BigInteger getTotalTransactions(Integer affiliate_id);

   public java.math.BigDecimal getBalance(Integer affiliate_id);
}