confirm=$this->db->query("INSERT INTO `".DB_PREFIX."voucher_history` SET voucher_id = '".(int)$voucher_info['voucher_id']."', order_id = '".(int)$order_info['order_id']."', amount = '".(float)$order_total['value']."', date_added = NOW()")
#END
addVoucher=$this->db->query("INSERT INTO ".DB_PREFIX."voucher SET order_id = '".(int)$order_id."', code = '".$this->db->escape($data['code'])."', from_name = '".$this->db->escape($data['from_name'])."', from_email = '".$this->db->escape($data['from_email'])."', to_name = '".$this->db->escape($data['to_name'])."', to_email = '".$this->db->escape($data['to_email'])."', voucher_theme_id = '".(int)$data['voucher_theme_id']."', message = '".$this->db->escape($data['message'])."', amount = '".(float)$data['amount']."', status = '1', date_added = NOW()")
#END
getVoucher3=$this->db->query("SELECT SUM(amount) AS total FROM `".DB_PREFIX."voucher_history` vh WHERE vh.voucher_id = '".(int)$voucher_query->row['voucher_id']."' GROUP BY vh.voucher_id")
#END
getVoucher2=$this->db->query("SELECT order_voucher_id FROM `".DB_PREFIX."order_voucher` WHERE order_id = '".(int)$voucher_query->row['order_id']."' AND voucher_id = '".(int)$voucher_query->row['voucher_id']."'")
#END
getVoucher1=$this->db->query("SELECT order_id FROM `".DB_PREFIX."order` WHERE order_id = '".(int)$voucher_query->row['order_id']."' AND order_status_id IN(".implode(",",$implode).")")
#END
getVoucher=$this->db->query("SELECT *, vtd.name AS theme FROM ".DB_PREFIX."voucher v LEFT JOIN ".DB_PREFIX."voucher_theme vt ON (v.voucher_theme_id = vt.voucher_theme_id) LEFT JOIN ".DB_PREFIX."voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE v.code = '".$this->db->escape($code)."' AND vtd.language_id = '".(int)$this->config->get('config_language_id')."' AND v.status = '1'")
#END
disableVoucher=$this->db->query("UPDATE ".DB_PREFIX."voucher SET status = '0' WHERE order_id = '".(int)$order_id."'")
#END
unconfirm=$this->db->query("DELETE FROM `".DB_PREFIX."voucher_history` WHERE order_id = '".(int)$order_id."'")
#END
