editCustomer3=$this->db->query("INSERT INTO ".DB_PREFIX."address SET address_id = '".(int)$address['address_id']."', customer_id = '".(int)$customer_id."', firstname = '".$this->db->escape($address['firstname'])."', lastname = '".$this->db->escape($address['lastname'])."', company = '".$this->db->escape($address['company'])."', address_1 = '".$this->db->escape($address['address_1'])."', address_2 = '".$this->db->escape($address['address_2'])."', city = '".$this->db->escape($address['city'])."', postcode = '".$this->db->escape($address['postcode'])."', country_id = '".(int)$address['country_id']."', zone_id = '".(int)$address['zone_id']."', custom_field = '".$this->db->escape(isset($address['custom_field'])?json_encode($address['custom_field']):'')."'")
#END
editCustomer=$this->db->query("UPDATE ".DB_PREFIX."customer SET customer_group_id = '".(int)$data['customer_group_id']."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', custom_field = '".$this->db->escape(isset($data['custom_field'])?json_encode($data['custom_field']):'')."', newsletter = '".(int)$data['newsletter']."', status = '".(int)$data['status']."', approved = '".(int)$data['approved']."', safe = '".(int)$data['safe']."' WHERE customer_id = '".(int)$customer_id."'")
#END
editCustomer2=$this->db->query("DELETE FROM ".DB_PREFIX."address WHERE customer_id = '".(int)$customer_id."'")
#END
editCustomer1=$this->db->query("UPDATE ".DB_PREFIX."customer SET salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."' WHERE customer_id = '".(int)$customer_id."'")
#END
deleteCustomer5=$this->db->query("DELETE FROM ".DB_PREFIX."address WHERE customer_id = '".(int)$customer_id."'")
#END
getAddress2=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$address_query->row['zone_id']."'")
#END
deleteCustomer3=$this->db->query("DELETE FROM ".DB_PREFIX."customer_transaction WHERE customer_id = '".(int)$customer_id."'")
#END
deleteCustomer4=$this->db->query("DELETE FROM ".DB_PREFIX."customer_ip WHERE customer_id = '".(int)$customer_id."'")
#END
getAddress1=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$address_query->row['country_id']."'")
#END
deleteCustomer1=$this->db->query("DELETE FROM ".DB_PREFIX."customer_activity WHERE customer_id = '".(int)$customer_id."'")
#END
getTotalAddressesByZoneId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."address WHERE zone_id = '".(int)$zone_id."'")
#END
editCustomer4=$this->db->query("UPDATE ".DB_PREFIX."customer SET address_id = '".(int)$address_id."' WHERE customer_id = '".(int)$customer_id."'")
#END
deleteCustomer2=$this->db->query("DELETE FROM ".DB_PREFIX."customer_reward WHERE customer_id = '".(int)$customer_id."'")
#END
getRewards=$this->db->query("SELECT * FROM ".DB_PREFIX."customer_reward WHERE customer_id = '".(int)$customer_id."' ORDER BY date_added DESC LIMIT ".(int)$start.",".(int)$limit)
#END
deleteTransaction=$this->db->query("DELETE FROM ".DB_PREFIX."customer_transaction WHERE order_id = '".(int)$order_id."'")
#END
addHistory=$this->db->query("INSERT INTO ".DB_PREFIX."customer_history SET customer_id = '".(int)$customer_id."', comment = '".$this->db->escape(strip_tags($comment))."', date_added = NOW()")
#END
deleteLoginAttempts=$this->db->query("DELETE FROM `".DB_PREFIX."customer_login` WHERE `email` = '".$this->db->escape($email)."'")
#END
getTotalIps=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_ip WHERE customer_id = '".(int)$customer_id."'")
#END
addCustomer=$this->db->query("INSERT INTO ".DB_PREFIX."customer SET customer_group_id = '".(int)$data['customer_group_id']."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', custom_field = '".$this->db->escape(isset($data['custom_field'])?json_encode($data['custom_field']):'')."', newsletter = '".(int)$data['newsletter']."', salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."', status = '".(int)$data['status']."', approved = '".(int)$data['approved']."', safe = '".(int)$data['safe']."', date_added = NOW()")
#END
getTotalHistories=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_history WHERE customer_id = '".(int)$customer_id."'")
#END
getTotalRewards=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_reward WHERE customer_id = '".(int)$customer_id."'")
#END
getTotalCustomersAwaitingApproval=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer WHERE status = '0' OR approved = '0'")
#END
deleteReward=$this->db->query("DELETE FROM ".DB_PREFIX."customer_reward WHERE order_id = '".(int)$order_id."' AND points > 0")
#END
getRewardTotal=$this->db->query("SELECT SUM(points) AS total FROM ".DB_PREFIX."customer_reward WHERE customer_id = '".(int)$customer_id."'")
#END
getTotalCustomersByCustomerGroupId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer WHERE customer_group_id = '".(int)$customer_group_id."'")
#END
getAddress=$this->db->query("SELECT * FROM ".DB_PREFIX."address WHERE address_id = '".(int)$address_id."'")
#END
addTransaction=$this->db->query("INSERT INTO ".DB_PREFIX."customer_transaction SET customer_id = '".(int)$customer_id."', order_id = '".(int)$order_id."', description = '".$this->db->escape($description)."', amount = '".(float)$amount."', date_added = NOW()")
#END
getAddresses=$this->db->query("SELECT address_id FROM ".DB_PREFIX."address WHERE customer_id = '".(int)$customer_id."'")
#END
getTotalAddressesByCustomerId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."address WHERE customer_id = '".(int)$customer_id."'")
#END
getTotalAddressesByCountryId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."address WHERE country_id = '".(int)$country_id."'")
#END
addCustomer1=$this->db->query("INSERT INTO ".DB_PREFIX."address SET customer_id = '".(int)$customer_id."', firstname = '".$this->db->escape($address['firstname'])."', lastname = '".$this->db->escape($address['lastname'])."', company = '".$this->db->escape($address['company'])."', address_1 = '".$this->db->escape($address['address_1'])."', address_2 = '".$this->db->escape($address['address_2'])."', city = '".$this->db->escape($address['city'])."', postcode = '".$this->db->escape($address['postcode'])."', country_id = '".(int)$address['country_id']."', zone_id = '".(int)$address['zone_id']."', custom_field = '".$this->db->escape(isset($address['custom_field'])?json_encode($address['custom_field']):'')."'")
#END
addCustomer2=$this->db->query("UPDATE ".DB_PREFIX."customer SET address_id = '".(int)$address_id."' WHERE customer_id = '".(int)$customer_id."'")
#END
editToken=$this->db->query("UPDATE ".DB_PREFIX."customer SET token = '".$this->db->escape($token)."' WHERE customer_id = '".(int)$customer_id."'")
#END
getTotalCustomerRewardsByOrderId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_reward WHERE order_id = '".(int)$order_id."' AND points > 0")
#END
getTransactions=$this->db->query("SELECT * FROM ".DB_PREFIX."customer_transaction WHERE customer_id = '".(int)$customer_id."' ORDER BY date_added DESC LIMIT ".(int)$start.",".(int)$limit)
#END
deleteCustomer=$this->db->query("DELETE FROM ".DB_PREFIX."customer WHERE customer_id = '".(int)$customer_id."'")
#END
getCustomerByEmail=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."customer WHERE LCASE(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getTotalCustomersByIp=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_ip WHERE ip = '".$this->db->escape($ip)."'")
#END
getTotalTransactions=$this->db->query("SELECT COUNT(*) AS total  FROM ".DB_PREFIX."customer_transaction WHERE customer_id = '".(int)$customer_id."'")
#END
getTransactionTotal=$this->db->query("SELECT SUM(amount) AS total FROM ".DB_PREFIX."customer_transaction WHERE customer_id = '".(int)$customer_id."'")
#END
getCustomer=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."customer WHERE customer_id = '".(int)$customer_id."'")
#END
approve=$this->db->query("UPDATE ".DB_PREFIX."customer SET approved = '1' WHERE customer_id = '".(int)$customer_id."'")
#END
addReward=$this->db->query("INSERT INTO ".DB_PREFIX."customer_reward SET customer_id = '".(int)$customer_id."', order_id = '".(int)$order_id."', points = '".(int)$points."', description = '".$this->db->escape($description)."', date_added = NOW()")
#END
getTotalLoginAttempts=$this->db->query("SELECT * FROM `".DB_PREFIX."customer_login` WHERE `email` = '".$this->db->escape($email)."'")
#END
getHistories=$this->db->query("SELECT comment, date_added FROM ".DB_PREFIX."customer_history WHERE customer_id = '".(int)$customer_id."' ORDER BY date_added DESC LIMIT ".(int)$start.",".(int)$limit)
#END
getIps=$this->db->query("SELECT * FROM ".DB_PREFIX."customer_ip WHERE customer_id = '".(int)$customer_id."' ORDER BY date_added DESC LIMIT ".(int)$start.",".(int)$limit)
#END
getTotalTransactionsByOrderId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_transaction WHERE order_id = '".(int)$order_id."'")
#END
