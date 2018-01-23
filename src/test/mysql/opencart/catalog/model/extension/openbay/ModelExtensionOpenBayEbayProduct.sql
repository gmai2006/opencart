ModelExtensionOpenBayEbayProduct.importItems.importItems=SELECT  *   FROM "oc_category" , "oc_category_description"
#END
ModelExtensionOpenBayEbayProduct.getOption.getOption=SELECT  *   FROM "oc_option" "o" LEFT JOIN "oc_option_description" "od" ON( "od"."option_id" = "o"."option_id" )
#END
ModelExtensionOpenBayEbayProduct.createOption.createOption=SELECT  *   FROM "oc_option"
#END
ModelExtensionOpenBayEbayProduct.getOptionValue.getOptionValue=SELECT  *   FROM "oc_option_value" ov LEFT JOIN "oc_option_value_description" "ovd" ON( "ovd"."option_value_id" = "ov"."option_value_id" )
#END
ModelExtensionOpenBayEbayProduct.getProductOption.getProductOption=SELECT  *   FROM oc_product_option
#END
ModelExtensionOpenBayEbayProduct.getProductOptionValue.getProductOptionValue=SELECT  *   FROM "oc_product_option_value"
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry=SELECT  *   FROM "oc_attribute_group_description"
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry2=SELECT  *   FROM "oc_attribute_group"
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry=SELECT  *   FROM "oc_attribute_description" "ad" , "oc_attribute" "a"
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry2=SELECT  *   FROM "oc_attribute"
#END
ModelExtensionOpenBayEbayProduct.attributeAdd.attributeAdd=SELECT  *   FROM "oc_product_attribute"
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry=SELECT  *   FROM "oc_manufacturer"
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry2=SELECT  *   FROM "oc_manufacturer"
#END
ModelExtensionOpenBayEbayProduct.weightClassExists.weightClassExists=SELECT  *   FROM "oc_weight_class_description"
#END
ModelExtensionOpenBayEbayProduct.lengthClassExists.lengthClassExists=SELECT  *   FROM "oc_length_class_description"
#END
ModelExtensionOpenBayEbayProduct.repairCategories.repairCategories=SELECT  *   FROM "oc_category_path"
#END
