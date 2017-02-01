confirm=INSERT INTO  oc_voucher_history  SET voucher_id = ?1, order_id = ?2, amount = ?3, date_added = NOW()
#END
addVoucher=INSERT INTO oc_voucher SET order_id = ?1, code = ?2, from_name = ?3, from_email = ?4, to_name = ?5, to_email = ?6, voucher_theme_id = ?7, message = ?8, amount = ?9, status = '1', date_added = NOW()
#END
getVoucher3=SELECT SUM(amount) AS total FROM  oc_voucher_history  vh WHERE vh.voucher_id = ?1 GROUP BY vh.voucher_id
#END
getVoucher2=SELECT order_voucher_id FROM  oc_order_voucher  WHERE order_id = ?1 AND voucher_id = ?2
#END
getVoucher1=SELECT order_id FROM  oc_order  WHERE order_id = ?1 AND order_status_id IN(?2)
#END
getVoucher=SELECT *, vtd.name AS theme FROM oc_voucher v LEFT JOIN oc_voucher_theme vt ON (v.voucher_theme_id = vt.voucher_theme_id) LEFT JOIN oc_voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE v.code = ?1 AND vtd.language_id = ?2 AND v.status = '1'
#END
disableVoucher=UPDATE oc_voucher SET status = '0' WHERE order_id = ?1
#END
unconfirm=DELETE FROM  oc_voucher_history  WHERE order_id = ?1
#END
