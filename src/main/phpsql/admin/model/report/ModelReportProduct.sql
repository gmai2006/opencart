getTotalProductViews=$this->db->query("SELECT SUM(viewed) AS total FROM ".DB_PREFIX."product")
#END
reset=$this->db->query("UPDATE ".DB_PREFIX."product SET viewed = '0'")
#END
getTotalProductsViewed=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."product WHERE viewed > 0")
#END
