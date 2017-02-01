uninstall1=DELETE FROM oc_setting WHERE  code  = ?1
#END
uninstall=DELETE FROM oc_extension WHERE  type  = ?1 AND  code  = ?2
#END
install=INSERT INTO oc_extension SET  type  = ?1,  code  = ?2
#END
getInstalled=SELECT * FROM oc_extension WHERE  type  = ?1 ORDER BY code
#END
