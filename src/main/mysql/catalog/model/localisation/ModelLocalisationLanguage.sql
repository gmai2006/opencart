getLanguage=SELECT * FROM oc_language WHERE language_id = ?1
#END
getLanguages=SELECT * FROM oc_language WHERE status = '1' ORDER BY sort_order, name
#END
