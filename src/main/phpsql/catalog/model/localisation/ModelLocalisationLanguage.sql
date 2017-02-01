getLanguage=$this->db->query("SELECT * FROM ".DB_PREFIX."language WHERE language_id = '".(int)$language_id."'")
#END
getLanguages=$this->db->query("SELECT * FROM ".DB_PREFIX."language WHERE status = '1' ORDER BY sort_order, name")
#END
