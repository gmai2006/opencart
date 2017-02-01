getTotalCustomersByYear=SELECT COUNT(*) AS total, date_added FROM  oc_customer WHERE YEAR(date_added) = YEAR(NOW()) GROUP BY MONTH(date_added)
#END
getTotalCustomersByDay=SELECT COUNT(*) AS total, HOUR(date_added) AS hour FROM  oc_customer WHERE DATE(date_added) = DATE(NOW()) GROUP BY HOUR(date_added) ORDER BY date_added ASC
#END
getTotalCustomersByWeek=SELECT COUNT(*) AS total, date_added FROM  oc_customer  WHERE DATE(date_added) >= DATE(?1) GROUP BY DAYNAME(date_added)
#END
getTotalCustomersByMonth=SELECT COUNT(*) AS total, date_added FROM  oc_customer  WHERE DATE(date_added) >= ?1 GROUP BY DATE(date_added)
#END
