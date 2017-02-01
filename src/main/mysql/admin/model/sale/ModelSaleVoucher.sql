deleteVoucher=DELETE FROM oc_voucher WHERE voucher_id = ?1
#END
editVoucher=UPDATE oc_voucher SET code = ?1, from_name = ?2, from_email = ?3, to_name = ?4, to_email = ?5, voucher_theme_id = ?6, message = ?7, amount = ?8, status = ?9 WHERE voucher_id = ?10
#END
deleteVoucher1=DELETE FROM oc_voucher_history WHERE voucher_id = ?1
#END
getVoucherByCode=SELECT DISTINCT * FROM oc_voucher WHERE code = ?1
#END
addVoucher=INSERT INTO oc_voucher SET code = ?1, from_name = ?2, from_email = ?3, to_name = ?4, to_email = ?5, voucher_theme_id = ?6, message = ?7, amount = ?8, status = ?9, date_added = NOW()
#END
getTotalVouchersByVoucherThemeId=SELECT COUNT(*) AS total FROM oc_voucher WHERE voucher_theme_id = ?1
#END
getVoucher=SELECT DISTINCT * FROM oc_voucher WHERE voucher_id = ?1
#END
getTotalVoucherHistories=SELECT COUNT(*) AS total FROM oc_voucher_history WHERE voucher_id = ?1
#END
getTotalVouchers=SELECT COUNT(*) AS total FROM oc_voucher
#END
getVoucherHistories=SELECT vh.order_id, CONCAT(o.firstname, ' ', o.lastname) AS customer, vh.amount, vh.date_added FROM oc_voucher_history vh LEFT JOIN  oc_order  o ON (vh.order_id = o.order_id) WHERE vh.voucher_id = ?1 ORDER BY vh.date_added ASC LIMIT ?2,?3
#END
