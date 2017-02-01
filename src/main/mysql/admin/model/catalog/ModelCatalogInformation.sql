getInformationLayouts=SELECT * FROM oc_information_to_layout WHERE information_id = ?1
#END
getTotalInformationsByLayoutId=SELECT COUNT(*) AS total FROM oc_information_to_layout WHERE layout_id = ?1
#END
addInformation=INSERT INTO oc_information SET sort_order = ?1, bottom = ?2, status = ?3
#END
getInformations=SELECT * FROM oc_information i LEFT JOIN oc_information_description id ON (i.information_id = id.information_id) WHERE id.language_id = ?1 ORDER BY id.title
#END
getInformationDescriptions=SELECT * FROM oc_information_description WHERE information_id = ?1
#END
getTotalInformations=SELECT COUNT(*) AS total FROM oc_information
#END
getInformation=SELECT DISTINCT *, (SELECT keyword FROM oc_url_alias WHERE query = 'information_id=?1) AS keyword FROM oc_information WHERE information_id = ?2
#END
deleteInformation4=DELETE FROM oc_url_alias WHERE query = 'information_id=?1
#END
deleteInformation3=DELETE FROM oc_information_to_layout WHERE information_id = ?1
#END
deleteInformation2=DELETE FROM oc_information_to_store WHERE information_id = ?1
#END
deleteInformation1=DELETE FROM oc_information_description WHERE information_id = ?1
#END
getInformationStores=SELECT * FROM oc_information_to_store WHERE information_id = ?1
#END
editInformation6=INSERT INTO oc_information_to_layout SET information_id = ?1, store_id = ?2, layout_id = ?3
#END
editInformation7=DELETE FROM oc_url_alias WHERE query = 'information_id=?1
#END
editInformation8=INSERT INTO oc_url_alias SET query = 'information_id=?1, keyword = ?2
#END
editInformation2=INSERT INTO oc_information_description SET information_id = ?1, language_id = ?2, title = ?3, description = ?4, meta_title = ?5, meta_description = ?6, meta_keyword = ?7
#END
deleteInformation=DELETE FROM oc_information WHERE information_id = ?1
#END
editInformation3=DELETE FROM oc_information_to_store WHERE information_id = ?1
#END
editInformation4=INSERT INTO oc_information_to_store SET information_id = ?1, store_id = ?2
#END
editInformation5=DELETE FROM oc_information_to_layout WHERE information_id = ?1
#END
addInformation3=INSERT INTO oc_information_to_layout SET information_id = ?1, store_id = ?2, layout_id = ?3
#END
addInformation4=INSERT INTO oc_url_alias SET query = 'information_id=?1, keyword = ?2
#END
editInformation=UPDATE oc_information SET sort_order = ?1, bottom = ?2, status = ?3 WHERE information_id = ?4
#END
editInformation1=DELETE FROM oc_information_description WHERE information_id = ?1
#END
addInformation1=INSERT INTO oc_information_description SET information_id = ?1, language_id = ?2, title = ?3, description = ?4, meta_title = ?5, meta_description = ?6, meta_keyword = ?7
#END
addInformation2=INSERT INTO oc_information_to_store SET information_id = ?1, store_id = ?2
#END
