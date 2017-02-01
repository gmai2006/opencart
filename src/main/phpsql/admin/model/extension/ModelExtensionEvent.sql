addEvent=$this->db->query("INSERT INTO `".DB_PREFIX."event` SET `code` = '".$this->db->escape($code)."', `trigger` = '".$this->db->escape($trigger)."', `action` = '".$this->db->escape($action)."', `status` = '".(int)$status."', `date_added` = now()")
#END
getEvent=$this->db->query("SELECT * FROM `".DB_PREFIX."event` WHERE `code` = '".$this->db->escape($code)."' AND `trigger` = '".$this->db->escape($trigger)."' AND `action` = '".$this->db->escape($action)."'")
#END
uninstall1=$this->db->query("DELETE FROM ".DB_PREFIX."setting WHERE `code` = '".$this->db->escape($code)."'")
#END
uninstall=$this->db->query("DELETE FROM ".DB_PREFIX."extension WHERE `type` = '".$this->db->escape($type)."' AND `code` = '".$this->db->escape($code)."'")
#END
getTotalEvents=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."event")
#END
deleteEvent=$this->db->query("DELETE FROM `".DB_PREFIX."event` WHERE `code` = '".$this->db->escape($code)."'")
#END
disableEvent=$this->db->query("UPDATE ".DB_PREFIX."event SET `status` = '0' WHERE event_id = '".(int)$event_id."'")
#END
enableEvent=$this->db->query("UPDATE ".DB_PREFIX."event SET `status` = '1' WHERE event_id = '".(int)$event_id."'")
#END
