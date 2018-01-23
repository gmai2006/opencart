ModelDesignLayout.getLayout.getLayout=SELECT * FROM oc_layout_route WHERE 'param0' LIKE route AND store_id = 'param1' ORDER BY route DESC LIMIT 1
#END
ModelDesignLayout.getLayoutModules.getLayoutModules=SELECT * FROM oc_layout_module WHERE layout_id = 'param0' AND position = 'param1' ORDER BY sort_order
#END
