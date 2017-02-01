getInformationLayouts=$this->db->query("SELECT * FROM ".DB_PREFIX."information_to_layout WHERE information_id = '".(int)$information_id."'")
#END
getTotalInformationsByLayoutId=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."information_to_layout WHERE layout_id = '".(int)$layout_id."'")
#END
addInformation=$this->db->query("INSERT INTO ".DB_PREFIX."information SET sort_order = '".(int)$data['sort_order']."', bottom = '".(isset($data['bottom'])?(int)$data['bottom']:0)."', status = '".(int)$data['status']."'")
#END
getInformations=$this->db->query("SELECT * FROM ".DB_PREFIX."information i LEFT JOIN ".DB_PREFIX."information_description id ON (i.information_id = id.information_id) WHERE id.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY id.title")
#END
getInformationDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."information_description WHERE information_id = '".(int)$information_id."'")
#END
getTotalInformations=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."information")
#END
getInformation=$this->db->query("SELECT DISTINCT *, (SELECT keyword FROM ".DB_PREFIX."url_alias WHERE query = 'information_id=".(int)$information_id."') AS keyword FROM ".DB_PREFIX."information WHERE information_id = '".(int)$information_id."'")
#END
deleteInformation4=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'information_id=".(int)$information_id."'")
#END
deleteInformation3=$this->db->query("DELETE FROM ".DB_PREFIX."information_to_layout WHERE information_id = '".(int)$information_id."'")
#END
deleteInformation2=$this->db->query("DELETE FROM ".DB_PREFIX."information_to_store WHERE information_id = '".(int)$information_id."'")
#END
deleteInformation1=$this->db->query("DELETE FROM ".DB_PREFIX."information_description WHERE information_id = '".(int)$information_id."'")
#END
getInformationStores=$this->db->query("SELECT * FROM ".DB_PREFIX."information_to_store WHERE information_id = '".(int)$information_id."'")
#END
editInformation6=$this->db->query("INSERT INTO ".DB_PREFIX."information_to_layout SET information_id = '".(int)$information_id."', store_id = '".(int)$store_id."', layout_id = '".(int)$layout_id."'")
#END
editInformation7=$this->db->query("DELETE FROM ".DB_PREFIX."url_alias WHERE query = 'information_id=".(int)$information_id."'")
#END
editInformation8=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'information_id=".(int)$information_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
editInformation2=$this->db->query("INSERT INTO ".DB_PREFIX."information_description SET information_id = '".(int)$information_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($value['title'])."', description = '".$this->db->escape($value['description'])."', meta_title = '".$this->db->escape($value['meta_title'])."', meta_description = '".$this->db->escape($value['meta_description'])."', meta_keyword = '".$this->db->escape($value['meta_keyword'])."'")
#END
deleteInformation=$this->db->query("DELETE FROM ".DB_PREFIX."information WHERE information_id = '".(int)$information_id."'")
#END
editInformation3=$this->db->query("DELETE FROM ".DB_PREFIX."information_to_store WHERE information_id = '".(int)$information_id."'")
#END
editInformation4=$this->db->query("INSERT INTO ".DB_PREFIX."information_to_store SET information_id = '".(int)$information_id."', store_id = '".(int)$store_id."'")
#END
editInformation5=$this->db->query("DELETE FROM ".DB_PREFIX."information_to_layout WHERE information_id = '".(int)$information_id."'")
#END
addInformation3=$this->db->query("INSERT INTO ".DB_PREFIX."information_to_layout SET information_id = '".(int)$information_id."', store_id = '".(int)$store_id."', layout_id = '".(int)$layout_id."'")
#END
addInformation4=$this->db->query("INSERT INTO ".DB_PREFIX."url_alias SET query = 'information_id=".(int)$information_id."', keyword = '".$this->db->escape($data['keyword'])."'")
#END
editInformation=$this->db->query("UPDATE ".DB_PREFIX."information SET sort_order = '".(int)$data['sort_order']."', bottom = '".(isset($data['bottom'])?(int)$data['bottom']:0)."', status = '".(int)$data['status']."' WHERE information_id = '".(int)$information_id."'")
#END
editInformation1=$this->db->query("DELETE FROM ".DB_PREFIX."information_description WHERE information_id = '".(int)$information_id."'")
#END
addInformation1=$this->db->query("INSERT INTO ".DB_PREFIX."information_description SET information_id = '".(int)$information_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($value['title'])."', description = '".$this->db->escape($value['description'])."', meta_title = '".$this->db->escape($value['meta_title'])."', meta_description = '".$this->db->escape($value['meta_description'])."', meta_keyword = '".$this->db->escape($value['meta_keyword'])."'")
#END
addInformation2=$this->db->query("INSERT INTO ".DB_PREFIX."information_to_store SET information_id = '".(int)$information_id."', store_id = '".(int)$store_id."'")
#END
