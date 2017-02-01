getInformations=SELECT * FROM oc_information i LEFT JOIN oc_information_description id ON (i.information_id = id.information_id) LEFT JOIN oc_information_to_store i2s ON (i.information_id = i2s.information_id) WHERE id.language_id = ?1 AND i2s.store_id = ?2 AND i.status = '1' ORDER BY i.sort_order, LCASE(id.title) ASC
#END
getInformation=SELECT DISTINCT * FROM oc_information i LEFT JOIN oc_information_description id ON (i.information_id = id.information_id) LEFT JOIN oc_information_to_store i2s ON (i.information_id = i2s.information_id) WHERE i.information_id = ?1 AND id.language_id = ?2 AND i2s.store_id = ?3 AND i.status = '1'
#END
getInformationLayoutId=SELECT * FROM oc_information_to_layout WHERE information_id = ?1 AND store_id = ?2
#END
