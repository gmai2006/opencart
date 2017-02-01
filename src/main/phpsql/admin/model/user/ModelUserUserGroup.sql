deleteUserGroup=$this->db->query("DELETE FROM ".DB_PREFIX."user_group WHERE user_group_id = '".(int)$user_group_id."'")
#END
removePermission1=$this->db->query("UPDATE ".DB_PREFIX."user_group SET permission = '".$this->db->escape(json_encode($data))."' WHERE user_group_id = '".(int)$user_group_id."'")
#END
addUserGroup=$this->db->query("INSERT INTO ".DB_PREFIX."user_group SET name = '".$this->db->escape($data['name'])."', permission = '".(isset($data['permission'])?$this->db->escape(json_encode($data['permission'])):'')."'")
#END
addPermission=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."user_group WHERE user_group_id = '".(int)$user_group_id."'")
#END
addPermission1=$this->db->query("UPDATE ".DB_PREFIX."user_group SET permission = '".$this->db->escape(json_encode($data))."' WHERE user_group_id = '".(int)$user_group_id."'")
#END
getUserGroup=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."user_group WHERE user_group_id = '".(int)$user_group_id."'")
#END
removePermission=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."user_group WHERE user_group_id = '".(int)$user_group_id."'")
#END
editUserGroup=$this->db->query("UPDATE ".DB_PREFIX."user_group SET name = '".$this->db->escape($data['name'])."', permission = '".(isset($data['permission'])?$this->db->escape(json_encode($data['permission'])):'')."' WHERE user_group_id = '".(int)$user_group_id."'")
#END
getTotalUserGroups=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."user_group")
#END
