package com.opencart.account;

import java.util.List;
import com.opencart.entity.*;

public interface ModelAccountWishlistService {
   public List<OcCustomerWishlist> getWishlist(Integer customer_id);

   public java.math.BigInteger getTotalWishlist(Integer customer_id);
}