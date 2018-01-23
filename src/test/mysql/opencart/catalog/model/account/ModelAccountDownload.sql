ModelAccountDownload.getDownload.getDownload=SELECT  *   FROM "oc_order" o LEFT JOIN oc_order_product op ON( o.order_id = op.order_id ) LEFT JOIN oc_product_to_download p2d ON( op.product_id = p2d.product_id ) LEFT JOIN oc_download d ON( p2d.download_id = d.download_id )
#END
ModelAccountDownload.getDownloads.getDownloads=SELECT DISTINCT  *   FROM "oc_order" o LEFT JOIN oc_order_product op ON( o.order_id = op.order_id ) LEFT JOIN oc_product_to_download p2d ON( op.product_id = p2d.product_id ) LEFT JOIN oc_download d ON( p2d.download_id = d.download_id ) LEFT JOIN oc_download_description dd ON( d.download_id = dd.download_id )
#END
ModelAccountDownload.getTotalDownloads.getTotalDownloads=SELECT  *   FROM "oc_order" o LEFT JOIN oc_order_product op ON( o.order_id = op.order_id ) LEFT JOIN oc_product_to_download p2d ON( op.product_id = p2d.product_id )
#END
