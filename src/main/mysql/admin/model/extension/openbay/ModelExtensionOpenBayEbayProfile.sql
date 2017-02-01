add=INSERT INTO  oc_ebay_profile  SET  name  = ?1,  description  = ?2,  type  = ?3,  default  = ?4,  data  = ?5
#END
edit=UPDATE  oc_ebay_profile  SET  name  = ?1,  description  = ?2,  data  = ?3,  default  = ?4 WHERE  ebay_profile_id  = ?5 LIMIT 1
#END
get=SELECT * FROM  oc_ebay_profile  WHERE  ebay_profile_id  = ?1 LIMIT 1
#END
getDefault=SELECT  ebay_profile_id  FROM  oc_ebay_profile  WHERE  type  = ?1 AND default = '1'LIMIT 1
#END
clearDefault=UPDATE  oc_ebay_profile  SET  default  = '0' WHERE  type  = ?1
#END
delete=DELETE FROM  oc_ebay_profile  WHERE  ebay_profile_id  = ?1 LIMIT 1
#END
