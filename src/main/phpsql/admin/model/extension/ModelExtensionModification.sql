enableModification=$this->db->query("UPDATE ".DB_PREFIX."modification SET status = '1' WHERE modification_id = '".(int)$modification_id."'")
#END
disableModification=$this->db->query("UPDATE ".DB_PREFIX."modification SET status = '0' WHERE modification_id = '".(int)$modification_id."'")
#END
getModificationByCode=$this->db->query("SELECT * FROM ".DB_PREFIX."modification WHERE code = '".$this->db->escape($code)."'")
#END
getModification=$this->db->query("SELECT * FROM ".DB_PREFIX."modification WHERE modification_id = '".(int)$modification_id."'")
#END
getTotalModifications=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."modification")
#END
addModification=$this->db->query("INSERT INTO ".DB_PREFIX."modification SET code = '".$this->db->escape($data['code'])."', name = '".$this->db->escape($data['name'])."', author = '".$this->db->escape($data['author'])."', version = '".$this->db->escape($data['version'])."', link = '".$this->db->escape($data['link'])."', xml = '".$this->db->escape($data['xml'])."', status = '".(int)$data['status']."', date_added = NOW()")
#END
deleteModification=$this->db->query("DELETE FROM ".DB_PREFIX."modification WHERE modification_id = '".(int)$modification_id."'")
#END
