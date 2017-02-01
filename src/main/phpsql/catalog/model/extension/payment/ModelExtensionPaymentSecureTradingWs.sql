confirmOrder=$this->db->query("UPDATE `".DB_PREFIX."order` SET order_status_id = 0 WHERE order_id = ".(int)$order_id)
#END
removeMd=$this->db->query("DELETE FROM ".DB_PREFIX."securetrading_ws_order WHERE md = '".$this->db->escape($md)."'")
#END
updateReference1=$this->db->query("INSERT INTO ".DB_PREFIX."securetrading_ws_order SET order_id = ".(int)$order_id.", transaction_reference = '".$this->db->escape($transaction_reference)."', `created` = now(), `modified` = now()")
#END
getOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."securetrading_ws_order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
updateReference=$this->db->query("UPDATE ".DB_PREFIX."securetrading_ws_order SET transaction_reference = '".$this->db->escape($transaction_reference)."' WHERE order_id = ".(int)$order_id)
#END
getOrderId=$this->db->query("SELECT order_id FROM ".DB_PREFIX."securetrading_ws_order WHERE md = '".$this->db->escape($md)."' LIMIT 1")->row
#END
confirmOrder2=$this->db->query("INSERT INTO `".DB_PREFIX."securetrading_ws_order_transaction` SET `securetrading_ws_order_id` = '".(int)$securetrading_ws_order['securetrading_ws_order_id']."', `amount` = '".$amount."', type = '".$trans_type."',  `created` = now()")
#END
updateOrder=$this->db->query("UPDATE `".DB_PREFIX."order` SET order_status_id = ".(int)$order_status_id." WHERE order_id = ".(int)$order_id)
#END
getMethod=$this->db->query("SELECT * FROM ".DB_PREFIX."zone_to_geo_zone WHERE geo_zone_id = '".(int)$this->config->get('securetrading_ws_geo_zone_id')."' AND country_id = '".(int)$address['country_id']."' AND (zone_id = '".(int)$address['zone_id']."' OR zone_id = '0')")
#END
addMd=$this->db->query("INSERT INTO ".DB_PREFIX."securetrading_ws_order SET order_id = ".(int)$order_id.", md = '".$this->db->escape($md)."', `created` = now(), `modified` = now()")
#END
confirmOrder1=$this->db->query("UPDATE `".DB_PREFIX."securetrading_ws_order` SET `settle_type` = '".$this->config->get('securetrading_ws_settle_status')."', `modified` = now(), `currency_code` = '".$this->db->escape($order_info['currency_code'])."', `total` = '".$amount."' WHERE order_id = ".(int)$order_info['order_id'])
#END
