addOnline1=REPLACE INTO  oc_customer_online  SET  ip  = ?1,  customer_id  = ?2,  url  = ?3,  referer  = ?4,  date_added  = ?5
#END
addOnline=DELETE FROM  oc_customer_online  WHERE date_added < ?1
#END
