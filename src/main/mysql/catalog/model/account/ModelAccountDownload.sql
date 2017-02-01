getTotalDownloads=SELECT COUNT(*) AS total FROM  oc_order  o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) WHERE o.customer_id = ?1 AND (?2)
#END
getDownload=SELECT d.filename, d.mask FROM  oc_order  o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN oc_download d ON (p2d.download_id = d.download_id) WHERE o.customer_id = ?1 AND (?2) AND d.download_id = ?3
#END
getDownloads=SELECT DISTINCT d.download_id, o.order_id, o.date_added, dd.name, d.filename FROM  oc_order  o LEFT JOIN oc_order_product op ON (o.order_id = op.order_id) LEFT JOIN oc_product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN oc_download d ON (p2d.download_id = d.download_id) LEFT JOIN oc_download_description dd ON (d.download_id = dd.download_id) WHERE o.customer_id = ?1 AND dd.language_id = ?2 AND (?3) ORDER BY o.date_added DESC LIMIT ?4,?5
#END
