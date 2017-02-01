addLanguage9=$this->db->query("SELECT * FROM ".DB_PREFIX."customer_group_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getLanguages=$this->db->query("SELECT * FROM ".DB_PREFIX."language ORDER BY sort_order, name")
#END
addLanguage29=$this->db->query("SELECT * FROM ".DB_PREFIX."order_status WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage36=$this->db->query("INSERT INTO ".DB_PREFIX."return_action SET return_action_id = '".(int)$return_action['return_action_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($return_action['name'])."'")
#END
addLanguage37=$this->db->query("SELECT * FROM ".DB_PREFIX."return_reason WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage38=$this->db->query("INSERT INTO ".DB_PREFIX."return_reason SET return_reason_id = '".(int)$return_reason['return_reason_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($return_reason['name'])."'")
#END
addLanguage39=$this->db->query("SELECT * FROM ".DB_PREFIX."return_status WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage32=$this->db->query("INSERT INTO ".DB_PREFIX."product_description SET product_id = '".(int)$product['product_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($product['name'])."', description = '".$this->db->escape($product['description'])."', tag = '".$this->db->escape($product['tag'])."', meta_title = '".$this->db->escape($product['meta_title'])."', meta_description = '".$this->db->escape($product['meta_description'])."', meta_keyword = '".$this->db->escape($product['meta_keyword'])."'")
#END
addLanguage33=$this->db->query("SELECT * FROM ".DB_PREFIX."product_attribute WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage34=$this->db->query("INSERT INTO ".DB_PREFIX."product_attribute SET product_id = '".(int)$product_attribute['product_id']."', attribute_id = '".(int)$product_attribute['attribute_id']."', language_id = '".(int)$language_id."', text = '".$this->db->escape($product_attribute['text'])."'")
#END
addLanguage35=$this->db->query("SELECT * FROM ".DB_PREFIX."return_action WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage30=$this->db->query("INSERT INTO ".DB_PREFIX."order_status SET order_status_id = '".(int)$order_status['order_status_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($order_status['name'])."'")
#END
addLanguage31=$this->db->query("SELECT * FROM ".DB_PREFIX."product_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage18=$this->db->query("INSERT INTO ".DB_PREFIX."filter_description SET filter_id = '".(int)$filter['filter_id']."', language_id = '".(int)$language_id."', filter_group_id = '".(int)$filter['filter_group_id']."', name = '".$this->db->escape($filter['name'])."'")
#END
addLanguage19=$this->db->query("SELECT * FROM ".DB_PREFIX."filter_group_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getLanguageByCode=$this->db->query("SELECT * FROM `".DB_PREFIX."language` WHERE code = '".$this->db->escape($code)."'")
#END
addLanguage25=$this->db->query("SELECT * FROM ".DB_PREFIX."option_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage26=$this->db->query("INSERT INTO ".DB_PREFIX."option_description SET option_id = '".(int)$option['option_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($option['name'])."'")
#END
addLanguage27=$this->db->query("SELECT * FROM ".DB_PREFIX."option_value_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage28=$this->db->query("INSERT INTO ".DB_PREFIX."option_value_description SET option_value_id = '".(int)$option_value['option_value_id']."', language_id = '".(int)$language_id."', option_id = '".(int)$option_value['option_id']."', name = '".$this->db->escape($option_value['name'])."'")
#END
addLanguage21=$this->db->query("SELECT * FROM ".DB_PREFIX."information_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage22=$this->db->query("INSERT INTO ".DB_PREFIX."information_description SET information_id = '".(int)$information['information_id']."', language_id = '".(int)$language_id."', title = '".$this->db->escape($information['title'])."', description = '".$this->db->escape($information['description'])."', meta_title = '".$this->db->escape($information['meta_title'])."', meta_description = '".$this->db->escape($information['meta_description'])."', meta_keyword = '".$this->db->escape($information['meta_keyword'])."'")
#END
addLanguage23=$this->db->query("SELECT * FROM ".DB_PREFIX."length_class_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage24=$this->db->query("INSERT INTO ".DB_PREFIX."length_class_description SET length_class_id = '".(int)$length['length_class_id']."', language_id = '".(int)$language_id."', title = '".$this->db->escape($length['title'])."', unit = '".$this->db->escape($length['unit'])."'")
#END
editLanguage=$this->db->query("SELECT `code` FROM ".DB_PREFIX."language WHERE language_id = '".(int)$language_id."'")
#END
addLanguage20=$this->db->query("INSERT INTO ".DB_PREFIX."filter_group_description SET filter_group_id = '".(int)$filter_group['filter_group_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($filter_group['name'])."'")
#END
addLanguage14=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_value_description SET custom_field_value_id = '".(int)$custom_field_value['custom_field_value_id']."', language_id = '".(int)$language_id."', custom_field_id = '".(int)$custom_field_value['custom_field_id']."', name = '".$this->db->escape($custom_field_value['name'])."'")
#END
deleteLanguage12=$this->db->query("DELETE FROM ".DB_PREFIX."order_status WHERE language_id = '".(int)$language_id."'")
#END
addLanguage15=$this->db->query("SELECT * FROM ".DB_PREFIX."download_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteLanguage13=$this->db->query("DELETE FROM ".DB_PREFIX."product_attribute WHERE language_id = '".(int)$language_id."'")
#END
addLanguage16=$this->db->query("INSERT INTO ".DB_PREFIX."download_description SET download_id = '".(int)$download['download_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($download['name'])."'")
#END
deleteLanguage14=$this->db->query("DELETE FROM ".DB_PREFIX."product_description WHERE language_id = '".(int)$language_id."'")
#END
addLanguage17=$this->db->query("SELECT * FROM ".DB_PREFIX."filter_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteLanguage15=$this->db->query("DELETE FROM ".DB_PREFIX."return_action WHERE language_id = '".(int)$language_id."'")
#END
addLanguage10=$this->db->query("INSERT INTO ".DB_PREFIX."customer_group_description SET customer_group_id = '".(int)$customer_group['customer_group_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($customer_group['name'])."', description = '".$this->db->escape($customer_group['description'])."'")
#END
addLanguage11=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage12=$this->db->query("INSERT INTO ".DB_PREFIX."custom_field_description SET custom_field_id = '".(int)$custom_field['custom_field_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($custom_field['name'])."'")
#END
deleteLanguage10=$this->db->query("DELETE FROM ".DB_PREFIX."option_description WHERE language_id = '".(int)$language_id."'")
#END
getTotalLanguages=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."language")
#END
addLanguage13=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_value_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteLanguage=$this->db->query("DELETE FROM ".DB_PREFIX."language WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage11=$this->db->query("DELETE FROM ".DB_PREFIX."option_value_description WHERE language_id = '".(int)$language_id."'")
#END
addLanguage50=$this->db->query("INSERT INTO ".DB_PREFIX."banner_image SET banner_id = '".(int)$banner_image['banner_id']."', language_id = '".(int)$language_id."', title = '".$this->db->escape($banner_image['title'])."', link = '".$this->db->escape($banner_image['link'])."', image = '".$this->db->escape($banner_image['image'])."', sort_order = '".(int)$banner_image['sort_order']."'")
#END
addLanguage=$this->db->query("INSERT INTO ".DB_PREFIX."language SET name = '".$this->db->escape($data['name'])."', code = '".$this->db->escape($data['code'])."', locale = '".$this->db->escape($data['locale'])."', sort_order = '".$this->db->escape($data['sort_order'])."', status = '".(int)$data['status']."'")
#END
deleteLanguage16=$this->db->query("DELETE FROM ".DB_PREFIX."return_reason WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage17=$this->db->query("DELETE FROM ".DB_PREFIX."return_status WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage18=$this->db->query("DELETE FROM ".DB_PREFIX."stock_status WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage19=$this->db->query("DELETE FROM ".DB_PREFIX."voucher_theme_description WHERE language_id = '".(int)$language_id."'")
#END
getLanguage=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."language WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage9=$this->db->query("DELETE FROM ".DB_PREFIX."length_class_description WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage8=$this->db->query("DELETE FROM ".DB_PREFIX."information_description WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage7=$this->db->query("DELETE FROM ".DB_PREFIX."filter_group_description WHERE language_id = '".(int)$language_id."'")
#END
editLanguage2=$this->db->query("UPDATE ".DB_PREFIX."setting SET value = '".$this->db->escape($data['code'])."' WHERE `key` = 'config_language' AND value = '".$this->db->escape($language_query->row['code'])."'")
#END
deleteLanguage6=$this->db->query("DELETE FROM ".DB_PREFIX."filter_description WHERE language_id = '".(int)$language_id."'")
#END
editLanguage3=$this->db->query("UPDATE ".DB_PREFIX."setting SET value = '".$this->db->escape($data['code'])."' WHERE `key` = 'config_admin_language' AND value = '".$this->db->escape($language_query->row['code'])."'")
#END
deleteLanguage5=$this->db->query("DELETE FROM ".DB_PREFIX."download_description WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage4=$this->db->query("DELETE FROM ".DB_PREFIX."customer_group_description WHERE language_id = '".(int)$language_id."'")
#END
deleteLanguage3=$this->db->query("DELETE FROM ".DB_PREFIX."category_description WHERE language_id = '".(int)$language_id."'")
#END
addLanguage47=$this->db->query("SELECT * FROM ".DB_PREFIX."recurring_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteLanguage2=$this->db->query("DELETE FROM ".DB_PREFIX."attribute_group_description WHERE language_id = '".(int)$language_id."'")
#END
addLanguage48=$this->db->query("INSERT INTO ".DB_PREFIX."recurring_description SET recurring_id = '".(int)$recurring['recurring_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($recurring['name'])."'")
#END
deleteLanguage1=$this->db->query("DELETE FROM ".DB_PREFIX."attribute_description WHERE language_id = '".(int)$language_id."'")
#END
addLanguage49=$this->db->query("SELECT * FROM ".DB_PREFIX."banner_image WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
editLanguage1=$this->db->query("UPDATE ".DB_PREFIX."language SET name = '".$this->db->escape($data['name'])."', code = '".$this->db->escape($data['code'])."', locale = '".$this->db->escape($data['locale'])."', sort_order = '".$this->db->escape($data['sort_order'])."', status = '".(int)$data['status']."' WHERE language_id = '".(int)$language_id."'")
#END
addLanguage43=$this->db->query("SELECT * FROM ".DB_PREFIX."voucher_theme_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage44=$this->db->query("INSERT INTO ".DB_PREFIX."voucher_theme_description SET voucher_theme_id = '".(int)$voucher_theme['voucher_theme_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($voucher_theme['name'])."'")
#END
deleteLanguage20=$this->db->query("DELETE FROM ".DB_PREFIX."weight_class_description WHERE language_id = '".(int)$language_id."'")
#END
addLanguage45=$this->db->query("SELECT * FROM ".DB_PREFIX."weight_class_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
deleteLanguage21=$this->db->query("DELETE FROM ".DB_PREFIX."recurring_description WHERE language_id = '".(int)$language_id."'")
#END
addLanguage46=$this->db->query("INSERT INTO ".DB_PREFIX."weight_class_description SET weight_class_id = '".(int)$weight_class['weight_class_id']."', language_id = '".(int)$language_id."', title = '".$this->db->escape($weight_class['title'])."', unit = '".$this->db->escape($weight_class['unit'])."'")
#END
deleteLanguage22=$this->db->query("DELETE FROM ".DB_PREFIX."banner_image WHERE language_id = '".(int)$language_id."'")
#END
addLanguage8=$this->db->query("INSERT INTO ".DB_PREFIX."category_description SET category_id = '".(int)$category['category_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($category['name'])."', description = '".$this->db->escape($category['description'])."', meta_title = '".$this->db->escape($category['meta_title'])."', meta_description = '".$this->db->escape($category['meta_description'])."', meta_keyword = '".$this->db->escape($category['meta_keyword'])."'")
#END
addLanguage7=$this->db->query("SELECT * FROM ".DB_PREFIX."category_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage40=$this->db->query("INSERT INTO ".DB_PREFIX."return_status SET return_status_id = '".(int)$return_status['return_status_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($return_status['name'])."'")
#END
addLanguage6=$this->db->query("INSERT INTO ".DB_PREFIX."banner_image SET banner_id = '".(int)$banner_image['banner_id']."', language_id = '".(int)$language_id."', title = '".$this->db->escape($banner_image['title'])."', link = '".$this->db->escape($banner_image['link'])."', image = '".$this->db->escape($banner_image['image'])."', sort_order = '".(int)$banner_image['sort_order']."'")
#END
addLanguage41=$this->db->query("SELECT * FROM ".DB_PREFIX."stock_status WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage5=$this->db->query("SELECT * FROM ".DB_PREFIX."banner_image WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage42=$this->db->query("INSERT INTO ".DB_PREFIX."stock_status SET stock_status_id = '".(int)$stock_status['stock_status_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($stock_status['name'])."'")
#END
addLanguage4=$this->db->query("INSERT INTO ".DB_PREFIX."attribute_group_description SET attribute_group_id = '".(int)$attribute_group['attribute_group_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($attribute_group['name'])."'")
#END
addLanguage3=$this->db->query("SELECT * FROM ".DB_PREFIX."attribute_group_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addLanguage2=$this->db->query("INSERT INTO ".DB_PREFIX."attribute_description SET attribute_id = '".(int)$attribute['attribute_id']."', language_id = '".(int)$language_id."', name = '".$this->db->escape($attribute['name'])."'")
#END
addLanguage1=$this->db->query("SELECT * FROM ".DB_PREFIX."attribute_description WHERE language_id = '".(int)$this->config->get('config_language_id')."'")
#END
