getActivities=SELECT a.key, a.data, a.date_added FROM ((SELECT CONCAT('customer_', ca.key) AS  key , ca.data, ca.date_added FROM  oc_customer_activity  ca) UNION (SELECT CONCAT('affiliate_', aa.key) AS  key , aa.data, aa.date_added FROM  oc_affiliate_activity aa)) a ORDER BY a.date_added DESC LIMIT 0,5
#END
