hasAddress=$this->db->query("SELECT * FROM `".DB_PREFIX."order` WHERE `order_id` = '".(int)$order_id."' AND `payment_firstname` != '' AND `payment_address_1` != '' AND `payment_country` != ''")
#END
getOrderLines=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_transaction` WHERE `order_id` = '".(int)$order_id."'")
#END
delete3=$this->db->query("DELETE FROM `".DB_PREFIX."order_history` WHERE `order_id` = '".(int)$order_id."'")
#END
delete4=$this->db->query("DELETE FROM `".DB_PREFIX."order_total` WHERE `order_id` = '".(int)$order_id."'")
#END
update=$this->db->query("UPDATE `".DB_PREFIX."order` SET order_status_id = '".(int)$order_status_id."', date_modified = NOW() WHERE order_id = '".(int)$order_id."'")
#END
delete1=$this->db->query("DELETE FROM `".DB_PREFIX."order_product` WHERE `order_id` = '".(int)$order_id."'")
#END
delete=$this->db->query("DELETE FROM `".DB_PREFIX."order` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
delete2=$this->db->query("DELETE FROM `".DB_PREFIX."order_option` WHERE `order_id` = '".(int)$order_id."'")
#END
updatePaymentDetails=$this->db->query("UPDATE `".DB_PREFIX."order` SET `payment_method` = '".$this->db->escape($order->payment->method)."', `total` = '".(double)$order->order->total."', `date_modified` = NOW() WHERE `order_id` = '".(int)$order_id."'")
#END
update1=$this->db->query("INSERT INTO ".DB_PREFIX."order_history SET order_id = '".(int)$order_id."', order_status_id = '".(int)$order_status_id."', notify = '".(int)$notify."', comment = '".$this->db->escape($comment)."', date_added = NOW()")
#END
update2=$this->db->query("SELECT * FROM ".DB_PREFIX."order_status WHERE order_status_id = '".(int)$order_status_id."' AND language_id = '".(int)$order_info['language_id']."'")
#END
getCountryAddressFormat=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE `iso_code_2` = '".$this->db->escape($iso2)."' LIMIT 1")
#END
getHistory=$this->db->query("SELECT `order_status_id` FROM `".DB_PREFIX."order_history` WHERE `order_id` = '".(int)$order_id."'")
#END
confirm3=$this->db->query("SELECT * FROM `".DB_PREFIX."order_total` WHERE `order_id` = '".(int)$order_id."' ORDER BY `sort_order` ASC")
#END
confirm2=$this->db->query("SELECT * FROM `".DB_PREFIX."order_product` WHERE `order_id` = '".(int)$order_id."'")
#END
lockAdd=$this->db->query("INSERT INTO`".DB_PREFIX."ebay_order_lock` SET `smp_id` = '".(int)$smp_id."'")
#END
confirm1=$this->db->query("INSERT INTO ".DB_PREFIX."order_history SET order_id = '".(int)$order_id."', order_status_id = '".(int)$order_status_id."', notify = '".(int)$notify."', comment = '".$this->db->escape($comment)."', date_added = NOW()")
#END
confirm6=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$product['order_product_id']."'")
#END
confirm5=$this->db->query("SELECT * FROM ".DB_PREFIX."order_option WHERE order_id = '".(int)$order_id."' AND order_product_id = '".(int)$product['order_product_id']."'")
#END
confirm4=$this->db->query("SELECT * FROM `".DB_PREFIX."order_status` WHERE `order_status_id` = '".(int)$order_status_id."' AND `language_id` = '".(int)$order_info['language_id']."'")
#END
addOrderLine3=$this->db->query("UPDATE `".DB_PREFIX."ebay_transaction` SET `containing_order_id` = '".$this->db->escape($data['containing_order_id'])."', `modified` = now() WHERE `txn_id` = '".$this->db->escape((string)$data['txn_id'])."' AND `item_id` = '".$this->db->escape((string)$data['item_id'])."' LIMIT 1")
#END
modifyStock1=$this->db->query("UPDATE `".DB_PREFIX."product` SET `quantity` = (`quantity` ".$this->db->escape((string)$symbol)." ".(int)$qty.") WHERE `product_id` = '".(int)$product_id."' AND `subtract` = '1'")
#END
addOrderLine1=$this->db->query("UPDATE `".DB_PREFIX."ebay_transaction` SET `order_id` = '".(int)$order_id."', `modified` = now() WHERE `txn_id` = '".$this->db->escape((string)$data['txn_id'])."' AND `item_id` = '".$this->db->escape((string)$data['item_id'])."' LIMIT 1")
#END
lockExists=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_order_lock` WHERE `smp_id` = '".(int)$smp_id."' LIMIT 1")
#END
addOrderLine2=$this->db->query("UPDATE `".DB_PREFIX."ebay_transaction` SET `smp_id` = '".$data['smp_id']."', `modified` = now() WHERE `txn_id` = '".$this->db->escape((string)$data['txn_id'])."' AND `item_id` = '".$this->db->escape((string)$data['item_id'])."' LIMIT 1")
#END
addOrderHistory=$this->db->query("SELECT * FROM `".DB_PREFIX."product` WHERE `product_id` = '".(int)$order_product['product_id']."' LIMIT 1")->row
#END
addOrderLine=$this->db->query("
					INSERT INTO `".DB_PREFIX."ebay_transaction`
					SET
					`order_id`                  = '".(int)$order_id."',
					`txn_id`                    = '".$this->db->escape($data['txn_id'])."',
					`item_id`                   = '".$this->db->escape($data['item_id'])."',
					`product_id`                = '".(int)$product_id."',
					`containing_order_id`       = '".$data['containing_order_id']."',
					`order_line_id`             = '".$this->db->escape($data['order_line_id'])."',
					`qty`                       = '".(int)$data['qty']."',
					`smp_id`                    = '".(int)$data['smp_id']."',
					`sku`                       = '".$this->db->escape($data['sku'])."',
					`created`                   = now(),
					`modified`                  = now()
				")
#END
orderLinkCreate=$this->db->query("INSERT INTO `".DB_PREFIX."ebay_order` SET `order_id` = '".(int)$order_id."', `smp_id` = '".(int)$smp_id."', `parent_ebay_order_id` = 0")
#END
confirm=$this->db->query("UPDATE `".DB_PREFIX."order` SET order_status_id = '".(int)$order_status_id."', date_modified = NOW() WHERE order_id = '".(int)$order_id."'")
#END
modifyStock=$this->db->query("UPDATE `".DB_PREFIX."product_option_variant` SET `stock` = (`stock` ".$this->db->escape((string)$symbol)." ".(int)$qty.") WHERE `sku` = '".(string)$sku."' AND `product_id` = '".(int)$product_id."' AND `subtract` = '1'")
#END
lockDelete=$this->db->query("DELETE FROM `".DB_PREFIX."ebay_order_lock` WHERE `smp_id` = '".(int)$smp_id."'")
#END
getOrderLine=$this->db->query("SELECT * FROM `".DB_PREFIX."ebay_transaction` WHERE `txn_id` = '".$this->db->escape($txn_id)."' AND `item_id` = '".$this->db->escape($item_id)."' LIMIT 1")
#END
removeOrderLine=$this->db->query("DELETE FROM `".DB_PREFIX."ebay_transaction` WHERE `txn_id` = '".$this->db->escape($txn_id)."' AND `item_id` = '".$this->db->escape($item_id)."' LIMIT 1")
#END
