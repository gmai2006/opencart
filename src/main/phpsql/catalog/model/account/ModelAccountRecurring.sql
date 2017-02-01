addOrderRecurringTransaction=$this->db->query("INSERT INTO `".DB_PREFIX."order_recurring_transaction` SET `order_recurring_id` = '".(int)$order_recurring_id."', `date_added` = NOW(), `type` = '".(int)$type."'")
#END
getOrderRecurringTransactions=$this->db->query("SELECT * FROM `".DB_PREFIX."order_recurring_transaction` WHERE `order_recurring_id` = '".(int)$order_recurring_id."'")
#END
getOrderRecurrings=$this->db->query("SELECT `or`.*,`o`.`payment_method`,`o`.`currency_id`,`o`.`currency_value` FROM `".DB_PREFIX."order_recurring` `or` LEFT JOIN `".DB_PREFIX."order` `o` ON `or`.`order_id` = `o`.`order_id` WHERE `o`.`customer_id` = '".(int)$this->customer->getId()."' ORDER BY `o`.`order_id` DESC LIMIT ".(int)$start.",".(int)$limit)
#END
getOrderRecurring=$this->db->query("SELECT `or`.*,`o`.`payment_method`,`o`.`payment_code`,`o`.`currency_code` FROM `".DB_PREFIX."order_recurring` `or` LEFT JOIN `".DB_PREFIX."order` `o` ON `or`.`order_id` = `o`.`order_id` WHERE `or`.`order_recurring_id` = '".(int)$order_recurring_id."' AND `o`.`customer_id` = '".(int)$this->customer->getId()."'")
#END
getOrderRecurringByReference=$this->db->query("SELECT * FROM `".DB_PREFIX."order_recurring` WHERE `reference` = '".$this->db->escape($reference)."'")
#END
getTotalOrderRecurrings=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order_recurring` `or` LEFT JOIN `".DB_PREFIX."order` `o` ON `or`.`order_id` = `o`.`order_id` WHERE `o`.`customer_id` = '".(int)$this->customer->getId()."'")
#END
editOrderRecurringStatus=$this->db->query("UPDATE `".DB_PREFIX."order_recurring` SET `status` = '".(int)$status."' WHERE `order_recurring_id` = '".(int)$order_recurring_id."'")
#END
