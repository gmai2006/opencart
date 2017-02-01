getTotalAmount=$this->db->query("SELECT SUM(amount) AS total FROM `".DB_PREFIX."customer_transaction` WHERE customer_id = '".(int)$this->customer->getId()."' GROUP BY customer_id")
#END
getTotalTransactions=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."customer_transaction` WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
