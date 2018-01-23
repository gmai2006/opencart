ModelCatalogInformation.getInformation.getInformation=SELECT i.information_id, i.bottom, i.sort_order, i.status, id.information_id as information_id0, id.language_id, id.title, id.description, id.meta_title, id.meta_description, id.meta_keyword, i2s.information_id as information_id01, i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id ) WHERE i.information_id = 'param0' AND id.language_id = 'param1' AND i2s.store_id = 'param2' AND i.status = '1'  
#END
ModelCatalogInformation.getInformations.getInformations=SELECT i.information_id, i.bottom, i.sort_order, i.status, id.information_id as information_id0, id.language_id, id.title, id.description, id.meta_title, id.meta_description, id.meta_keyword, i2s.information_id as information_id01, i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id ) WHERE id.language_id = 'param0' AND i2s.store_id = 'param1' AND i.status = '1' ORDER BY i.sort_order , LCASE( id.title ) ASC 
#END
ModelCatalogInformation.getInformationLayoutId.getInformationLayoutId=SELECT * FROM oc_information_to_layout WHERE information_id = 'param0' AND store_id = 'param1'
#END
