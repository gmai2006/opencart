getLayoutModules=SELECT * FROM oc_layout_module WHERE layout_id = ?1 AND position = ?2 ORDER BY sort_order
#END
getLayout=SELECT * FROM oc_layout_route WHERE ?1 LIKE route AND store_id = ?2 ORDER BY route DESC LIMIT 1
#END
