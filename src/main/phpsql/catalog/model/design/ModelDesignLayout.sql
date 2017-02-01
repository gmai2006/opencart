getLayoutModules=$this->db->query("SELECT * FROM ".DB_PREFIX."layout_module WHERE layout_id = '".(int)$layout_id."' AND position = '".$this->db->escape($position)."' ORDER BY sort_order")
#END
getLayout=$this->db->query("SELECT * FROM ".DB_PREFIX."layout_route WHERE '".$this->db->escape($route)."' LIKE route AND store_id = '".(int)$this->config->get('config_store_id')."' ORDER BY route DESC LIMIT 1")
#END
