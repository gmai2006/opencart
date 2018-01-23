ModelExtensionTotalVoucher.getVoucher.getVoucherQuery=SELECT  *   FROM oc_voucher v LEFT JOIN oc_voucher_theme vt ON( v.voucher_theme_id = vt.voucher_theme_id ) LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id )
#END
ModelExtensionTotalVoucher.getVoucher.getOrderQuery=SELECT  *   FROM "oc_order"
#END
ModelExtensionTotalVoucher.getVoucher.getOrderVoucherQuery=SELECT  *   FROM "oc_order_voucher"
#END
ModelExtensionTotalVoucher.getVoucher.getVoucherHistoryQuery=SELECT  *   FROM "oc_voucher_history" vh
#END
