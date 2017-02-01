getTotalStoresByLanguage=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_language' AND `value` = '".$this->db->escape($language)."' AND store_id != '0'")
#END
getTotalStoresByCountryId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_country_id' AND `value` = '".(int)$country_id."' AND store_id != '0'")
#END
getStore=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."store WHERE store_id = '".(int)$store_id."'")
#END
getStores=$this->db->query("SELECT * FROM ".DB_PREFIX."store ORDER BY url")
#END
getTotalStoresByCustomerGroupId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_customer_group_id' AND `value` = '".(int)$customer_group_id."' AND store_id != '0'")
#END
getTotalStoresByInformationId1=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_checkout_id' AND `value` = '".(int)$information_id."' AND store_id != '0'")
#END
editStore=$this->db->query("UPDATE ".DB_PREFIX."store SET name = '".$this->db->escape($data['config_name'])."', `url` = '".$this->db->escape($data['config_url'])."', `ssl` = '".$this->db->escape($data['config_ssl'])."' WHERE store_id = '".(int)$store_id."'")
#END
deleteStore1=$this->db->query("DELETE FROM ".DB_PREFIX."layout_route WHERE store_id = '".(int)$store_id."'")
#END
getTotalStoresByZoneId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_zone_id' AND `value` = '".(int)$zone_id."' AND store_id != '0'")
#END
addStore=$this->db->query("INSERT INTO ".DB_PREFIX."store SET name = '".$this->db->escape($data['config_name'])."', `url` = '".$this->db->escape($data['config_url'])."', `ssl` = '".$this->db->escape($data['config_ssl'])."'")
#END
getTotalStoresByCurrency=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_currency' AND `value` = '".$this->db->escape($currency)."' AND store_id != '0'")
#END
deleteStore=$this->db->query("DELETE FROM ".DB_PREFIX."store WHERE store_id = '".(int)$store_id."'")
#END
getTotalStoresByInformationId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_account_id' AND `value` = '".(int)$information_id."' AND store_id != '0'")
#END
addStore2=$this->db->query("INSERT INTO ".DB_PREFIX."layout_route SET layout_id = '".(int)$layout_route['layout_id']."', route = '".$this->db->escape($layout_route['route'])."', store_id = '".(int)$store_id."'")
#END
addStore1=$this->db->query("SELECT * FROM ".DB_PREFIX."layout_route WHERE store_id = '0'")
#END
getTotalStoresByOrderStatusId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_order_status_id' AND `value` = '".(int)$order_status_id."' AND store_id != '0'")
#END
getTotalStores=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."store")
#END
getTotalStoresByLayoutId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."setting WHERE `key` = 'config_layout_id' AND `value` = '".(int)$layout_id."' AND store_id != '0'")
#END
