getTotalCustomersByYear=$this->db->query("SELECT COUNT(*) AS total, date_added FROM `".DB_PREFIX."customer` WHERE YEAR(date_added) = YEAR(NOW()) GROUP BY MONTH(date_added)")
#END
getTotalCustomersByDay=$this->db->query("SELECT COUNT(*) AS total, HOUR(date_added) AS hour FROM `".DB_PREFIX."customer` WHERE DATE(date_added) = DATE(NOW()) GROUP BY HOUR(date_added) ORDER BY date_added ASC")
#END
getTotalCustomersByWeek=$this->db->query("SELECT COUNT(*) AS total, date_added FROM `".DB_PREFIX."customer` WHERE DATE(date_added) >= DATE('".$this->db->escape(date('Y-m-d',$date_start))."') GROUP BY DAYNAME(date_added)")
#END
getTotalCustomersByMonth=$this->db->query("SELECT COUNT(*) AS total, date_added FROM `".DB_PREFIX."customer` WHERE DATE(date_added) >= '".$this->db->escape(date('Y').'-'.date('m').'-1')."' GROUP BY DATE(date_added)")
#END
