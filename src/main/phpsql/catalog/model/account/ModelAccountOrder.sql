getOrderOptions=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$order_product_id."'")
#END
getOrderHistories=$this->db->query("SELECT date_added, os.name AS status, oh.comment, oh.notify FROM ".DB_PREFIX."order_history oh LEFT JOIN ".DB_PREFIX."order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = '".(int)$order_id."' AND os.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY oh.date_added")
#END
getOrderProducts=$this->db->query("SELECT * FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
getOrder4=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$order_query->row['shipping_zone_id']."'")
#END
getOrderVouchers=$this->db->query("SELECT * FROM `".DB_PREFIX."order_voucher` WHERE order_id = '".(int)$order_id."'")
#END
getOrder2=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$order_query->row['payment_zone_id']."'")
#END
getOrder3=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$order_query->row['shipping_country_id']."'")
#END
getOrders=$this->db->query("SELECT o.order_id, o.firstname, o.lastname, os.name as status, o.date_added, o.total, o.currency_code, o.currency_value FROM `".DB_PREFIX."order` o LEFT JOIN ".DB_PREFIX."order_status os ON (o.order_status_id = os.order_status_id) WHERE o.customer_id = '".(int)$this->customer->getId()."' AND o.order_status_id > '0' AND o.store_id = '".(int)$this->config->get('config_store_id')."' AND os.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY o.order_id DESC LIMIT ".(int)$start.",".(int)$limit)
#END
getOrder1=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$order_query->row['payment_country_id']."'")
#END
getOrderTotals=$this->db->query("SELECT * FROM ".DB_PREFIX."order_total WHERE order_id = '".(int)$order_id."' ORDER BY sort_order")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."order` WHERE order_id = '".(int)$order_id."' AND customer_id = '".(int)$this->customer->getId()."' AND order_status_id > '0'")
#END
getTotalOrderVouchersByOrderId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order_voucher` WHERE order_id = '".(int)$order_id."'")
#END
getOrderProduct=$this->db->query("SELECT * FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$order_product_id."'")
#END
getTotalOrders=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` o WHERE customer_id = '".(int)$this->customer->getId()."' AND o.order_status_id > '0' AND o.store_id = '".(int)$this->config->get('config_store_id')."'")
#END
getTotalOrderProductsByOrderId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
