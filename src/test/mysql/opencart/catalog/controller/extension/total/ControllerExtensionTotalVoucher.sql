ControllerExtensionTotalVoucher.send.send=SELECT  *   FROM "oc_voucher" v LEFT JOIN oc_voucher_theme vt ON( v.voucher_theme_id = vt.voucher_theme_id ) LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id )
#END
