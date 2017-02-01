getBalance=$this->db->query("SELECT SUM(amount) AS total FROM `".DB_PREFIX."affiliate_transaction` WHERE affiliate_id = '".(int)$this->affiliate->getId()."' GROUP BY affiliate_id")
#END
getTotalTransactions=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."affiliate_transaction` WHERE affiliate_id = '".(int)$this->affiliate->getId()."'")
#END
