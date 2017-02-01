getMarketing=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."marketing WHERE marketing_id = '".(int)$marketing_id."'")
#END
editMarketing=$this->db->query("UPDATE ".DB_PREFIX."marketing SET name = '".$this->db->escape($data['name'])."', description = '".$this->db->escape($data['description'])."', code = '".$this->db->escape($data['code'])."' WHERE marketing_id = '".(int)$marketing_id."'")
#END
addMarketing=$this->db->query("INSERT INTO ".DB_PREFIX."marketing SET name = '".$this->db->escape($data['name'])."', description = '".$this->db->escape($data['description'])."', code = '".$this->db->escape($data['code'])."', date_added = NOW()")
#END
getMarketingByCode=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."marketing WHERE code = '".$this->db->escape($code)."'")
#END
deleteMarketing=$this->db->query("DELETE FROM ".DB_PREFIX."marketing WHERE marketing_id = '".(int)$marketing_id."'")
#END
