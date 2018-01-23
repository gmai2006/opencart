ControllerExtensionTotalVoucher.send.send=SELECT *, vtd.name AS theme FROM "oc_voucher" v LEFT JOIN oc_voucher_theme vt ON (v.voucher_theme_id = vt.voucher_theme_id) LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE v.order_id = 'param0' AND vtd.language_id = 'param1'
#END
