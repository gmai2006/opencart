getReturnReasons=$this->db->query("SELECT return_reason_id, name FROM ".DB_PREFIX."return_reason WHERE language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY name")
#END
