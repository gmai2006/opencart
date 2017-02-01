getTotalOrdersByDay=SELECT COUNT(*) AS total, HOUR(date_added) AS hour FROM  oc_order  WHERE order_status_id IN(?1) AND DATE(date_added) = DATE(NOW()) GROUP BY HOUR(date_added) ORDER BY date_added ASC
#END
getTotalOrdersByYear=SELECT COUNT(*) AS total, date_added FROM  oc_order  WHERE order_status_id IN(?1) AND YEAR(date_added) = YEAR(NOW()) GROUP BY MONTH(date_added)
#END
getTotalOrdersByCountry=SELECT COUNT(*) AS total, SUM(o.total) AS amount, c.iso_code_2 FROM  oc_order  o LEFT JOIN  oc_country c ON (o.payment_country_id = c.country_id) WHERE o.order_status_id > '0' GROUP BY o.payment_country_id
#END
getTotalOrdersByWeek=SELECT COUNT(*) AS total, date_added FROM  oc_order  WHERE order_status_id IN(?1) AND DATE(date_added) >= DATE(?2) GROUP BY DAYNAME(date_added)
#END
getTotalOrdersByMonth=SELECT COUNT(*) AS total, date_added FROM  oc_order  WHERE order_status_id IN(?1) AND DATE(date_added) >= ?2 GROUP BY DATE(date_added)
#END
