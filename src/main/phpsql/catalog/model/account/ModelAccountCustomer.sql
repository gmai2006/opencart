editCustomer=$this->db->query("UPDATE ".DB_PREFIX."customer SET firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', custom_field = '".$this->db->escape(isset($data['custom_field'])?json_encode($data['custom_field']):'')."' WHERE customer_id = '".(int)$customer_id."'")
#END
editCode=$this->db->query("UPDATE `".DB_PREFIX."customer` SET code = '".$this->db->escape($code)."' WHERE LCASE(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
addCustomer1=$this->db->query("INSERT INTO ".DB_PREFIX."address SET customer_id = '".(int)$customer_id."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', company = '".$this->db->escape($data['company'])."', address_1 = '".$this->db->escape($data['address_1'])."', address_2 = '".$this->db->escape($data['address_2'])."', city = '".$this->db->escape($data['city'])."', postcode = '".$this->db->escape($data['postcode'])."', country_id = '".(int)$data['country_id']."', zone_id = '".(int)$data['zone_id']."', custom_field = '".$this->db->escape(isset($data['custom_field']['address'])?json_encode($data['custom_field']['address']):'')."'")
#END
addLoginAttempt1=$this->db->query("INSERT INTO ".DB_PREFIX."customer_login SET email = '".$this->db->escape(utf8_strtolower((string)$email))."', ip = '".$this->db->escape($this->request->server['REMOTE_ADDR'])."', total = 1, date_added = '".$this->db->escape(date('Y-m-d H:i:s'))."', date_modified = '".$this->db->escape(date('Y-m-d H:i:s'))."'")
#END
addCustomer2=$this->db->query("UPDATE ".DB_PREFIX."customer SET address_id = '".(int)$address_id."' WHERE customer_id = '".(int)$customer_id."'")
#END
addLoginAttempt2=$this->db->query("UPDATE ".DB_PREFIX."customer_login SET total = (total + 1), date_modified = '".$this->db->escape(date('Y-m-d H:i:s'))."' WHERE customer_login_id = '".(int)$query->row['customer_login_id']."'")
#END
getTotalCustomersByEmail=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer WHERE LOWER(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getCustomerByToken1=$this->db->query("UPDATE ".DB_PREFIX."customer SET token = ''")
#END
getCustomerByEmail=$this->db->query("SELECT * FROM ".DB_PREFIX."customer WHERE LOWER(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
deleteLoginAttempts=$this->db->query("DELETE FROM `".DB_PREFIX."customer_login` WHERE email = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getCustomer=$this->db->query("SELECT * FROM ".DB_PREFIX."customer WHERE customer_id = '".(int)$customer_id."'")
#END
addCustomer=$this->db->query("INSERT INTO ".DB_PREFIX."customer SET customer_group_id = '".(int)$customer_group_id."', store_id = '".(int)$this->config->get('config_store_id')."', language_id = '".(int)$this->config->get('config_language_id')."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', telephone = '".$this->db->escape($data['telephone'])."', fax = '".$this->db->escape($data['fax'])."', custom_field = '".$this->db->escape(isset($data['custom_field']['account'])?json_encode($data['custom_field']['account']):'')."', salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."', newsletter = '".(isset($data['newsletter'])?(int)$data['newsletter']:0)."', ip = '".$this->db->escape($this->request->server['REMOTE_ADDR'])."', status = '1', approved = '".(int)!$customer_group_info['approval']."', date_added = NOW()")
#END
editPassword=$this->db->query("UPDATE ".DB_PREFIX."customer SET salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($password))))."', code = '' WHERE LOWER(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
editNewsletter=$this->db->query("UPDATE ".DB_PREFIX."customer SET newsletter = '".(int)$newsletter."' WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
getLoginAttempts=$this->db->query("SELECT * FROM `".DB_PREFIX."customer_login` WHERE email = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getCustomerByCode=$this->db->query("SELECT customer_id, firstname, lastname, email FROM `".DB_PREFIX."customer` WHERE code = '".$this->db->escape($code)."' AND code != ''")
#END
addLoginAttempt=$this->db->query("SELECT * FROM ".DB_PREFIX."customer_login WHERE email = '".$this->db->escape(utf8_strtolower((string)$email))."' AND ip = '".$this->db->escape($this->request->server['REMOTE_ADDR'])."'")
#END
getRewardTotal=$this->db->query("SELECT SUM(points) AS total FROM ".DB_PREFIX."customer_reward WHERE customer_id = '".(int)$customer_id."'")
#END
getIps=$this->db->query("SELECT * FROM `".DB_PREFIX."customer_ip` WHERE customer_id = '".(int)$customer_id."'")
#END
getCustomerByToken=$this->db->query("SELECT * FROM ".DB_PREFIX."customer WHERE token = '".$this->db->escape($token)."' AND token != ''")
#END
