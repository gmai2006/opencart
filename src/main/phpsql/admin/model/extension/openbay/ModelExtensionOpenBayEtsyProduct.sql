getStatus=$this->db->query("SELECT * FROM `".DB_PREFIX."etsy_listing` WHERE `product_id` = '".(int)$product_id."' AND `status` = 1 LIMIT 1")
#END
addLink=$this->db->query("INSERT INTO `".DB_PREFIX."etsy_listing` SET `product_id` = '".(int)$product_id."', `etsy_item_id` = '".$this->db->escape($etsy_item_id)."', `status` = '".(int)$status_id."', `created`  = now()")
#END
