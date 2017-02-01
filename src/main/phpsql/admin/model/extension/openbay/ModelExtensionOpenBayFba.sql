install1=$this->db->query("
				CREATE TABLE IF NOT EXISTS `".DB_PREFIX."fba_order_fulfillment` (
					`fba_order_fulfillment_id` INT(11) NOT NULL AUTO_INCREMENT,
					`order_id` INT(11) NOT NULL,
				    `created` DATETIME NOT NULL,
					`request_body` TEXT NOT NULL,
					`response_body` TEXT NOT NULL,
					`response_header_code` INT(3) NOT NULL,
					`type` INT(3) NOT NULL,
					PRIMARY KEY (`fba_order_fulfillment_id`),
  				    KEY `order_id` (`order_id`)
				) ENGINE=InnoDB  DEFAULT CHARSET=latin1;")
#END
countFbaOrders=$this->db->query("SELECT COUNT(*) AS `total` FROM `".DB_PREFIX."fba_order`")
#END
uninstall=$this->db->query("DELETE FROM `".DB_PREFIX."setting` WHERE `code` = 'openbay_fba'")
#END
install=$this->db->query("
				CREATE TABLE IF NOT EXISTS `".DB_PREFIX."fba_order` (
					`order_id` INT(11) NOT NULL,
					`fba_order_fulfillment_id` INT(11) NOT NULL,
					`fba_order_fulfillment_ref` CHAR(50) NOT NULL,
					`status` CHAR(10) NOT NULL,
				    `created` DATETIME NOT NULL,
  				    KEY `fba_order_id` (`order_id`)
				) ENGINE=InnoDB  DEFAULT CHARSET=latin1;")
#END
