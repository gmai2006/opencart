getTotalRecurrings=SELECT COUNT(*) AS total FROM  oc_recurring
#END
deleteRecurring1=DELETE FROM  oc_recurring_description  WHERE recurring_id = ?1
#END
addRecurring1=INSERT INTO  oc_recurring_description  ( recurring_id ,  language_id ,  name ) VALUES (?1, ?2, ?3)
#END
deleteRecurring=DELETE FROM  oc_recurring  WHERE recurring_id = ?1
#END
deleteRecurring3=UPDATE  oc_order_recurring  SET  recurring_id  = 0 WHERE  recurring_id  = ?1
#END
editRecurring=DELETE FROM  oc_recurring_description  WHERE recurring_id = ?1
#END
deleteRecurring2=DELETE FROM  oc_product_recurring  WHERE recurring_id = ?1
#END
getRecurringDescription=SELECT * FROM  oc_recurring_description  WHERE  recurring_id  = ?1
#END
editRecurring1=UPDATE  oc_recurring  SET  price  = ?1,  frequency  = ?2,  duration  = ?3,  cycle  = ?4,  sort_order  = ?5,  status  = ?6,  trial_price  = ?7,  trial_frequency  = ?8,  trial_duration  = ?9,  trial_cycle  = ?10,  trial_status  = ?11 WHERE recurring_id = ?12
#END
getRecurring=SELECT * FROM  oc_recurring  WHERE recurring_id = ?1
#END
addRecurring=INSERT INTO  oc_recurring  SET  sort_order  = ?1,  status  = ?2,  price  = ?3,  frequency  = ?4,  duration  = ?5,  cycle  = ?6,  trial_status  = ?7,  trial_price  = ?8,  trial_frequency  = ?9,  trial_duration  = ?10,  trial_cycle  = ?11
#END
editRecurring2=INSERT INTO  oc_recurring_description  ( recurring_id ,  language_id ,  name ) VALUES (?1, ?2, ?3)
#END
