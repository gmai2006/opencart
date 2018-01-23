package com.opencart.extension.payment;

import java.util.List;
import com.opencart.entity.*;

public interface ModelExtensionPaymentAmazonLoginPayService {
   public List<OcAddress> addAddress(String firstname,String lastname,String address_1,String address_2,String postcode,String city,Integer zone_id,Integer country_id);
}