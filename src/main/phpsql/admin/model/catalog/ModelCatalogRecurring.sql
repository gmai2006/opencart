getTotalRecurrings=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."recurring`")
#END
deleteRecurring1=$this->db->query("DELETE FROM `".DB_PREFIX."recurring_description` WHERE recurring_id = ".(int)$recurring_id."")
#END
addRecurring1=$this->db->query("INSERT INTO `".DB_PREFIX."recurring_description` (`recurring_id`, `language_id`, `name`) VALUES (".(int)$recurring_id.", ".(int)$language_id.", '".$this->db->escape($recurring_description['name'])."')")
#END
deleteRecurring=$this->db->query("DELETE FROM `".DB_PREFIX."recurring` WHERE recurring_id = ".(int)$recurring_id."")
#END
deleteRecurring3=$this->db->query("UPDATE `".DB_PREFIX."order_recurring` SET `recurring_id` = 0 WHERE `recurring_id` = ".(int)$recurring_id."")
#END
editRecurring=$this->db->query("DELETE FROM `".DB_PREFIX."recurring_description` WHERE recurring_id = '".(int)$recurring_id."'")
#END
deleteRecurring2=$this->db->query("DELETE FROM `".DB_PREFIX."product_recurring` WHERE recurring_id = ".(int)$recurring_id."")
#END
getRecurringDescription=$this->db->query("SELECT * FROM `".DB_PREFIX."recurring_description` WHERE `recurring_id` = '".(int)$recurring_id."'")
#END
editRecurring1=$this->db->query("UPDATE `".DB_PREFIX."recurring` SET `price` = '".(float)$data['price']."', `frequency` = '".$this->db->escape($data['frequency'])."', `duration` = '".(int)$data['duration']."', `cycle` = '".(int)$data['cycle']."', `sort_order` = '".(int)$data['sort_order']."', `status` = '".(int)$data['status']."', `trial_price` = '".(float)$data['trial_price']."', `trial_frequency` = '".$this->db->escape($data['trial_frequency'])."', `trial_duration` = '".(int)$data['trial_duration']."', `trial_cycle` = '".(int)$data['trial_cycle']."', `trial_status` = '".(int)$data['trial_status']."' WHERE recurring_id = '".(int)$recurring_id."'")
#END
getRecurring=$this->db->query("SELECT * FROM `".DB_PREFIX."recurring` WHERE recurring_id = '".(int)$recurring_id."'")
#END
addRecurring=$this->db->query("INSERT INTO `".DB_PREFIX."recurring` SET `sort_order` = ".(int)$data['sort_order'].", `status` = ".(int)$data['status'].", `price` = ".(float)$data['price'].", `frequency` = '".$this->db->escape($data['frequency'])."', `duration` = ".(int)$data['duration'].", `cycle` = ".(int)$data['cycle'].", `trial_status` = ".(int)$data['trial_status'].", `trial_price` = ".(float)$data['trial_price'].", `trial_frequency` = '".$this->db->escape($data['trial_frequency'])."', `trial_duration` = ".(int)$data['trial_duration'].", `trial_cycle` = '".(int)$data['trial_cycle']."'")
#END
editRecurring2=$this->db->query("INSERT INTO `".DB_PREFIX."recurring_description` (`recurring_id`, `language_id`, `name`) VALUES (".(int)$recurring_id.", ".(int)$language_id.", '".$this->db->escape($recurring_description['name'])."')")
#END
