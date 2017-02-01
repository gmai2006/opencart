lockExists=$this->db->query("SELECT * FROM `".DB_PREFIX."etsy_order_lock` WHERE `order_id` = '".(int)$order_id."' LIMIT 1")
#END
updateOrderStatus1=$this->db->query("UPDATE `".DB_PREFIX."order` SET `order_status_id` = ".(int)$status_id." WHERE `order_id` = ".(int)$order_id)
#END
updateOrderStatus=$this->db->query("INSERT INTO `".DB_PREFIX."order_history` (`order_id`, `order_status_id`, `notify`, `comment`, `date_added`) VALUES (".(int)$order_id.", ".(int)$status_id.", 0, '', NOW())")
#END
updatePaid=$this->db->query("UPDATE `".DB_PREFIX."etsy_order` SET `paid` = ".(int)$status." WHERE `order_id` = ".(int)$order_id)
#END
modifyStock=$this->db->query("UPDATE `".DB_PREFIX."product` SET `quantity` = (`quantity` ".$this->db->escape((string)$symbol)." ".(int)$qty.") WHERE `product_id` = '".(int)$product_id."' AND `subtract` = '1'")
#END
lockDelete=$this->db->query("DELETE FROM `".DB_PREFIX."etsy_order_lock` WHERE `order_id` = '".(int)$order_id."'")
#END
create4=$this->db->query("INSERT INTO `".DB_PREFIX."order_total` SET `order_id` = '".(int)$order_id."', `code` = '".$this->db->escape($total['code'])."', `title` = '".$this->db->escape($total['title'])."', `value` = '".(double)$total['value']."', `sort_order` = '".(int)$total['sort_order']."'")
#END
create2=$this->db->query("INSERT INTO `".DB_PREFIX."order_product` SET
			   `order_id`		= '".(int)$order_id."',
			   `product_id`		= '".(int)$product_id."',
			   `name`			= '".$this->db->escape((string)$transaction->title)."',
			   `model`			= '".$this->db->escape($product_model)."',
			   `quantity`		= '".(int)$transaction->quantity."',
			   `price`			= '".(int)$transaction->price."',
			   `total`			= '".(int)$transaction->price*(int)$transaction->quantity."',
			   `tax`			= '',
			   `reward`			= ''
		   ")
#END
lockAdd=$this->db->query("INSERT INTO`".DB_PREFIX."etsy_order_lock` SET `order_id` = '".(int)$order_id."'")
#END
create=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE `iso_code_2` = '".$this->db->escape($order->country->iso)."'")
#END
create3=$this->db->query("INSERT INTO `".DB_PREFIX."etsy_order` SET `order_id` = '".(int)$order_id."', `receipt_id` = '".(int)$order->receipt_id."'")
#END
create1=$this->db->query("INSERT INTO `".DB_PREFIX."order` SET
		   `invoice_prefix`           = '".$this->db->escape($this->config->get('config_invoice_prefix'))."',
		   `store_id`                 = '".(int)$this->config->get('config_store_id')."',
		   `store_name`               = '".$this->db->escape($this->config->get('config_name').' / Etsy')."',
		   `store_url`                = '".$this->db->escape($this->config->get('config_url'))."',
		   `customer_id`              = 0,
		   `customer_group_id`        = '".(int)$this->config->get('config_customer_group_id')."',
		   `firstname`				  = '".$this->db->escape((string)$customer_name['firstname'])."',
		   `lastname`				  = '".$this->db->escape((string)$customer_name['surname'])."',
		   `email`				  	  = '".$this->db->escape((string)$order->buyer_email)."',
		   `telephone`				  = '',
		   `fax`				  	  = '',
		   `payment_firstname`		  = '".$this->db->escape((string)$customer_name['firstname'])."',
		   `payment_lastname`		  = '".$this->db->escape((string)$customer_name['surname'])."',
		   `payment_company`		  = '',
		   `payment_address_1`		  = '".$this->db->escape((string)$order->address_1)."',
		   `payment_address_2`		  = '".$this->db->escape((string)$order->address_2)."',
		   `payment_city`			  = '".$this->db->escape((string)$order->address_city)."',
		   `payment_postcode`		  = '".$this->db->escape((string)$order->address_zip)."',
		   `payment_country`		  = '".$this->db->escape((string)$country_name)."',
		   `payment_country_id`		  = '".$this->db->escape((string)$country_id)."',
		   `payment_zone`			  = '".$this->db->escape((string)$order->address_state)."',
		   `payment_zone_id`		  = '".(int)$zone_id."',
		   `payment_address_format`	  = '".$this->db->escape((string)$country_address_format)."',
		   `payment_method`	  		  = '".$this->db->escape((string)$order->payment_method_name)."',
		   `payment_code`	  		  = '',
		   `shipping_firstname`		  = '".$this->db->escape((string)$customer_name['firstname'])."',
		   `shipping_lastname`		  = '".$this->db->escape((string)$customer_name['surname'])."',
		   `shipping_address_1`		  = '".$this->db->escape((string)$order->address_1)."',
		   `shipping_address_2`		  = '".$this->db->escape((string)$order->address_2)."',
		   `shipping_city`			  = '".$this->db->escape((string)$order->address_city)."',
		   `shipping_postcode`		  = '".$this->db->escape((string)$order->address_zip)."',
		   `shipping_country`		  = '".$this->db->escape((string)$country_name)."',
		   `shipping_country_id`	  = '".$this->db->escape((string)$country_id)."',
		   `shipping_zone`			  = '".$this->db->escape((string)$order->address_state)."',
		   `shipping_zone_id`		  = '".(int)$zone_id."',
		   `shipping_address_format`  = '".$this->db->escape((string)$country_address_format)."',
		   `shipping_method`  		  = '',
		   `shipping_code`  		  = '',
		   `comment`                  = '".$this->db->escape((string)$order->buyer_note)."',
		   `total`                    = '".(double)$order->amount_total."',
		   `order_status_id`          = '',
		   `affiliate_id`          	  = '',
		   `commission`          	  = '',
		   `marketing_id`          	  = '',
		   `tracking`          	  	  = '',
		   `language_id`              = '".(int)$this->config->get('config_language_id')."',
		   `currency_id`              = '".(int)$currency['currency_id']."',
		   `currency_code`            = '".$this->db->escape($currency_code)."',
		   `currency_value`           = 1,
		   `ip`           			  = '',
		   `forwarded_ip`             = '',
		   `user_agent`               = '',
		   `accept_language`          = '',
		   `date_added`               = NOW(),
		   `date_modified`            = NOW()
		")
#END
updateShipped=$this->db->query("UPDATE `".DB_PREFIX."etsy_order` SET `shipped` = ".(int)$status." WHERE `order_id` = ".(int)$order_id)
#END
