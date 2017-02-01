addLoginAttempt1=$this->db->query("INSERT INTO ".DB_PREFIX."affiliate_login SET email = '".$this->db->escape(utf8_strtolower((string)$email))."', ip = '".$this->db->escape($this->request->server['REMOTE_ADDR'])."', total = 1, date_added = '".$this->db->escape(date('Y-m-d H:i:s'))."', date_modified = '".$this->db->escape(date('Y-m-d H:i:s'))."'")
#END
editPayment=$this->db->query("UPDATE ".DB_PREFIX."affiliate SET tax = '".$this->db->escape($data['tax'])."', payment = '".$this->db->escape($data['payment'])."', cheque = '".$this->db->escape($data['cheque'])."', paypal = '".$this->db->escape($data['paypal'])."', bank_name = '".$this->db->escape($data['bank_name'])."', bank_branch_number = '".$this->db->escape($data['bank_branch_number'])."', bank_swift_code = '".$this->db->escape($data['bank_swift_code'])."', bank_account_name = '".$this->db->escape($data['bank_account_name'])."', bank_account_number = '".$this->db->escape($data['bank_account_number'])."' WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
addLoginAttempt2=$this->db->query("UPDATE ".DB_PREFIX."affiliate_login SET total = (total + 1), date_modified = '".$this->db->escape(date('Y-m-d H:i:s'))."' WHERE affiliate_login_id = '".(int)$query->row['affiliate_login_id']."'")
#END
getAffiliateByEmail=$this->db->query("SELECT * FROM ".DB_PREFIX."affiliate WHERE LOWER(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getAffiliate=$this->db->query("SELECT * FROM ".DB_PREFIX."affiliate WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
getTotalAffiliatesByEmail=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."affiliate WHERE LOWER(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
deleteTransaction=$this->db->query("DELETE FROM ".DB_PREFIX."affiliate_transaction WHERE order_id = '".(int)$order_id."'")
#END
editAffiliate=$this->db->query("UPDATE ".DB_PREFIX."affiliate SET firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', company = '".$this->db->escape($data['company'])."', website = '".$this->db->escape($data['website'])."', address_1 = '".$this->db->escape($data['address_1'])."', address_2 = '".$this->db->escape($data['address_2'])."', city = '".$this->db->escape($data['city'])."', postcode = '".$this->db->escape($data['postcode'])."', country_id = '".(int)$data['country_id']."', zone_id = '".(int)$data['zone_id']."' WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
getTransactionTotal=$this->db->query("SELECT SUM(amount) AS total FROM ".DB_PREFIX."affiliate_transaction WHERE affiliate_id = '".(int)$affiliate_id."'")
#END
deleteLoginAttempts=$this->db->query("DELETE FROM `".DB_PREFIX."affiliate_login` WHERE email = '".$this->db->escape(utf8_strtolower($email))."'")
#END
editPassword=$this->db->query("UPDATE ".DB_PREFIX."affiliate SET salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($password))))."' WHERE LOWER(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
addAffiliate=$this->db->query("INSERT INTO ".DB_PREFIX."affiliate SET firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."', company = '".$this->db->escape($data['company'])."', website = '".$this->db->escape($data['website'])."', address_1 = '".$this->db->escape($data['address_1'])."', address_2 = '".$this->db->escape($data['address_2'])."', city = '".$this->db->escape($data['city'])."', postcode = '".$this->db->escape($data['postcode'])."', country_id = '".(int)$data['country_id']."', zone_id = '".(int)$data['zone_id']."', code = '".$this->db->escape(uniqid())."', commission = '".(float)$this->config->get('config_affiliate_commission')."', tax = '".$this->db->escape($data['tax'])."', payment = '".$this->db->escape($data['payment'])."', cheque = '".$this->db->escape($data['cheque'])."', paypal = '".$this->db->escape($data['paypal'])."', bank_name = '".$this->db->escape($data['bank_name'])."', bank_branch_number = '".$this->db->escape($data['bank_branch_number'])."', bank_swift_code = '".$this->db->escape($data['bank_swift_code'])."', bank_account_name = '".$this->db->escape($data['bank_account_name'])."', bank_account_number = '".$this->db->escape($data['bank_account_number'])."', status = '1', approved = '".(int)!$this->config->get('config_affiliate_approval')."', date_added = NOW()")
#END
getLoginAttempts=$this->db->query("SELECT * FROM `".DB_PREFIX."affiliate_login` WHERE email = '".$this->db->escape(utf8_strtolower($email))."'")
#END
addLoginAttempt=$this->db->query("SELECT * FROM ".DB_PREFIX."affiliate_login WHERE email = '".$this->db->escape(utf8_strtolower((string)$email))."' AND ip = '".$this->db->escape($this->request->server['REMOTE_ADDR'])."'")
#END
addTransaction=$this->db->query("INSERT INTO ".DB_PREFIX."affiliate_transaction SET affiliate_id = '".(int)$affiliate_id."', order_id = '".(float)$order_id."', description = '".$this->db->escape($this->language->get('text_order_id').' #'.$order_id)."', amount = '".(float)$amount."', date_added = NOW()")
#END
getAffiliateByCode=$this->db->query("SELECT * FROM ".DB_PREFIX."affiliate WHERE code = '".$this->db->escape($code)."'")
#END
