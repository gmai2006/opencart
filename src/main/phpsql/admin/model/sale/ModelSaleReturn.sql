getReturn=$this->db->query("SELECT DISTINCT *, (SELECT CONCAT(c.firstname, ' ', c.lastname) FROM ".DB_PREFIX."customer c WHERE c.customer_id = r.customer_id) AS customer FROM `".DB_PREFIX."return` r WHERE r.return_id = '".(int)$return_id."'")
#END
getTotalReturnHistoriesByReturnStatusId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."return_history WHERE return_status_id = '".(int)$return_status_id."'")
#END
editReturn=$this->db->query("UPDATE `".DB_PREFIX."return` SET order_id = '".(int)$data['order_id']."', product_id = '".(int)$data['product_id']."', customer_id = '".(int)$data['customer_id']."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', product = '".$this->db->escape($data['product'])."', model = '".$this->db->escape($data['model'])."', quantity = '".(int)$data['quantity']."', opened = '".(int)$data['opened']."', return_reason_id = '".(int)$data['return_reason_id']."', return_action_id = '".(int)$data['return_action_id']."', comment = '".$this->db->escape($data['comment'])."', date_ordered = '".$this->db->escape($data['date_ordered'])."', date_modified = NOW() WHERE return_id = '".(int)$return_id."'")
#END
getTotalReturnsByReturnActionId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."return` WHERE return_action_id = '".(int)$return_action_id."'")
#END
addReturnHistory2=$this->db->query("SELECT *, rs.name AS status FROM `".DB_PREFIX."return` r LEFT JOIN ".DB_PREFIX."return_status rs ON (r.return_status_id = rs.return_status_id) WHERE r.return_id = '".(int)$return_id."' AND rs.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addReturnHistory1=$this->db->query("INSERT INTO ".DB_PREFIX."return_history SET return_id = '".(int)$return_id."', return_status_id = '".(int)$data['return_status_id']."', notify = '".(isset($data['notify'])?(int)$data['notify']:0)."', comment = '".$this->db->escape(strip_tags($data['comment']))."', date_added = NOW()")
#END
deleteReturn=$this->db->query("DELETE FROM `".DB_PREFIX."return` WHERE return_id = '".(int)$return_id."'")
#END
deleteReturn1=$this->db->query("DELETE FROM ".DB_PREFIX."return_history WHERE return_id = '".(int)$return_id."'")
#END
addReturnHistory=$this->db->query("UPDATE `".DB_PREFIX."return` SET return_status_id = '".(int)$data['return_status_id']."', date_modified = NOW() WHERE return_id = '".(int)$return_id."'")
#END
addReturn=$this->db->query("INSERT INTO `".DB_PREFIX."return` SET order_id = '".(int)$data['order_id']."', product_id = '".(int)$data['product_id']."', customer_id = '".(int)$data['customer_id']."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', product = '".$this->db->escape($data['product'])."', model = '".$this->db->escape($data['model'])."', quantity = '".(int)$data['quantity']."', opened = '".(int)$data['opened']."', return_reason_id = '".(int)$data['return_reason_id']."', return_action_id = '".(int)$data['return_action_id']."', return_status_id = '".(int)$data['return_status_id']."', comment = '".$this->db->escape($data['comment'])."', date_ordered = '".$this->db->escape($data['date_ordered'])."', date_added = NOW(), date_modified = NOW()")
#END
getReturnHistories=$this->db->query("SELECT rh.date_added, rs.name AS status, rh.comment, rh.notify FROM ".DB_PREFIX."return_history rh LEFT JOIN ".DB_PREFIX."return_status rs ON rh.return_status_id = rs.return_status_id WHERE rh.return_id = '".(int)$return_id."' AND rs.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY rh.date_added ASC LIMIT ".(int)$start.",".(int)$limit)
#END
getTotalReturnsByReturnReasonId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."return` WHERE return_reason_id = '".(int)$return_reason_id."'")
#END
getTotalReturnsByReturnStatusId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."return` WHERE return_status_id = '".(int)$return_status_id."'")
#END
getTotalReturnHistories=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."return_history WHERE return_id = '".(int)$return_id."'")
#END
