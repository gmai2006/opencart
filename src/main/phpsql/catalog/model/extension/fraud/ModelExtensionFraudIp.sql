check1=$this->db->query("SELECT * FROM `".DB_PREFIX."fraud_ip` WHERE ip = '".$this->db->escape($order_info['ip'])."'")
#END
check=$this->db->query("SELECT * FROM `".DB_PREFIX."fraud_ip` WHERE ip = '".$this->db->escape($result['ip'])."'")
#END
