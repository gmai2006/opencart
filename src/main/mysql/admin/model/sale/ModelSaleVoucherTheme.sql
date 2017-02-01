getVoucherThemes=SELECT * FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vtd.language_id = ?1 ORDER BY vtd.name
#END
editVoucherTheme1=DELETE FROM oc_voucher_theme_description WHERE voucher_theme_id = ?1
#END
editVoucherTheme2=INSERT INTO oc_voucher_theme_description SET voucher_theme_id = ?1, language_id = ?2, name = ?3
#END
deleteVoucherTheme=DELETE FROM oc_voucher_theme WHERE voucher_theme_id = ?1
#END
getTotalVoucherThemes=SELECT COUNT(*) AS total FROM oc_voucher_theme
#END
addVoucherTheme=INSERT INTO oc_voucher_theme SET image = ?1
#END
getVoucherThemeDescriptions=SELECT * FROM oc_voucher_theme_description WHERE voucher_theme_id = ?1
#END
addVoucherTheme1=INSERT INTO oc_voucher_theme_description SET voucher_theme_id = ?1, language_id = ?2, name = ?3
#END
editVoucherTheme=UPDATE oc_voucher_theme SET image = ?1 WHERE voucher_theme_id = ?2
#END
deleteVoucherTheme1=DELETE FROM oc_voucher_theme_description WHERE voucher_theme_id = ?1
#END
getVoucherTheme=SELECT * FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vt.voucher_theme_id = ?1 AND vtd.language_id = ?2
#END
