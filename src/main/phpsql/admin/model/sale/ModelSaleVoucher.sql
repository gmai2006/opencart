deleteVoucher=$this->db->query("DELETE FROM ".DB_PREFIX."voucher WHERE voucher_id = '".(int)$voucher_id."'")
#END
editVoucher=$this->db->query("UPDATE ".DB_PREFIX."voucher SET code = '".$this->db->escape($data['code'])."', from_name = '".$this->db->escape($data['from_name'])."', from_email = '".$this->db->escape($data['from_email'])."', to_name = '".$this->db->escape($data['to_name'])."', to_email = '".$this->db->escape($data['to_email'])."', voucher_theme_id = '".(int)$data['voucher_theme_id']."', message = '".$this->db->escape($data['message'])."', amount = '".(float)$data['amount']."', status = '".(int)$data['status']."' WHERE voucher_id = '".(int)$voucher_id."'")
#END
deleteVoucher1=$this->db->query("DELETE FROM ".DB_PREFIX."voucher_history WHERE voucher_id = '".(int)$voucher_id."'")
#END
getVoucherByCode=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."voucher WHERE code = '".$this->db->escape($code)."'")
#END
addVoucher=$this->db->query("INSERT INTO ".DB_PREFIX."voucher SET code = '".$this->db->escape($data['code'])."', from_name = '".$this->db->escape($data['from_name'])."', from_email = '".$this->db->escape($data['from_email'])."', to_name = '".$this->db->escape($data['to_name'])."', to_email = '".$this->db->escape($data['to_email'])."', voucher_theme_id = '".(int)$data['voucher_theme_id']."', message = '".$this->db->escape($data['message'])."', amount = '".(float)$data['amount']."', status = '".(int)$data['status']."', date_added = NOW()")
#END
getTotalVouchersByVoucherThemeId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."voucher WHERE voucher_theme_id = '".(int)$voucher_theme_id."'")
#END
getVoucher=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."voucher WHERE voucher_id = '".(int)$voucher_id."'")
#END
getTotalVoucherHistories=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."voucher_history WHERE voucher_id = '".(int)$voucher_id."'")
#END
getTotalVouchers=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."voucher")
#END
getVoucherHistories=$this->db->query("SELECT vh.order_id, CONCAT(o.firstname, ' ', o.lastname) AS customer, vh.amount, vh.date_added FROM ".DB_PREFIX."voucher_history vh LEFT JOIN `".DB_PREFIX."order` o ON (vh.order_id = o.order_id) WHERE vh.voucher_id = '".(int)$voucher_id."' ORDER BY vh.date_added ASC LIMIT ".(int)$start.",".(int)$limit)
#END
