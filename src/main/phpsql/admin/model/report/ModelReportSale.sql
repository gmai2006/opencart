getTotalOrdersByDay=$this->db->query("SELECT COUNT(*) AS total, HOUR(date_added) AS hour FROM `".DB_PREFIX."order` WHERE order_status_id IN(".implode(",",$implode).") AND DATE(date_added) = DATE(NOW()) GROUP BY HOUR(date_added) ORDER BY date_added ASC")
#END
getTotalOrdersByYear=$this->db->query("SELECT COUNT(*) AS total, date_added FROM `".DB_PREFIX."order` WHERE order_status_id IN(".implode(",",$implode).") AND YEAR(date_added) = YEAR(NOW()) GROUP BY MONTH(date_added)")
#END
getTotalOrdersByCountry=$this->db->query("SELECT COUNT(*) AS total, SUM(o.total) AS amount, c.iso_code_2 FROM `".DB_PREFIX."order` o LEFT JOIN `".DB_PREFIX."country` c ON (o.payment_country_id = c.country_id) WHERE o.order_status_id > '0' GROUP BY o.payment_country_id")
#END
getTotalOrdersByWeek=$this->db->query("SELECT COUNT(*) AS total, date_added FROM `".DB_PREFIX."order` WHERE order_status_id IN(".implode(",",$implode).") AND DATE(date_added) >= DATE('".$this->db->escape(date('Y-m-d',$date_start))."') GROUP BY DAYNAME(date_added)")
#END
getTotalOrdersByMonth=$this->db->query("SELECT COUNT(*) AS total, date_added FROM `".DB_PREFIX."order` WHERE order_status_id IN(".implode(",",$implode).") AND DATE(date_added) >= '".$this->db->escape(date('Y').'-'.date('m').'-1')."' GROUP BY DATE(date_added)")
#END
