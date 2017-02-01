getTransactionByOrderId=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_transaction` WHERE `order_id` = '".(int)$order_id."' ORDER BY `laybuy_ref_no` DESC LIMIT 1")
#END
isLayBuyOrder=$this->db->query("SELECT * FROM `".DB_PREFIX."laybuy_transaction` WHERE `order_id` = '".(int)$order_id."'")
#END
