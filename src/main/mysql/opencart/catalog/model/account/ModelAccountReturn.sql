ModelAccountReturn.getReturn.getReturn=SELECT r.return_id, r.order_id, r.firstname, r.lastname, r.email, r.telephone, r.product, r.model, r.quantity, r.opened, (SELECT rr.name FROM oc_return_reason rr WHERE rr.return_reason_id = r.return_reason_id AND rr.language_id = 'param0') AS reason, (SELECT ra.name FROM oc_return_action ra WHERE ra.return_action_id = r.return_action_id AND ra.language_id = 'param1') AS action, (SELECT rs.name FROM oc_return_status rs WHERE rs.return_status_id = r.return_status_id AND rs.language_id = 'param2') AS status, r.comment, r.date_ordered, r.date_added, r.date_modified FROM "oc_return" r WHERE r.return_id = 'param3' AND r.customer_id = 'param4'
#END
ModelAccountReturn.getReturns.getReturns=SELECT r.return_id, r.order_id, r.firstname, r.lastname, rs.name as status, r.date_added FROM "oc_return" r LEFT JOIN oc_return_status rs ON (r.return_status_id = rs.return_status_id) WHERE r.customer_id = 'param0' AND rs.language_id = 'param1' ORDER BY r.return_id DESC LIMIT param2,param3
#END
ModelAccountReturn.getTotalReturns.getTotalReturns=SELECT COUNT(*) AS total FROM "oc_return" WHERE customer_id = 'param0'
#END
ModelAccountReturn.getReturnHistories.getReturnHistories=SELECT rh.date_added, rs.name AS status, rh.comment FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id = rs.return_status_id WHERE rh.return_id = 'param0' AND rs.language_id = 'param1' ORDER BY rh.date_added ASC
#END
