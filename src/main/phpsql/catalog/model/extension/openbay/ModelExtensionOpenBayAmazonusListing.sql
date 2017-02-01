listingSuccessful=$this->db->query("UPDATE `".DB_PREFIX."amazonus_product` SET `status` = 'ok' WHERE product_id = ".(int)$product_id." AND `version` = 3")
#END
listingFailed=$this->db->query("UPDATE `".DB_PREFIX."amazonus_product` SET `status` = 'error', `messages` = '".$this->db->escape(json_encode($messages))."' WHERE product_id = ".(int)$product_id." AND `version` = 3")
#END
