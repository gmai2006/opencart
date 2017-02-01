addEvent=INSERT INTO  oc_event  SET  code  = ?1,  trigger  = ?2,  action  = ?3,  status  = ?4, date_added = now()
#END
getEvent=SELECT * FROM  oc_event  WHERE  code  = ?1 AND  trigger  = ?2 AND  action  = ?3
#END
uninstall1=DELETE FROM oc_setting WHERE  code  = ?1
#END
uninstall=DELETE FROM oc_extension WHERE  type  = ?1 AND  code  = ?2
#END
getTotalEvents=SELECT COUNT(*) AS total FROM oc_event
#END
deleteEvent=DELETE FROM  oc_event  WHERE  code  = ?1
#END
disableEvent=UPDATE oc_event SET  status  = '0' WHERE event_id = ?1
#END
enableEvent=UPDATE oc_event SET  status  = '1' WHERE event_id = ?1
#END
