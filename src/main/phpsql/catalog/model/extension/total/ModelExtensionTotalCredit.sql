confirm=$this->db->query("INSERT INTO ".DB_PREFIX."customer_transaction SET customer_id = '".(int)$order_info['customer_id']."', order_id = '".(int)$order_info['order_id']."', description = '".$this->db->escape(sprintf($this->language->get('text_order_id'),(int)$order_info['order_id']))."', amount = '".(float)$order_total['value']."', date_added = NOW()")
#END
unconfirm=$this->db->query("DELETE FROM ".DB_PREFIX."customer_transaction WHERE order_id = '".(int)$order_id."'")
#END
