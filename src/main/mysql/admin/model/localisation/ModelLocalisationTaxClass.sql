editTaxClass=UPDATE oc_tax_class SET title = ?1, description = ?2, date_modified = NOW() WHERE tax_class_id = ?3
#END
addTaxClass=INSERT INTO oc_tax_class SET title = ?1, description = ?2, date_added = NOW()
#END
getTaxClass=SELECT * FROM oc_tax_class WHERE tax_class_id = ?1
#END
deleteTaxClass=DELETE FROM oc_tax_class WHERE tax_class_id = ?1
#END
getTotalTaxClasses=SELECT COUNT(*) AS total FROM oc_tax_class
#END
editTaxClass2=INSERT INTO oc_tax_rule SET tax_class_id = ?1, tax_rate_id = ?2, based = ?3, priority = ?4
#END
getTotalTaxRulesByTaxRateId=SELECT COUNT(DISTINCT tax_class_id) AS total FROM oc_tax_rule WHERE tax_rate_id = ?1
#END
editTaxClass1=DELETE FROM oc_tax_rule WHERE tax_class_id = ?1
#END
getTaxRules=SELECT * FROM oc_tax_rule WHERE tax_class_id = ?1
#END
deleteTaxClass1=DELETE FROM oc_tax_rule WHERE tax_class_id = ?1
#END
getTaxClasses=SELECT * FROM oc_tax_class
#END
addTaxClass1=INSERT INTO oc_tax_rule SET tax_class_id = ?1, tax_rate_id = ?2, based = ?3, priority = ?4
#END
