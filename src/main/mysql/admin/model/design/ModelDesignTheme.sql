editTheme1=INSERT INTO  oc_theme  SET store_id = ?1, theme = ?2, route = ?3, code = ?4
#END
getTheme=SELECT * FROM  oc_theme  WHERE store_id = ?1 AND theme = ?2 AND route = ?3
#END
editTheme=DELETE FROM  oc_theme  WHERE store_id = ?1 AND theme = ?2 AND route = ?3
#END
deleteTheme=DELETE FROM  oc_theme  WHERE store_id = ?1 AND theme = ?2 AND route = ?3
#END
