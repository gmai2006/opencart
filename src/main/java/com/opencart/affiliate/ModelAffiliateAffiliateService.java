package com.opencart.affiliate;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAffiliateAffiliateService {
   public java.math.BigDecimal getTransactionTotal(Integer affiliate_id);

   public List<OcAffiliate> getAffiliate(Integer affiliate_id);

   public List<OcAffiliate> getAffiliateByEmail(String email);

   public java.math.BigInteger getTotalAffiliatesByEmail(String email);

   public List<OcAffiliate> getAffiliateByCode(String code);

   public List<OcAffiliateLogin> addLoginAttempt(String email,String ip);

   public List<OcAffiliateLogin> getLoginAttempts(String email);
}