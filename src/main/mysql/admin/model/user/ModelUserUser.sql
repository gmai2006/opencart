editCode=UPDATE  oc_user  SET code = ?1 WHERE LCASE(email) = ?2
#END
getUserByUsername=SELECT * FROM  oc_user  WHERE username = ?1
#END
editUser1=UPDATE  oc_user  SET salt = ?1, password = ?2 WHERE user_id = ?3
#END
addUser=INSERT INTO  oc_user  SET username = ?1, user_group_id = ?2, salt = ?3, password = ?4, firstname = ?5, lastname = ?6, email = ?7, image = ?8, status = ?9, date_added = NOW()
#END
getUser=SELECT *, (SELECT ug.name FROM  oc_user_group  ug WHERE ug.user_group_id = u.user_group_id) AS user_group FROM  oc_user  u WHERE u.user_id = ?1
#END
editUser=UPDATE  oc_user  SET username = ?1, user_group_id = ?2, firstname = ?3, lastname = ?4, email = ?5, image = ?6, status = ?7 WHERE user_id = ?8
#END
getTotalUsersByGroupId=SELECT COUNT(*) AS total FROM  oc_user  WHERE user_group_id = ?1
#END
getUserByEmail=SELECT DISTINCT * FROM  oc_user  WHERE LCASE(email) = ?1
#END
getUserByCode=SELECT * FROM  oc_user  WHERE code = ?1 AND code != ''
#END
editPassword=UPDATE  oc_user  SET salt = ?1, password = ?2, code = '' WHERE user_id = ?3
#END
deleteUser=DELETE FROM  oc_user  WHERE user_id = ?1
#END
getTotalUsersByEmail=SELECT COUNT(*) AS total FROM  oc_user  WHERE LCASE(email) = ?1
#END
getTotalUsers=SELECT COUNT(*) AS total FROM  oc_user
#END
