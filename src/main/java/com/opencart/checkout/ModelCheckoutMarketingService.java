package com.opencart.checkout;

import java.util.List;
import com.opencart.entity.*;

public interface ModelCheckoutMarketingService {
   public List<OcMarketing> getMarketingByCode(String code);
}