getVoucherThemes=SELECT * FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vtd.language_id = ?1 ORDER BY vtd.name
#END
getVoucherTheme=SELECT * FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vt.voucher_theme_id = ?1 AND vtd.language_id = ?2
#END
