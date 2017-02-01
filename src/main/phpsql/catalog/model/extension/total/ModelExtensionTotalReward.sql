confirm=$this->db->query("INSERT INTO ".DB_PREFIX."customer_reward SET customer_id = '".(int)$order_info['customer_id']."', order_id = '".(int)$order_info['order_id']."', description = '".$this->db->escape(sprintf($this->language->get('text_order_id'),(int)$order_info['order_id']))."', points = '".(float)-$points."', date_added = NOW()")
#END
unconfirm=$this->db->query("DELETE FROM ".DB_PREFIX."customer_reward WHERE order_id = '".(int)$order_id."' AND points < 0")
#END
