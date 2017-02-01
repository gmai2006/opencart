getRecurringTransactions=$this->db->query("SELECT amount, type, date_added FROM ".DB_PREFIX."order_recurring_transaction WHERE order_recurring_id = ".(int)$order_recurring_id." ORDER BY date_added DESC")
#END
getRecurring=$this->db->query("SELECT * FROM ".DB_PREFIX."order_recurring WHERE order_recurring_id = ".(int)$order_recurring_id)
#END
