ModelExtensionTotalVoucherTheme.getVoucherTheme.getVoucherTheme=SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vt.voucher_theme_id = 'param0' AND vtd.language_id = 'param1'  
#END
ModelExtensionTotalVoucherTheme.getVoucherThemes.getVoucherThemes=SELECT vt.voucher_theme_id, vt.image, vtd.voucher_theme_id as voucher_theme_id0, vtd.language_id, vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id = vtd.voucher_theme_id ) WHERE vtd.language_id = 'param0' ORDER BY vtd.name 
#END
