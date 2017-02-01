getEvents=SELECT * FROM  oc_event WHERE trigger LIKE 'catalog/%' AND status = '1' ORDER BY event_id ASC
#END
