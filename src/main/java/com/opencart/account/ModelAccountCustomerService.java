package com.opencart.account;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAccountCustomerService {
   public List<OcCustomerLogin> addLoginAttempt(String email,String ip);

   public List<OcCustomer> getCustomerByEmail(String email);

   public List<OcCustomerIp> getIps(Integer customer_id);

   public List<OcCustomerLogin> getLoginAttempts(String email);

   public java.math.BigDecimal getRewardTotal(Integer customer_id);

   public List<ModelAccountCustomer0Dto> getCustomerByCode(String code);

   public java.math.BigInteger getTotalCustomersByEmail(String email);

   public List<OcCustomer> getCustomer(Integer customer_id);

   public List<OcCustomer> getCustomerByToken(String token);
}