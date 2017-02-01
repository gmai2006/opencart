editFilter1=DELETE FROM oc_filter_group_description WHERE filter_group_id = ?1
#END
deleteFilter=DELETE FROM  oc_filter_group  WHERE filter_group_id = ?1
#END
getFilterGroup=SELECT * FROM  oc_filter_group  fg LEFT JOIN oc_filter_group_description fgd ON (fg.filter_group_id = fgd.filter_group_id) WHERE fg.filter_group_id = ?1 AND fgd.language_id = ?2
#END
deleteFilter3=DELETE FROM  oc_filter_description  WHERE filter_group_id = ?1
#END
getFilterDescriptions1=SELECT * FROM oc_filter_description WHERE filter_id = ?1
#END
getFilter=SELECT *, (SELECT name FROM oc_filter_group_description fgd WHERE f.filter_group_id = fgd.filter_group_id AND fgd.language_id = ?1) AS  group  FROM oc_filter f LEFT JOIN oc_filter_description fd ON (f.filter_id = fd.filter_id) WHERE f.filter_id = ?2 AND fd.language_id = ?3
#END
editFilter=UPDATE  oc_filter_group  SET sort_order = ?1 WHERE filter_group_id = ?2
#END
deleteFilter1=DELETE FROM  oc_filter_group_description  WHERE filter_group_id = ?1
#END
deleteFilter2=DELETE FROM  oc_filter  WHERE filter_group_id = ?1
#END
addFilter2=INSERT INTO oc_filter SET filter_group_id = ?1, sort_order = ?2
#END
addFilter1=INSERT INTO oc_filter_group_description SET filter_group_id = ?1, language_id = ?2, name = ?3
#END
addFilter3=INSERT INTO oc_filter_description SET filter_id = ?1, language_id = ?2, filter_group_id = ?3, name = ?4
#END
editFilter7=INSERT INTO oc_filter_description SET filter_id = ?1, language_id = ?2, filter_group_id = ?3, name = ?4
#END
addFilter=INSERT INTO  oc_filter_group  SET sort_order = ?1
#END
editFilter6=INSERT INTO oc_filter SET filter_group_id = ?1, sort_order = ?2
#END
getFilterGroupDescriptions=SELECT * FROM oc_filter_group_description WHERE filter_group_id = ?1
#END
getFilterDescriptions=SELECT * FROM oc_filter WHERE filter_group_id = ?1
#END
editFilter3=DELETE FROM oc_filter WHERE filter_group_id = ?1
#END
editFilter2=INSERT INTO oc_filter_group_description SET filter_group_id = ?1, language_id = ?2, name = ?3
#END
getTotalFilterGroups=SELECT COUNT(*) AS total FROM  oc_filter_group
#END
editFilter5=INSERT INTO oc_filter SET filter_id = ?1, filter_group_id = ?2, sort_order = ?3
#END
editFilter4=DELETE FROM oc_filter_description WHERE filter_group_id = ?1
#END
