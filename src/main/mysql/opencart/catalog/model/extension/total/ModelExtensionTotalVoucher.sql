ModelExtensionTotalVoucher.getVoucher.getVoucherQuery=SELECT *, vtd.name AS theme FROM oc_voucher v LEFT JOIN oc_voucher_theme vt ON (v.voucher_theme_id = vt.voucher_theme_id) LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE v.code = 'param0' AND vtd.language_id = 'param1' AND v.status = '1'
#END
ModelExtensionTotalVoucher.getVoucher.getOrderQuery=SELECT order_id FROM "oc_order" WHERE order_id = 'param0' AND order_status_id IN(param1)
#END
ModelExtensionTotalVoucher.getVoucher.getOrderVoucherQuery=SELECT order_voucher_id FROM "oc_order_voucher" WHERE order_id = 'param0' AND voucher_id = 'param1'
#END
ModelExtensionTotalVoucher.getVoucher.getVoucherHistoryQuery=SELECT SUM(amount) AS total FROM "oc_voucher_history" vh WHERE vh.voucher_id = 'param0' GROUP BY vh.voucher_id
#END
