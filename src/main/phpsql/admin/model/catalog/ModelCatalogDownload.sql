editDownload=$this->db->query("UPDATE ".DB_PREFIX."download SET filename = '".$this->db->escape($data['filename'])."', mask = '".$this->db->escape($data['mask'])."' WHERE download_id = '".(int)$download_id."'")
#END
deleteDownload1=$this->db->query("DELETE FROM ".DB_PREFIX."download_description WHERE download_id = '".(int)$download_id."'")
#END
addDownload=$this->db->query("INSERT INTO ".DB_PREFIX."download SET filename = '".$this->db->escape($data['filename'])."', mask = '".$this->db->escape($data['mask'])."', date_added = NOW()")
#END
editDownload1=$this->db->query("DELETE FROM ".DB_PREFIX."download_description WHERE download_id = '".(int)$download_id."'")
#END
getTotalDownloads=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."download")
#END
getDownloadDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."download_description WHERE download_id = '".(int)$download_id."'")
#END
editDownload2=$this->db->query("INSERT INTO ".DB_PREFIX."download_description SET download_id = '".(int)$download_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
getDownload=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."download d LEFT JOIN ".DB_PREFIX."download_description dd ON (d.download_id = dd.download_id) WHERE d.download_id = '".(int)$download_id."' AND dd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
addDownload1=$this->db->query("INSERT INTO ".DB_PREFIX."download_description SET download_id = '".(int)$download_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
deleteDownload=$this->db->query("DELETE FROM ".DB_PREFIX."download WHERE download_id = '".(int)$download_id."'")
#END
