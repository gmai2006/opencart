create=INSERT INTO  oc_order_recurring  SET  order_id  = ?1,  date_added  = NOW(),  status  = 6,  product_id  = ?2,  product_name  = ?3,  product_quantity  = ?4,  recurring_id  = ?5,  recurring_name  = ?6,  recurring_description  = ?7,  recurring_frequency  = ?8,  recurring_cycle  = ?9,  recurring_duration  = ?10,  recurring_price  = ?11,  trial  = ?12,  trial_frequency  = ?13,  trial_cycle  = ?14,  trial_duration  = ?15,  trial_price  = ?16, reference = ''
#END
addReference=UPDATE oc_order_recurring SET reference = ?1 WHERE order_recurring_id = ?2
#END
