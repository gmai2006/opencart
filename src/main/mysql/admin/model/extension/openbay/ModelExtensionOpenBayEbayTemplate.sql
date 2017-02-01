add=INSERT INTO  oc_ebay_template  SET  name  = ?1,  html  = ?2
#END
getAll=SELECT * FROM  oc_ebay_template
#END
edit=UPDATE  oc_ebay_template  SET  name  = ?1,  html  = ?2 WHERE  template_id  = ?3 LIMIT 1
#END
get=SELECT * FROM  oc_ebay_template  WHERE  template_id  = ?1 LIMIT 1
#END
delete=DELETE FROM  oc_ebay_template  WHERE  template_id  = ?1 LIMIT 1
#END
