ModelCatalogProduct.getProduct.getProduct=SELECT DISTINCT  *   FROM oc_product p LEFT JOIN oc_product_description pd ON( p.product_id = pd.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id ) LEFT JOIN oc_manufacturer m ON( p.manufacturer_id = m.manufacturer_id )
#END
ModelCatalogProduct.getLatestProducts.getLatestProducts=SELECT  *   FROM oc_product p LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id )
#END
ModelCatalogProduct.getPopularProducts.getPopularProducts=SELECT  *   FROM oc_product p LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id )
#END
ModelCatalogProduct.getBestSellerProducts.getBestSellerProducts=SELECT  *   FROM oc_order_product op LEFT JOIN "oc_order" o ON( op.order_id = o.order_id ) LEFT JOIN "oc_product" p ON( op.product_id = p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id )
#END
ModelCatalogProduct.getProductAttributes.getProductAttributeGroupQuery=SELECT  *   FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON( pa.attribute_id = a.attribute_id ) LEFT JOIN oc_attribute_group ag ON( a.attribute_group_id = ag.attribute_group_id ) LEFT JOIN oc_attribute_group_description agd ON( ag.attribute_group_id = agd.attribute_group_id )
#END
ModelCatalogProduct.getProductAttributes.getProductAttributeQuery=SELECT  *   FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON( pa.attribute_id = a.attribute_id ) LEFT JOIN oc_attribute_description ad ON( a.attribute_id = ad.attribute_id )
#END
ModelCatalogProduct.getProductOptions.getProductOptionQuery=SELECT  *   FROM oc_product_option po LEFT JOIN "oc_option" o ON( po.option_id = o.option_id ) LEFT JOIN oc_option_description od ON( o.option_id = od.option_id )
#END
ModelCatalogProduct.getProductOptions.getProductOptionValueQuery=SELECT  *   FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON( pov.option_value_id = ov.option_value_id ) LEFT JOIN oc_option_value_description ovd ON( ov.option_value_id = ovd.option_value_id )
#END
ModelCatalogProduct.getProductDiscounts.getProductDiscounts=SELECT  *   FROM oc_product_discount
#END
ModelCatalogProduct.getProductImages.getProductImages=SELECT  *   FROM oc_product_image
#END
ModelCatalogProduct.getProductRelated.getProductRelated=SELECT  *   FROM oc_product_related pr LEFT JOIN oc_product p ON( pr.related_id = p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id )
#END
ModelCatalogProduct.getProductLayoutId.getProductLayoutId=SELECT  *   FROM oc_product_to_layout
#END
ModelCatalogProduct.getCategories.getCategories=SELECT  *   FROM oc_product_to_category
#END
ModelCatalogProduct.getProfile.getProfile=SELECT  *   FROM oc_recurring r JOIN oc_product_recurring pr ON( pr.recurring_id = r.recurring_id AND  1 = 1 )
#END
ModelCatalogProduct.getProfiles.getProfiles=SELECT  *   FROM oc_product_recurring pr JOIN oc_recurring_description rd ON(  1 = 1 AND rd.recurring_id = pr.recurring_id ) JOIN oc_recurring r ON r.recurring_id = rd.recurring_id
#END
ModelCatalogProduct.getTotalProductSpecials.getTotalProductSpecials=SELECT  *   FROM oc_product_special ps LEFT JOIN oc_product p ON( ps.product_id = p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id = p2s.product_id )
#END
