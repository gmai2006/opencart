getReturn=SELECT DISTINCT *, (SELECT CONCAT(c.firstname, ' ', c.lastname) FROM oc_customer c WHERE c.customer_id = r.customer_id) AS customer FROM  oc_return  r WHERE r.return_id = ?1
#END
getTotalReturnHistoriesByReturnStatusId=SELECT COUNT(*) AS total FROM oc_return_history WHERE return_status_id = ?1
#END
editReturn=UPDATE  oc_return  SET order_id = ?1, product_id = ?2, customer_id = ?3, firstname = ?4, lastname = ?5, email = ?6, telephone = ?7, product = ?8, model = ?9, quantity = ?10, opened = ?11, return_reason_id = ?12, return_action_id = ?13, comment = ?14, date_ordered = ?15, date_modified = NOW() WHERE return_id = ?16
#END
getTotalReturnsByReturnActionId=SELECT COUNT(*) AS total FROM  oc_return  WHERE return_action_id = ?1
#END
addReturnHistory2=SELECT *, rs.name AS status FROM  oc_return  r LEFT JOIN oc_return_status rs ON (r.return_status_id = rs.return_status_id) WHERE r.return_id = ?1 AND rs.language_id = ?2
#END
addReturnHistory1=INSERT INTO oc_return_history SET return_id = ?1, return_status_id = ?2, notify = ?3, comment = ?4, date_added = NOW()
#END
deleteReturn=DELETE FROM  oc_return  WHERE return_id = ?1
#END
deleteReturn1=DELETE FROM oc_return_history WHERE return_id = ?1
#END
addReturnHistory=UPDATE  oc_return  SET return_status_id = ?1, date_modified = NOW() WHERE return_id = ?2
#END
addReturn=INSERT INTO  oc_return  SET order_id = ?1, product_id = ?2, customer_id = ?3, firstname = ?4, lastname = ?5, email = ?6, telephone = ?7, product = ?8, model = ?9, quantity = ?10, opened = ?11, return_reason_id = ?12, return_action_id = ?13, return_status_id = ?14, comment = ?15, date_ordered = ?16, date_added = NOW(), date_modified = NOW()
#END
getReturnHistories=SELECT rh.date_added, rs.name AS status, rh.comment, rh.notify FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id = rs.return_status_id WHERE rh.return_id = ?1 AND rs.language_id = ?2 ORDER BY rh.date_added ASC LIMIT ?3,?4
#END
getTotalReturnsByReturnReasonId=SELECT COUNT(*) AS total FROM  oc_return  WHERE return_reason_id = ?1
#END
getTotalReturnsByReturnStatusId=SELECT COUNT(*) AS total FROM  oc_return  WHERE return_status_id = ?1
#END
getTotalReturnHistories=SELECT COUNT(*) AS total FROM oc_return_history WHERE return_id = ?1
#END
