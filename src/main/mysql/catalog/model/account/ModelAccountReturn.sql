getReturn=SELECT r.return_id, r.order_id, r.firstname, r.lastname, r.email, r.telephone, r.product, r.model, r.quantity, r.opened, (SELECT rr.name FROM oc_return_reason rr WHERE rr.return_reason_id = r.return_reason_id AND rr.language_id = ?1) AS reason, (SELECT ra.name FROM oc_return_action ra WHERE ra.return_action_id = r.return_action_id AND ra.language_id = ?2) AS action, (SELECT rs.name FROM oc_return_status rs WHERE rs.return_status_id = r.return_status_id AND rs.language_id = ?3) AS status, r.comment, r.date_ordered, r.date_added, r.date_modified FROM  oc_return  r WHERE r.return_id = ?4 AND r.customer_id = ?5
#END
addReturn=INSERT INTO  oc_return  SET order_id = ?1, customer_id = ?2, firstname = ?3, lastname = ?4, email = ?5, telephone = ?6, product = ?7, model = ?8, quantity = ?9, opened = ?10, return_reason_id = ?11, return_status_id = ?12, comment = ?13, date_ordered = ?14, date_added = NOW(), date_modified = NOW()
#END
getTotalReturns=SELECT COUNT(*) AS total FROM  oc_return WHERE customer_id = ?1
#END
getReturnHistories=SELECT rh.date_added, rs.name AS status, rh.comment FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id = rs.return_status_id WHERE rh.return_id = ?1 AND rs.language_id = ?2 ORDER BY rh.date_added ASC
#END
getReturns=SELECT r.return_id, r.order_id, r.firstname, r.lastname, rs.name as status, r.date_added FROM  oc_return  r LEFT JOIN oc_return_status rs ON (r.return_status_id = rs.return_status_id) WHERE r.customer_id = ?1 AND rs.language_id = ?2 ORDER BY r.return_id DESC LIMIT ?3,?4
#END
