backup=$this->db->query("SELECT * FROM `".$table."`")
#END
getTables=$this->db->query("SHOW TABLES FROM `".DB_DATABASE."`")
#END
