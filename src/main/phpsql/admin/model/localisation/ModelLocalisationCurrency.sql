deleteCurrency=$this->db->query("DELETE FROM ".DB_PREFIX."currency WHERE currency_id = '".(int)$currency_id."'")
#END
getCurrency=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."currency WHERE currency_id = '".(int)$currency_id."'")
#END
getCurrencies=$this->db->query("SELECT * FROM ".DB_PREFIX."currency ORDER BY title ASC")
#END
refresh3=$this->db->query("UPDATE ".DB_PREFIX."currency SET value = '1.00000', date_modified = '".$this->db->escape(date('Y-m-d H:i:s'))."' WHERE code = '".$this->db->escape($this->config->get('config_currency'))."'")
#END
refresh2=$this->db->query("UPDATE ".DB_PREFIX."currency SET value = '".(float)$value."', date_modified = '".$this->db->escape(date('Y-m-d H:i:s'))."' WHERE code = '".$this->db->escape($currency)."'")
#END
getCurrencyByCode=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."currency WHERE code = '".$this->db->escape($currency)."'")
#END
refresh=$this->db->query("SELECT * FROM ".DB_PREFIX."currency WHERE code != '".$this->db->escape($this->config->get('config_currency'))."'")
#END
refresh1=$this->db->query("SELECT * FROM ".DB_PREFIX."currency WHERE code != '".$this->db->escape($this->config->get('config_currency'))."' AND date_modified < '".$this->db->escape(date('Y-m-d H:i:s',strtotime('-1 day')))."'")
#END
getTotalCurrencies=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."currency")
#END
addCurrency=$this->db->query("INSERT INTO ".DB_PREFIX."currency SET title = '".$this->db->escape($data['title'])."', code = '".$this->db->escape($data['code'])."', symbol_left = '".$this->db->escape($data['symbol_left'])."', symbol_right = '".$this->db->escape($data['symbol_right'])."', decimal_place = '".$this->db->escape($data['decimal_place'])."', value = '".$this->db->escape($data['value'])."', status = '".(int)$data['status']."', date_modified = NOW()")
#END
editCurrency=$this->db->query("UPDATE ".DB_PREFIX."currency SET title = '".$this->db->escape($data['title'])."', code = '".$this->db->escape($data['code'])."', symbol_left = '".$this->db->escape($data['symbol_left'])."', symbol_right = '".$this->db->escape($data['symbol_right'])."', decimal_place = '".$this->db->escape($data['decimal_place'])."', value = '".$this->db->escape($data['value'])."', status = '".(int)$data['status']."', date_modified = NOW() WHERE currency_id = '".(int)$currency_id."'")
#END
