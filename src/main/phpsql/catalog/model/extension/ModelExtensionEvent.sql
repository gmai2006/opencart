getEvents=$this->db->query("SELECT * FROM `".DB_PREFIX."event` WHERE `trigger` LIKE 'catalog/%' AND status = '1' ORDER BY `event_id` ASC")
#END
