addActivity=$this->db->query("INSERT INTO `".DB_PREFIX."customer_activity` SET `customer_id` = '".(int)$customer_id."', `key` = '".$this->db->escape($key)."', `data` = '".$this->db->escape(json_encode($data))."', `ip` = '".$this->db->escape($this->request->server['REMOTE_ADDR'])."', `date_added` = NOW()")
#END
