ModelExtensionOpenBayEbayProduct.importItems.importItems=SELECT * FROM "oc_category", "oc_category_description" WHERE "oc_category"."parent_id" = 'param0' AND "oc_category_description"."name" = 'param1' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.getOption.getOption=SELECT "o".option_id, "o".type, "o".sort_order, "od".option_id as option_id0, "od".language_id, "od".name FROM "oc_option" "o" LEFT JOIN "oc_option_description" "od" ON( "od"."option_id" = "o"."option_id" ) WHERE "od"."name" = 'param0'  LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.createOption.createOption=SELECT * FROM "oc_option" WHERE "option_id" = 'param0' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.getOptionValue.getOptionValue=SELECT ov.option_value_id, ov.option_id, ov.image, ov.sort_order, "ovd".option_value_id as option_value_id0, "ovd".language_id, "ovd".option_id as option_id0, "ovd".name FROM "oc_option_value" ov LEFT JOIN "oc_option_value_description" "ovd" ON( "ovd"."option_value_id" = "ov"."option_value_id" ) WHERE "ovd"."name" = 'param0' AND "ovd"."option_id" = 'param1'  LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.getProductOption.getProductOption=SELECT * FROM  oc_product_option WHERE product_id = 'param0' AND option_id = 'param1' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.getProductOptionValue.getProductOptionValue=SELECT * FROM  "oc_product_option_value" WHERE "product_id" = 'param0' AND "option_id" = 'param1' AND "product_option_id" = 'param2' AND "option_value_id" = 'param3' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry=SELECT * FROM  "oc_attribute_group_description" WHERE "name" = 'param0' AND "language_id" = 'param1' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry2=SELECT "sort_order" FROM  "oc_attribute_group" ORDER BY "sort_order" DESC LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry=SELECT * FROM "oc_attribute_description" "ad", "oc_attribute" "a" WHERE "ad"."name" = 'param0' AND "ad"."language_id" = 'param1' AND "a"."attribute_id" = "ad"."attribute_id" AND "a"."attribute_group_id" = 'param2' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry2=SELECT "sort_order" FROM  "oc_attribute" ORDER BY "sort_order" DESC LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.attributeAdd.attributeAdd=SELECT * FROM "oc_product_attribute" WHERE "product_id" = 'param0' AND "attribute_id" = 'param1' AND "language_id" = 'param2'
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry=SELECT * FROM  "oc_manufacturer" WHERE LCASE("name") = 'param0' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry2=SELECT "sort_order" FROM  "oc_manufacturer" ORDER BY "sort_order" DESC LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.weightClassExists.weightClassExists=SELECT "weight_class_id" FROM "oc_weight_class_description" WHERE LCASE("title") = 'param0' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.lengthClassExists.lengthClassExists=SELECT "length_class_id" FROM "oc_length_class_description" WHERE LCASE("title") = 'param0' LIMIT 1
#END
ModelExtensionOpenBayEbayProduct.repairCategories.repairCategories=SELECT * FROM "oc_category_path" WHERE category_id = 'param0' ORDER BY level ASC
#END
