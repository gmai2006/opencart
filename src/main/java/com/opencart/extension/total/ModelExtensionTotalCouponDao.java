package com.opencart.extension.total;

import java.util.List;

import com.opencart.entity.*;

public interface ModelExtensionTotalCouponDao {
   public java.math.BigInteger getCouponHistoryQuery(Integer coupon_id,Integer customer_id);

   public List<OcCoupon> getCouponQuery(String code);

   public java.math.BigInteger getCouponCategoryQuery(Integer product_id,Integer category_id);

   public List<OcCouponProduct> getCouponProductQuery(Integer coupon_id);
}