deleteCurrency=DELETE FROM oc_currency WHERE currency_id = ?1
#END
getCurrency=SELECT DISTINCT * FROM oc_currency WHERE currency_id = ?1
#END
getCurrencies=SELECT * FROM oc_currency ORDER BY title ASC
#END
refresh3=UPDATE oc_currency SET value = '1.00000', date_modified = ?1 WHERE code = ?2
#END
refresh2=UPDATE oc_currency SET value = ?1, date_modified = ?2 WHERE code = ?3
#END
getCurrencyByCode=SELECT DISTINCT * FROM oc_currency WHERE code = ?1
#END
refresh=SELECT * FROM oc_currency WHERE code != ?1
#END
refresh1=SELECT * FROM oc_currency WHERE code != ?1 AND date_modified < ?2
#END
getTotalCurrencies=SELECT COUNT(*) AS total FROM oc_currency
#END
addCurrency=INSERT INTO oc_currency SET title = ?1, code = ?2, symbol_left = ?3, symbol_right = ?4, decimal_place = ?5, value = ?6, status = ?7, date_modified = NOW()
#END
editCurrency=UPDATE oc_currency SET title = ?1, code = ?2, symbol_left = ?3, symbol_right = ?4, decimal_place = ?5, value = ?6, status = ?7, date_modified = NOW() WHERE currency_id = ?8
#END
