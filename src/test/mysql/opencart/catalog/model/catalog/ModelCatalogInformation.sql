ModelCatalogInformation.getInformation.getInformation=SELECT  *   FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id )
#END
ModelCatalogInformation.getInformations.getInformations=SELECT  *   FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id = id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id = i2s.information_id )
#END
ModelCatalogInformation.getInformationLayoutId.getInformationLayoutId=SELECT  *   FROM oc_information_to_layout
#END
