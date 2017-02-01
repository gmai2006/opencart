getProductSettings=$this->db->query("SELECT `display`, `plans` FROM `".DB_PREFIX."divido_product` WHERE `product_id` = '".(int)$product_id."'")->row
#END
saveLookup=$this->db->query($query_get_lookup)
#END
saveLookup1=$this->db->query($query_upsert)
#END
getLookupByOrderId=$this->db->query("SELECT * FROM `".DB_PREFIX."divido_lookup` WHERE `order_id` = ".$order_id)
#END
