getCurrencies=SELECT * FROM oc_currency ORDER BY title ASC
#END
getCurrencyByCode=SELECT DISTINCT * FROM oc_currency WHERE code = ?1
#END
