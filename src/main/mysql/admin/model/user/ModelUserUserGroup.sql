deleteUserGroup=DELETE FROM oc_user_group WHERE user_group_id = ?1
#END
removePermission1=UPDATE oc_user_group SET permission = ?1 WHERE user_group_id = ?2
#END
addUserGroup=INSERT INTO oc_user_group SET name = ?1, permission = ?2
#END
addPermission=SELECT DISTINCT * FROM oc_user_group WHERE user_group_id = ?1
#END
addPermission1=UPDATE oc_user_group SET permission = ?1 WHERE user_group_id = ?2
#END
getUserGroup=SELECT DISTINCT * FROM oc_user_group WHERE user_group_id = ?1
#END
removePermission=SELECT DISTINCT * FROM oc_user_group WHERE user_group_id = ?1
#END
editUserGroup=UPDATE oc_user_group SET name = ?1, permission = ?2 WHERE user_group_id = ?3
#END
getTotalUserGroups=SELECT COUNT(*) AS total FROM oc_user_group
#END
