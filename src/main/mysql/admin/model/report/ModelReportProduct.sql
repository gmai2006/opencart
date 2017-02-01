getTotalProductViews=SELECT SUM(viewed) AS total FROM oc_product
#END
reset=UPDATE oc_product SET viewed = '0'
#END
getTotalProductsViewed=SELECT COUNT(*) AS total FROM oc_product WHERE viewed > 0
#END
