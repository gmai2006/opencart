getTransactions=$this->db->query("SELECT * FROM ".DB_PREFIX."affiliate_transaction WHERE affiliate_id = '".(int)$affiliate_id."' ORDER BY date_added DESC LIMIT ".(int)$start.",".(int)$limit)
#END
deleteAffiliate2=$this->db->query("DELETE FROM ".DB_PREFIX."affiliate_transaction WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
getAffiliateByEmail=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."affiliate WHERE LCASE(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getAffiliate=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."affiliate WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
deleteTransaction=$this->db->query("DELETE FROM ".DB_PREFIX."affiliate_transaction WHERE order_id = '".(int)$order_id."'")
#END
editAffiliate=$this->db->query("UPDATE ".DB_PREFIX."affiliate SET firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', company = '".$this->db->escape($data['company'])."', website = '".$this->db->escape($data['website'])."', address_1 = '".$this->db->escape($data['address_1'])."', address_2 = '".$this->db->escape($data['address_2'])."', city = '".$this->db->escape($data['city'])."', postcode = '".$this->db->escape($data['postcode'])."', country_id = '".(int)$data['country_id']."', zone_id = '".(int)$data['zone_id']."', code = '".$this->db->escape($data['code'])."', commission = '".(float)$data['commission']."', tax = '".$this->db->escape($data['tax'])."', payment = '".$this->db->escape($data['payment'])."', cheque = '".$this->db->escape($data['cheque'])."', paypal = '".$this->db->escape($data['paypal'])."', bank_name = '".$this->db->escape($data['bank_name'])."', bank_branch_number = '".$this->db->escape($data['bank_branch_number'])."', bank_swift_code = '".$this->db->escape($data['bank_swift_code'])."', bank_account_name = '".$this->db->escape($data['bank_account_name'])."', bank_account_number = '".$this->db->escape($data['bank_account_number'])."', status = '".(int)$data['status']."' WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
getTotalAffiliatesByCountryId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."affiliate WHERE country_id = '".(int)$country_id."'")
#END
getTotalTransactions=$this->db->query("SELECT COUNT(*) AS total  FROM ".DB_PREFIX."affiliate_transaction WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
getTransactionTotal=$this->db->query("SELECT SUM(amount) AS total FROM ".DB_PREFIX."affiliate_transaction WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
deleteLoginAttempts=$this->db->query("DELETE FROM `".DB_PREFIX."affiliate_login` WHERE `email` = '".$this->db->escape($email)."'")
#END
getAffiliatesByNewsletter=$this->db->query("SELECT * FROM ".DB_PREFIX."affiliate WHERE newsletter = '1' ORDER BY firstname, lastname, email")
#END
editAffiliate1=$this->db->query("UPDATE ".DB_PREFIX."affiliate SET salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."' WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
deleteAffiliate=$this->db->query("DELETE FROM ".DB_PREFIX."affiliate WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
addAffiliate=$this->db->query("INSERT INTO ".DB_PREFIX."affiliate SET firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."', company = '".$this->db->escape($data['company'])."', website = '".$this->db->escape($data['website'])."', address_1 = '".$this->db->escape($data['address_1'])."', address_2 = '".$this->db->escape($data['address_2'])."', city = '".$this->db->escape($data['city'])."', postcode = '".$this->db->escape($data['postcode'])."', country_id = '".(int)$data['country_id']."', zone_id = '".(int)$data['zone_id']."', code = '".$this->db->escape($data['code'])."', commission = '".(float)$data['commission']."', tax = '".$this->db->escape($data['tax'])."', payment = '".$this->db->escape($data['payment'])."', cheque = '".$this->db->escape($data['cheque'])."', paypal = '".$this->db->escape($data['paypal'])."', bank_name = '".$this->db->escape($data['bank_name'])."', bank_branch_number = '".$this->db->escape($data['bank_branch_number'])."', bank_swift_code = '".$this->db->escape($data['bank_swift_code'])."', bank_account_name = '".$this->db->escape($data['bank_account_name'])."', bank_account_number = '".$this->db->escape($data['bank_account_number'])."', status = '".(int)$data['status']."', date_added = NOW()")
#END
approve=$this->db->query("UPDATE ".DB_PREFIX."affiliate SET approved = '1' WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
deleteAffiliate1=$this->db->query("DELETE FROM ".DB_PREFIX."affiliate_activity WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
getTotalLoginAttempts=$this->db->query("SELECT * FROM `".DB_PREFIX."affiliate_login` WHERE `email` = '".$this->db->escape($email)."'")
#END
getTotalAffiliatesByZoneId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."affiliate WHERE zone_id = '".(int)$zone_id."'")
#END
addTransaction=$this->db->query("INSERT INTO ".DB_PREFIX."affiliate_transaction SET affiliate_id = '".(int)$affiliate_id."', order_id = '".(float)$order_id."', description = '".$this->db->escape($description)."', amount = '".(float)$amount."', date_added = NOW()")
#END
getTotalAffiliatesAwaitingApproval=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."affiliate WHERE status = '0' OR approved = '0'")
#END
getAffiliateByCode=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."affiliate WHERE code = '".$this->db->escape($code)."'")
#END
getTotalTransactionsByOrderId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."affiliate_transaction WHERE order_id = '".(int)$order_id."'")
#END
