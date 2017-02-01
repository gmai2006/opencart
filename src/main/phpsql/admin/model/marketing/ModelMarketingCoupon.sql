getCouponCategories=$this->db->query("SELECT * FROM ".DB_PREFIX."coupon_category WHERE coupon_id = '".(int)$coupon_id."'")
#END
deleteCoupon3=$this->db->query("DELETE FROM ".DB_PREFIX."coupon_history WHERE coupon_id = '".(int)$coupon_id."'")
#END
deleteCoupon2=$this->db->query("DELETE FROM ".DB_PREFIX."coupon_category WHERE coupon_id = '".(int)$coupon_id."'")
#END
deleteCoupon1=$this->db->query("DELETE FROM ".DB_PREFIX."coupon_product WHERE coupon_id = '".(int)$coupon_id."'")
#END
getCoupon=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."coupon WHERE coupon_id = '".(int)$coupon_id."'")
#END
getCouponByCode=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."coupon WHERE code = '".$this->db->escape($code)."'")
#END
getTotalCouponHistories=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."coupon_history WHERE coupon_id = '".(int)$coupon_id."'")
#END
editCoupon4=$this->db->query("INSERT INTO ".DB_PREFIX."coupon_category SET coupon_id = '".(int)$coupon_id."', category_id = '".(int)$category_id."'")
#END
deleteCoupon=$this->db->query("DELETE FROM ".DB_PREFIX."coupon WHERE coupon_id = '".(int)$coupon_id."'")
#END
getCouponProducts=$this->db->query("SELECT * FROM ".DB_PREFIX."coupon_product WHERE coupon_id = '".(int)$coupon_id."'")
#END
editCoupon1=$this->db->query("DELETE FROM ".DB_PREFIX."coupon_product WHERE coupon_id = '".(int)$coupon_id."'")
#END
getCouponHistories=$this->db->query("SELECT ch.order_id, CONCAT(c.firstname, ' ', c.lastname) AS customer, ch.amount, ch.date_added FROM ".DB_PREFIX."coupon_history ch LEFT JOIN ".DB_PREFIX."customer c ON (ch.customer_id = c.customer_id) WHERE ch.coupon_id = '".(int)$coupon_id."' ORDER BY ch.date_added ASC LIMIT ".(int)$start.",".(int)$limit)
#END
editCoupon3=$this->db->query("DELETE FROM ".DB_PREFIX."coupon_category WHERE coupon_id = '".(int)$coupon_id."'")
#END
editCoupon2=$this->db->query("INSERT INTO ".DB_PREFIX."coupon_product SET coupon_id = '".(int)$coupon_id."', product_id = '".(int)$product_id."'")
#END
editCoupon=$this->db->query("UPDATE ".DB_PREFIX."coupon SET name = '".$this->db->escape($data['name'])."', code = '".$this->db->escape($data['code'])."', discount = '".(float)$data['discount']."', type = '".$this->db->escape($data['type'])."', total = '".(float)$data['total']."', logged = '".(int)$data['logged']."', shipping = '".(int)$data['shipping']."', date_start = '".$this->db->escape($data['date_start'])."', date_end = '".$this->db->escape($data['date_end'])."', uses_total = '".(int)$data['uses_total']."', uses_customer = '".(int)$data['uses_customer']."', status = '".(int)$data['status']."' WHERE coupon_id = '".(int)$coupon_id."'")
#END
addCoupon=$this->db->query("INSERT INTO ".DB_PREFIX."coupon SET name = '".$this->db->escape($data['name'])."', code = '".$this->db->escape($data['code'])."', discount = '".(float)$data['discount']."', type = '".$this->db->escape($data['type'])."', total = '".(float)$data['total']."', logged = '".(int)$data['logged']."', shipping = '".(int)$data['shipping']."', date_start = '".$this->db->escape($data['date_start'])."', date_end = '".$this->db->escape($data['date_end'])."', uses_total = '".(int)$data['uses_total']."', uses_customer = '".(int)$data['uses_customer']."', status = '".(int)$data['status']."', date_added = NOW()")
#END
addCoupon2=$this->db->query("INSERT INTO ".DB_PREFIX."coupon_category SET coupon_id = '".(int)$coupon_id."', category_id = '".(int)$category_id."'")
#END
addCoupon1=$this->db->query("INSERT INTO ".DB_PREFIX."coupon_product SET coupon_id = '".(int)$coupon_id."', product_id = '".(int)$product_id."'")
#END
getTotalCoupons=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."coupon")
#END
