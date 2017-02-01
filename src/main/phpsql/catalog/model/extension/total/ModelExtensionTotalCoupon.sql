getCoupon1=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."coupon_history` ch WHERE ch.coupon_id = '".(int)$coupon_query->row['coupon_id']."'")
#END
confirm=$this->db->query("INSERT INTO `".DB_PREFIX."coupon_history` SET coupon_id = '".(int)$coupon_info['coupon_id']."', order_id = '".(int)$order_info['order_id']."', customer_id = '".(int)$order_info['customer_id']."', amount = '".(float)$order_total['value']."', date_added = NOW()")
#END
getCoupon3=$this->db->query("SELECT * FROM `".DB_PREFIX."coupon_product` WHERE coupon_id = '".(int)$coupon_query->row['coupon_id']."'")
#END
getCoupon2=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."coupon_history` ch WHERE ch.coupon_id = '".(int)$coupon_query->row['coupon_id']."' AND ch.customer_id = '".(int)$this->customer->getId()."'")
#END
getCoupon=$this->db->query("SELECT * FROM `".DB_PREFIX."coupon` WHERE code = '".$this->db->escape($code)."' AND ((date_start = '0000-00-00' OR date_start < NOW()) AND (date_end = '0000-00-00' OR date_end > NOW())) AND status = '1'")
#END
getCoupon5=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."product_to_category` WHERE `product_id` = '".(int)$product['product_id']."' AND category_id = '".(int)$category_id."'")
#END
getCoupon4=$this->db->query("SELECT * FROM `".DB_PREFIX."coupon_category` cc LEFT JOIN `".DB_PREFIX."category_path` cp ON (cc.category_id = cp.path_id) WHERE cc.coupon_id = '".(int)$coupon_query->row['coupon_id']."'")
#END
unconfirm=$this->db->query("DELETE FROM `".DB_PREFIX."coupon_history` WHERE order_id = '".(int)$order_id."'")
#END
