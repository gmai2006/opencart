check1=$this->db->query("REPLACE INTO `".DB_PREFIX."fraudlabspro` SET order_id = '".(int)$data['order_id']."',
				is_country_match = '".$this->db->escape($json->is_country_match)."',
				is_high_risk_country = '".$this->db->escape($json->is_high_risk_country)."',
				distance_in_km = '".$this->db->escape($json->distance_in_km)."',
				distance_in_mile = '".$this->db->escape($json->distance_in_mile)."',
				ip_country = '".$this->db->escape($json->ip_country)."',
				ip_region = '".$this->db->escape($json->ip_region)."',
				ip_city = '".$this->db->escape($json->ip_city)."',
				ip_continent = '".$this->db->escape($json->ip_continent)."',
				ip_latitude = '".$this->db->escape($json->ip_latitude)."',
				ip_longitude = '".$this->db->escape($json->ip_longitude)."',
				ip_timezone = '".$this->db->escape($json->ip_timezone)."',
				ip_elevation = '".$this->db->escape($json->ip_elevation)."',
				ip_domain = '".$this->db->escape($json->ip_domain)."',
				ip_mobile_mnc = '".$this->db->escape($json->ip_mobile_mnc)."',
				ip_mobile_mcc = '".$this->db->escape($json->ip_mobile_mcc)."',
				ip_mobile_brand = '".$this->db->escape($json->ip_mobile_brand)."',
				ip_netspeed = '".$this->db->escape($json->ip_netspeed)."',
				ip_isp_name = '".$this->db->escape($json->ip_isp_name)."',
				ip_usage_type = '".$this->db->escape($json->ip_usage_type)."',
				is_free_email = '".$this->db->escape($json->is_free_email)."',
				is_new_domain_name = '".$this->db->escape($json->is_new_domain_name)."',
				is_proxy_ip_address = '".$this->db->escape($json->is_proxy_ip_address)."',
				is_bin_found = '".$this->db->escape($json->is_bin_found)."',
				is_bin_country_match = '".$this->db->escape($json->is_bin_country_match)."',
				is_bin_name_match = '".$this->db->escape($json->is_bin_name_match)."',
				is_bin_phone_match = '".$this->db->escape($json->is_bin_phone_match)."',
				is_bin_prepaid = '".$this->db->escape($json->is_bin_prepaid)."',
				is_address_ship_forward = '".$this->db->escape($json->is_address_ship_forward)."',
				is_bill_ship_city_match = '".$this->db->escape($json->is_bill_ship_city_match)."',
				is_bill_ship_state_match = '".$this->db->escape($json->is_bill_ship_state_match)."',
				is_bill_ship_country_match = '".$this->db->escape($json->is_bill_ship_country_match)."',
				is_bill_ship_postal_match = '".$this->db->escape($json->is_bill_ship_postal_match)."',
				is_ip_blacklist = '".$this->db->escape($json->is_ip_blacklist)."',
				is_email_blacklist = '".$this->db->escape($json->is_email_blacklist)."',
				is_credit_card_blacklist = '".$this->db->escape($json->is_credit_card_blacklist)."',
				is_device_blacklist = '".$this->db->escape($json->is_device_blacklist)."',
				is_user_blacklist = '".$this->db->escape($json->is_user_blacklist)."',
				fraudlabspro_score = '".$this->db->escape($json->fraudlabspro_score)."',
				fraudlabspro_distribution = '".$this->db->escape($json->fraudlabspro_distribution)."',
				fraudlabspro_status = '".$this->db->escape($json->fraudlabspro_status)."',
				fraudlabspro_id = '".$this->db->escape($json->fraudlabspro_id)."',
				fraudlabspro_error = '".$this->db->escape($json->fraudlabspro_error_code)."',
				fraudlabspro_message = '".$this->db->escape($json->fraudlabspro_message)."',
				fraudlabspro_credits = '".$this->db->escape($json->fraudlabspro_credits)."',
				api_key = '".$this->config->get('fraudlabspro_key')."',
				ip_address = '".$ip."'")
#END
check=$this->db->query("SELECT * FROM `".DB_PREFIX."fraudlabspro` WHERE order_id = '".(int)$data['order_id']."'")
#END
