getTotalRewards=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."customer_reward` WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
getTotalPoints=$this->db->query("SELECT SUM(points) AS total FROM `".DB_PREFIX."customer_reward` WHERE customer_id = '".(int)$this->customer->getId()."' GROUP BY customer_id")
#END
