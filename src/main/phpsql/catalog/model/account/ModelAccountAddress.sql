getAddresses=$this->db->query("SELECT * FROM ".DB_PREFIX."address WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
getAddress2=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$address_query->row['zone_id']."'")
#END
editAddress1=$this->db->query("UPDATE ".DB_PREFIX."customer SET address_id = '".(int)$address_id."' WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
getAddress1=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$address_query->row['country_id']."'")
#END
addAddress=$this->db->query("INSERT INTO ".DB_PREFIX."address SET customer_id = '".(int)$this->customer->getId()."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', company = '".$this->db->escape($data['company'])."', address_1 = '".$this->db->escape($data['address_1'])."', address_2 = '".$this->db->escape($data['address_2'])."', postcode = '".$this->db->escape($data['postcode'])."', city = '".$this->db->escape($data['city'])."', zone_id = '".(int)$data['zone_id']."', country_id = '".(int)$data['country_id']."', custom_field = '".$this->db->escape(isset($data['custom_field'])?json_encode($data['custom_field']):'')."'")
#END
addAddress1=$this->db->query("UPDATE ".DB_PREFIX."customer SET address_id = '".(int)$address_id."' WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
getAddresses2=$this->db->query("SELECT * FROM `".DB_PREFIX."zone` WHERE zone_id = '".(int)$result['zone_id']."'")
#END
deleteAddress=$this->db->query("DELETE FROM ".DB_PREFIX."address WHERE address_id = '".(int)$address_id."' AND customer_id = '".(int)$this->customer->getId()."'")
#END
getAddress=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."address WHERE address_id = '".(int)$address_id."' AND customer_id = '".(int)$this->customer->getId()."'")
#END
getAddresses1=$this->db->query("SELECT * FROM `".DB_PREFIX."country` WHERE country_id = '".(int)$result['country_id']."'")
#END
editAddress=$this->db->query("UPDATE ".DB_PREFIX."address SET firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', company = '".$this->db->escape($data['company'])."', address_1 = '".$this->db->escape($data['address_1'])."', address_2 = '".$this->db->escape($data['address_2'])."', postcode = '".$this->db->escape($data['postcode'])."', city = '".$this->db->escape($data['city'])."', zone_id = '".(int)$data['zone_id']."', country_id = '".(int)$data['country_id']."', custom_field = '".$this->db->escape(isset($data['custom_field'])?json_encode($data['custom_field']):'')."' WHERE address_id  = '".(int)$address_id."' AND customer_id = '".(int)$this->customer->getId()."'")
#END
getTotalAddresses=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."address WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
