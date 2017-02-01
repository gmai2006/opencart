getTotalOrdersByProcessingStatus=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` WHERE ".implode(" OR ",$implode))
#END
getTotalOrdersByLanguageId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` WHERE language_id = '".(int)$language_id."' AND order_status_id > '0'")
#END
getOrderHistories=$this->db->query("SELECT oh.date_added, os.name AS status, oh.comment, oh.notify FROM ".DB_PREFIX."order_history oh LEFT JOIN ".DB_PREFIX."order_status os ON oh.order_status_id = os.order_status_id WHERE oh.order_id = '".(int)$order_id."' AND os.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY oh.date_added ASC LIMIT ".(int)$start.",".(int)$limit)
#END
getTotalOrdersByCompleteStatus=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` WHERE ".implode(" OR ",$implode)."")
#END
getOrderProducts=$this->db->query("SELECT * FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
getOrderVoucherByVoucherId=$this->db->query("SELECT * FROM `".DB_PREFIX."order_voucher` WHERE voucher_id = '".(int)$voucher_id."'")
#END
deleteOrder7=$this->db->query("DELETE FROM `".DB_PREFIX."affiliate_transaction` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder8=$this->db->query("DELETE FROM `".DB_PREFIX."voucher` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder9=$this->db->query("DELETE FROM `".DB_PREFIX."voucher_history` WHERE order_id = '".(int)$order_id."'")
#END
getTotalOrderHistoriesByOrderStatusId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."order_history WHERE order_status_id = '".(int)$order_status_id."'")
#END
deleteOrder3=$this->db->query("DELETE FROM `".DB_PREFIX."order_voucher` WHERE order_id = '".(int)$order_id."'")
#END
createInvoiceNo=$this->db->query("SELECT MAX(invoice_no) AS invoice_no FROM `".DB_PREFIX."order` WHERE invoice_prefix = '".$this->db->escape($order_info['invoice_prefix'])."'")
#END
deleteOrder4=$this->db->query("DELETE FROM `".DB_PREFIX."order_total` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder5=$this->db->query("DELETE FROM `".DB_PREFIX."order_history` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder6=$this->db->query("DELETE `or`, ort FROM `".DB_PREFIX."order_recurring` `or`, `".DB_PREFIX."order_recurring_transaction` `ort` WHERE order_id = '".(int)$order_id."' AND ort.order_recurring_id = `or`.order_recurring_id")
#END
getTotalOrdersByOrderStatusId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` WHERE order_status_id = '".(int)$order_status_id."' AND order_status_id > '0'")
#END
getOrderTotals=$this->db->query("SELECT * FROM ".DB_PREFIX."order_total WHERE order_id = '".(int)$order_id."' ORDER BY sort_order")
#END
deleteOrder1=$this->db->query("DELETE FROM `".DB_PREFIX."order_product` WHERE order_id = '".(int)$order_id."'")
#END
deleteOrder2=$this->db->query("DELETE FROM `".DB_PREFIX."order_option` WHERE order_id = '".(int)$order_id."'")
#END
getTotalEmailsByProductsOrdered=$this->db->query("SELECT DISTINCT email FROM `".DB_PREFIX."order` o LEFT JOIN ".DB_PREFIX."order_product op ON (o.order_id = op.order_id) WHERE (".implode(" OR ",$implode).") AND o.order_status_id <> '0'")
#END
deleteOrder=$this->db->query("DELETE FROM `".DB_PREFIX."order` WHERE order_id = '".(int)$order_id."'")
#END
getEmailsByProductsOrdered=$this->db->query("SELECT DISTINCT email FROM `".DB_PREFIX."order` o LEFT JOIN ".DB_PREFIX."order_product op ON (o.order_id = op.order_id) WHERE (".implode(" OR ",$implode).") AND o.order_status_id <> '0' LIMIT ".(int)$start.",".(int)$end)
#END
getTotalOrdersByCurrencyId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` WHERE currency_id = '".(int)$currency_id."' AND order_status_id > '0'")
#END
getOrderOptions=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$order_product_id."'")
#END
getTotalOrdersByStoreId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` WHERE store_id = '".(int)$store_id."'")
#END
getOrder4=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$order_query->row['shipping_zone_id']."'")
#END
getOrderVouchers=$this->db->query("SELECT * FROM ".DB_PREFIX."order_voucher WHERE order_id = '".(int)$order_id."'")
#END
getOrder5=$this->db->query("SELECT * FROM ".DB_PREFIX."order_product WHERE order_id = '".(int)$order_id."'")
#END
getOrder2=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$order_query->row['payment_zone_id']."'")
#END
getOrder3=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$order_query->row['shipping_country_id']."'")
#END
getTotalOrderHistories=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."order_history WHERE order_id = '".(int)$order_id."'")
#END
getOrder1=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$order_query->row['payment_country_id']."'")
#END
getOrder=$this->db->query("SELECT *, (SELECT CONCAT(c.firstname, ' ', c.lastname) FROM ".DB_PREFIX."customer c WHERE c.customer_id = o.customer_id) AS customer, (SELECT os.name FROM ".DB_PREFIX."order_status os WHERE os.order_status_id = o.order_status_id AND os.language_id = '".(int)$this->config->get('config_language_id')."') AS order_status FROM `".DB_PREFIX."order` o WHERE o.order_id = '".(int)$order_id."'")
#END
createInvoiceNo1=$this->db->query("UPDATE `".DB_PREFIX."order` SET invoice_no = '".(int)$invoice_no."', invoice_prefix = '".$this->db->escape($order_info['invoice_prefix'])."' WHERE order_id = '".(int)$order_id."'")
#END
