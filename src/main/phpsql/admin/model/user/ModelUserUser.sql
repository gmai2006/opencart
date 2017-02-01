editCode=$this->db->query("UPDATE `".DB_PREFIX."user` SET code = '".$this->db->escape($code)."' WHERE LCASE(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getUserByUsername=$this->db->query("SELECT * FROM `".DB_PREFIX."user` WHERE username = '".$this->db->escape($username)."'")
#END
editUser1=$this->db->query("UPDATE `".DB_PREFIX."user` SET salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."' WHERE user_id = '".(int)$user_id."'")
#END
addUser=$this->db->query("INSERT INTO `".DB_PREFIX."user` SET username = '".$this->db->escape($data['username'])."', user_group_id = '".(int)$data['user_group_id']."', salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($data['password']))))."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', image = '".$this->db->escape($data['image'])."', status = '".(int)$data['status']."', date_added = NOW()")
#END
getUser=$this->db->query("SELECT *, (SELECT ug.name FROM `".DB_PREFIX."user_group` ug WHERE ug.user_group_id = u.user_group_id) AS user_group FROM `".DB_PREFIX."user` u WHERE u.user_id = '".(int)$user_id."'")
#END
editUser=$this->db->query("UPDATE `".DB_PREFIX."user` SET username = '".$this->db->escape($data['username'])."', user_group_id = '".(int)$data['user_group_id']."', firstname = '".$this->db->escape($data['firstname'])."', lastname = '".$this->db->escape($data['lastname'])."', email = '".$this->db->escape($data['email'])."', image = '".$this->db->escape($data['image'])."', status = '".(int)$data['status']."' WHERE user_id = '".(int)$user_id."'")
#END
getTotalUsersByGroupId=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."user` WHERE user_group_id = '".(int)$user_group_id."'")
#END
getUserByEmail=$this->db->query("SELECT DISTINCT * FROM `".DB_PREFIX."user` WHERE LCASE(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getUserByCode=$this->db->query("SELECT * FROM `".DB_PREFIX."user` WHERE code = '".$this->db->escape($code)."' AND code != ''")
#END
editPassword=$this->db->query("UPDATE `".DB_PREFIX."user` SET salt = '".$this->db->escape($salt=token(9))."', password = '".$this->db->escape(sha1($salt.sha1($salt.sha1($password))))."', code = '' WHERE user_id = '".(int)$user_id."'")
#END
deleteUser=$this->db->query("DELETE FROM `".DB_PREFIX."user` WHERE user_id = '".(int)$user_id."'")
#END
getTotalUsersByEmail=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."user` WHERE LCASE(email) = '".$this->db->escape(utf8_strtolower($email))."'")
#END
getTotalUsers=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."user`")
#END
