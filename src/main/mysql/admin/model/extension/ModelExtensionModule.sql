getModule=SELECT * FROM  oc_module  WHERE  module_id  = ?1
#END
deleteModulesByCode=DELETE FROM  oc_module  WHERE  code  = ?1
#END
getModulesByCode=SELECT * FROM  oc_module  WHERE  code  = ?1 ORDER BY name
#END
deleteModulesByCode1=DELETE FROM  oc_layout_module  WHERE  code  LIKE ?1 OR  code  LIKE ?2
#END
editModule=UPDATE  oc_module  SET  name  = ?1,  setting  = ?2 WHERE  module_id  = ?3
#END
getModules=SELECT * FROM  oc_module ORDER BY code
#END
addModule=INSERT INTO  oc_module  SET  name  = ?1,  code  = ?2,  setting  = ?3
#END
deleteModule1=DELETE FROM  oc_layout_module  WHERE  code  LIKE '%.?1
#END
deleteModule=DELETE FROM  oc_module  WHERE  module_id  = ?1
#END
