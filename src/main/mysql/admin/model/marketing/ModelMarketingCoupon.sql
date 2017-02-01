getCouponCategories=SELECT * FROM oc_coupon_category WHERE coupon_id = ?1
#END
deleteCoupon3=DELETE FROM oc_coupon_history WHERE coupon_id = ?1
#END
deleteCoupon2=DELETE FROM oc_coupon_category WHERE coupon_id = ?1
#END
deleteCoupon1=DELETE FROM oc_coupon_product WHERE coupon_id = ?1
#END
getCoupon=SELECT DISTINCT * FROM oc_coupon WHERE coupon_id = ?1
#END
getCouponByCode=SELECT DISTINCT * FROM oc_coupon WHERE code = ?1
#END
getTotalCouponHistories=SELECT COUNT(*) AS total FROM oc_coupon_history WHERE coupon_id = ?1
#END
editCoupon4=INSERT INTO oc_coupon_category SET coupon_id = ?1, category_id = ?2
#END
deleteCoupon=DELETE FROM oc_coupon WHERE coupon_id = ?1
#END
getCouponProducts=SELECT * FROM oc_coupon_product WHERE coupon_id = ?1
#END
editCoupon1=DELETE FROM oc_coupon_product WHERE coupon_id = ?1
#END
getCouponHistories=SELECT ch.order_id, CONCAT(c.firstname, ' ', c.lastname) AS customer, ch.amount, ch.date_added FROM oc_coupon_history ch LEFT JOIN oc_customer c ON (ch.customer_id = c.customer_id) WHERE ch.coupon_id = ?1 ORDER BY ch.date_added ASC LIMIT ?2,?3
#END
editCoupon3=DELETE FROM oc_coupon_category WHERE coupon_id = ?1
#END
editCoupon2=INSERT INTO oc_coupon_product SET coupon_id = ?1, product_id = ?2
#END
editCoupon=UPDATE oc_coupon SET name = ?1, code = ?2, discount = ?3, type = ?4, total = ?5, logged = ?6, shipping = ?7, date_start = ?8, date_end = ?9, uses_total = ?10, uses_customer = ?11, status = ?12 WHERE coupon_id = ?13
#END
addCoupon=INSERT INTO oc_coupon SET name = ?1, code = ?2, discount = ?3, type = ?4, total = ?5, logged = ?6, shipping = ?7, date_start = ?8, date_end = ?9, uses_total = ?10, uses_customer = ?11, status = ?12, date_added = NOW()
#END
addCoupon2=INSERT INTO oc_coupon_category SET coupon_id = ?1, category_id = ?2
#END
addCoupon1=INSERT INTO oc_coupon_product SET coupon_id = ?1, product_id = ?2
#END
getTotalCoupons=SELECT COUNT(*) AS total FROM oc_coupon
#END
