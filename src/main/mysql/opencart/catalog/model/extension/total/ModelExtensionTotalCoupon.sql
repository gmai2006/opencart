ModelExtensionTotalCoupon.getCoupon.getCouponQuery=SELECT * FROM "oc_coupon" WHERE code = 'param0' AND ((date_start = '0000-00-00' OR date_start < NOW()) AND (date_end = '0000-00-00' OR date_end > NOW())) AND status = '1'
#END
ModelExtensionTotalCoupon.getCoupon.getCouponHistoryQuery=SELECT COUNT(*) AS total FROM "oc_coupon_history" ch WHERE ch.coupon_id = 'param0' AND ch.customer_id = 'param1'
#END
ModelExtensionTotalCoupon.getCoupon.getCouponProductQuery=SELECT * FROM "oc_coupon_product" WHERE coupon_id = 'param0'
#END
ModelExtensionTotalCoupon.getCoupon.getCouponCategoryQuery=SELECT COUNT(*) AS total FROM "oc_product_to_category" WHERE "product_id" = 'param0' AND category_id = 'param1'
#END
