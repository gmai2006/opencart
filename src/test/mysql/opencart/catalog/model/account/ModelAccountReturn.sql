ModelAccountReturn.getReturn.getReturn=SELECT  *   FROM "oc_return" r
#END
ModelAccountReturn.getReturns.getReturns=SELECT  *   FROM "oc_return" r LEFT JOIN oc_return_status rs ON( r.return_status_id = rs.return_status_id )
#END
ModelAccountReturn.getTotalReturns.getTotalReturns=SELECT  *   FROM "oc_return"
#END
ModelAccountReturn.getReturnHistories.getReturnHistories=SELECT  *   FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id = rs.return_status_id
#END
