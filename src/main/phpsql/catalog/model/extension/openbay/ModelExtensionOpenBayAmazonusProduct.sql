insertError1=$this->db->query("UPDATE `".DB_PREFIX."amazonus_product` SET `status` = 'error' WHERE `sku` = '".$this->db->escape($data['sku'])."' AND `insertion_id` = '".$this->db->escape($data['insertion_id'])."'")
#END
getProduct=$this->db->query("SELECT * FROM `".DB_PREFIX."amazonus_product` WHERE `insertion_id` = '".$this->db->escape($insertion_id)."'")->row
#END
linkProduct1=$this->db->query("INSERT INTO `".DB_PREFIX."amazonus_product_link` SET `product_id` = '".(int)$product_id."', `amazonus_sku` = '".$this->db->escape($amazonus_sku)."', `var` = '".$this->db->escape($var)."'")
#END
setSubmitError=$this->db->query("SELECT `sku` FROM `".DB_PREFIX."amazonus_product` WHERE `insertion_id` = '".$this->db->escape($insertion_id)."'")->rows
#END
linkProduct=$this->db->query("SELECT COUNT(*) as 'count' FROM `".DB_PREFIX."amazonus_product_link` WHERE `product_id` = '".(int)$product_id."' AND `amazonus_sku` = '".$this->db->escape($amazonus_sku)."' AND `var` = '".$this->db->escape($var)."' LIMIT 1")->row
#END
deleteErrors=$this->db->query("DELETE FROM `".DB_PREFIX."amazonus_product_error` WHERE `insertion_id` = '".$this->db->escape($insertion_id)."'")
#END
insertError=$this->db->query("INSERT INTO `".DB_PREFIX."amazonus_product_error` SET `sku` = '".$this->db->escape($data['sku'])."', `error_code` = '".(int)$data['error_code']."', `message` = '".$this->db->escape($data['message'])."', `insertion_id` = '".$this->db->escape($data['insertion_id'])."'")
#END
updateSearch=$this->db->query("UPDATE ".DB_PREFIX."amazonus_product_search SET matches = ".(int)$results_found.", `data` = '".$this->db->escape($data)."', `status` = 'finished' WHERE product_id = ".(int)$result['product_id']." LIMIT 1")
#END
setStatus=$this->db->query("UPDATE `".DB_PREFIX."amazonus_product` SET `status` = '".$status_string."' WHERE `insertion_id` = '".$this->db->escape($insertion_id)."'")
#END
getProductRows=$this->db->query("SELECT * FROM `".DB_PREFIX."amazonus_product` WHERE `insertion_id` = '".$this->db->escape($insertion_id)."'")->rows
#END
removeListingReportLock=$this->db->query("UPDATE ".DB_PREFIX."setting SET `value` = '0', serialized = 0 WHERE `key` = 'openbay_amazonus_processing_listing_reports'")
#END
linkItems=$this->db->query("SELECT `var` FROM `".DB_PREFIX."amazonus_product` WHERE `sku` = '".$amazonus_sku."' AND `product_id` = '".(int)$product_id."'")->row
#END
