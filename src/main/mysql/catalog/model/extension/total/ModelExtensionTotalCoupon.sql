getCoupon1=SELECT COUNT(*) AS total FROM  oc_coupon_history  ch WHERE ch.coupon_id = ?1
#END
confirm=INSERT INTO  oc_coupon_history  SET coupon_id = ?1, order_id = ?2, customer_id = ?3, amount = ?4, date_added = NOW()
#END
getCoupon3=SELECT * FROM  oc_coupon_product  WHERE coupon_id = ?1
#END
getCoupon2=SELECT COUNT(*) AS total FROM  oc_coupon_history  ch WHERE ch.coupon_id = ?1 AND ch.customer_id = ?2
#END
getCoupon=SELECT * FROM  oc_coupon  WHERE code = ?1 AND ((date_start = '0000-00-00' OR date_start < NOW()) AND (date_end = '0000-00-00' OR date_end > NOW())) AND status = '1'
#END
getCoupon5=SELECT COUNT(*) AS total FROM  oc_product_to_category  WHERE  product_id  = ?1 AND category_id = ?2
#END
getCoupon4=SELECT * FROM  oc_coupon_category  cc LEFT JOIN  oc_category_path  cp ON (cc.category_id = cp.path_id) WHERE cc.coupon_id = ?1
#END
unconfirm=DELETE FROM  oc_coupon_history  WHERE order_id = ?1
#END
