listingSuccessful=$this->db->query("UPDATE `".DB_PREFIX."amazon_product` SET `status` = 'ok' WHERE product_id = ".(int)$product_id." AND `marketplaces` = '".$this->db->escape($marketplace)."' AND `version` = 3
		")
#END
listingFailed=$this->db->query("UPDATE `".DB_PREFIX."amazon_product` SET `status` = 'error', `messages` = '".$this->db->escape(json_encode($messages))."' WHERE product_id = ".(int)$product_id." AND `marketplaces` = '".$this->db->escape($marketplace)."' AND `version` = 3")
#END
