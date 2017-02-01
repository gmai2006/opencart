getCustomFields2=$this->db->query("SELECT * FROM ".DB_PREFIX."custom_field_value cfv LEFT JOIN ".DB_PREFIX."custom_field_value_description cfvd ON (cfv.custom_field_value_id = cfvd.custom_field_value_id) WHERE cfv.custom_field_id = '".(int)$custom_field['custom_field_id']."' AND cfvd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY cfv.sort_order ASC")
#END
getCustomField=$this->db->query("SELECT * FROM `".DB_PREFIX."custom_field` cf LEFT JOIN `".DB_PREFIX."custom_field_description` cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.status = '1' AND cf.custom_field_id = '".(int)$custom_field_id."' AND cfd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
getCustomFields=$this->db->query("SELECT * FROM `".DB_PREFIX."custom_field` cf LEFT JOIN `".DB_PREFIX."custom_field_description` cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.status = '1' AND cfd.language_id = '".(int)$this->config->get('config_language_id')."' AND cf.status = '1' ORDER BY cf.sort_order ASC")
#END
getCustomFields1=$this->db->query("SELECT * FROM `".DB_PREFIX."custom_field_customer_group` cfcg LEFT JOIN `".DB_PREFIX."custom_field` cf ON (cfcg.custom_field_id = cf.custom_field_id) LEFT JOIN `".DB_PREFIX."custom_field_description` cfd ON (cf.custom_field_id = cfd.custom_field_id) WHERE cf.status = '1' AND cfd.language_id = '".(int)$this->config->get('config_language_id')."' AND cfcg.customer_group_id = '".(int)$customer_group_id."' ORDER BY cf.sort_order ASC")
#END
