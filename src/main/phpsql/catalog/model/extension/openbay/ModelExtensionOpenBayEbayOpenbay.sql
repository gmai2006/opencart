updateOrderWithConfirmedData=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE `iso_code_2` = '".$this->db->escape($order->address->iso2)."'")
#END
create2=$this->db->query("
								INSERT INTO `".DB_PREFIX."order_option`
								SET
								`order_id`                  = '".(int)$order_id."',
								`order_product_id`          = '".(int)$order_product_id."',
								`product_option_id`         = '".(int)$option['product_option_id']."',
								`product_option_value_id`   = '".(int)$option['product_option_value_id']."',
								`name`                      = '".$this->db->escape($option['name'])."',
								`value`                     = '".$this->db->escape($option['value'])."',
								`type`                      = '".$this->db->escape($option['type'])."'
							")
#END
create=$this->db->query("INSERT INTO `".DB_PREFIX."order` SET
		   `store_id`                 = '".(int)$this->config->get('config_store_id')."',
		   `store_name`               = '".$this->db->escape($this->config->get('config_name').' / eBay')."',
		   `store_url`                = '".$this->db->escape($this->config->get('config_url'))."',
		   `invoice_prefix`           = '".$this->db->escape($this->config->get('config_invoice_prefix'))."',
		   `comment`                  = '".$this->db->escape((string)$order->order->message)."',
		   `total`                    = '".(double)$order->order->total."',
		   `affiliate_id`             = '0',
		   `commission`               = '0',
		   `language_id`              = '".(int)$this->config->get('config_language_id')."',
		   `currency_id`              = '".(int)$currency['currency_id']."',
		   `currency_code`            = '".$this->db->escape($currency['code'])."',
		   `currency_value`           = '".(double)$currency['value']."',
		   `ip`                       = '',
		   `date_added`               = '".$this->db->escape($created_date)."',
		   `date_modified`            = NOW(),
		   `customer_id`              = 0
		")
#END
create1=$this->db->query("INSERT INTO `".DB_PREFIX."order_product` SET
					`order_id`            = '".(int)$order_id."',
					`product_id`          = '".(int)$product_id."',
					`name`                = '".$this->db->escape((isset($txn->item->varianttitle)&&!empty($txn->item->varianttitle))?$txn->item->varianttitle:$txn->item->name)."',
					`model`               = '".$this->db->escape($model_number)."',
					`quantity`            = '".(int)$qty."',
					`price`               = '".(double)$price_net."',
					`total`               = '".(double)$total_net."',
					`tax`                 = '".(double)$tax."'
				")
#END
updateOrderWithConfirmedData1=$this->db->query("
			UPDATE `".DB_PREFIX."order`
			SET
			   `customer_id`              = '".(int)$user['id']."',
			   `firstname`                = '".$this->db->escape($user['fname'])."',
			   `lastname`                 = '".$this->db->escape($user['lname'])."',
			   `email`                    = '".$this->db->escape($order->user->email)."',
			   `telephone`                = '".$this->db->escape($order->address->phone)."',
			   `shipping_firstname`       = '".$this->db->escape($user['fname'])."',
			   `shipping_lastname`        = '".$this->db->escape($user['lname'])."',
			   `shipping_address_1`       = '".$this->db->escape($order->address->street1)."',
			   `shipping_address_2`       = '".$this->db->escape($order->address->street2)."',
			   `shipping_city`            = '".$this->db->escape($order->address->city)."',
			   `shipping_postcode`        = '".$this->db->escape($order->address->postcode)."',
			   `shipping_country`         = '".$this->db->escape($user['country'])."',
			   `shipping_country_id`      = '".(int)$user['country_id']."',
			   `shipping_zone`            = '".$this->db->escape($order->address->state)."',
			   `shipping_zone_id`         = '".(int)$zone_id."',
			   `shipping_method`          = '".$this->db->escape($shipping_service_name)."',
			   `shipping_address_format`  = '".$this->db->escape($address_format)."',
			   `payment_firstname`        = '".$this->db->escape($user['fname'])."',
			   `payment_lastname`         = '".$this->db->escape($user['lname'])."',
			   `payment_address_1`        = '".$this->db->escape($order->address->street1)."',
			   `payment_address_2`        = '".$this->db->escape($order->address->street2)."',
			   `payment_city`             = '".$this->db->escape($order->address->city)."',
			   `payment_postcode`         = '".$this->db->escape($order->address->postcode)."',
			   `payment_country`          = '".$this->db->escape($user['country'])."',
			   `payment_country_id`       = '".(int)$user['country_id']."',
			   `payment_zone`             = '".$this->db->escape($order->address->state)."',
			   `payment_zone_id`          = '".(int)$zone_id."',
			   `comment`                  = '".$this->db->escape($order->order->message)."',
			   `payment_method`           = '".$this->db->escape($order->payment->method)."',
			   `payment_address_format`   = '".$address_format."',
			   `total`                    = '".(double)$order->order->total."',
			   `date_modified`            = NOW()
		   WHERE `order_id` = '".$order_id."'
		   ")
#END
updateOrderWithConfirmedData2=$this->db->query("INSERT INTO `".DB_PREFIX."order_total` SET `order_id` = '".(int)$order_id."', `code` = '".$this->db->escape($total['code'])."', `title` = '".$this->db->escape($total['title'])."', `value` = '".(double)$total['value']."', `sort_order` = '".(int)$total['sort_order']."'")
#END
