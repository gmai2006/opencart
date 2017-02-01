getVoucherThemes=$this->db->query("SELECT * FROM ".DB_PREFIX."voucher_theme vt LEFT JOIN ".DB_PREFIX."voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vtd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY vtd.name")
#END
editVoucherTheme1=$this->db->query("DELETE FROM ".DB_PREFIX."voucher_theme_description WHERE voucher_theme_id = '".(int)$voucher_theme_id."'")
#END
editVoucherTheme2=$this->db->query("INSERT INTO ".DB_PREFIX."voucher_theme_description SET voucher_theme_id = '".(int)$voucher_theme_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
deleteVoucherTheme=$this->db->query("DELETE FROM ".DB_PREFIX."voucher_theme WHERE voucher_theme_id = '".(int)$voucher_theme_id."'")
#END
getTotalVoucherThemes=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."voucher_theme")
#END
addVoucherTheme=$this->db->query("INSERT INTO ".DB_PREFIX."voucher_theme SET image = '".$this->db->escape($data['image'])."'")
#END
getVoucherThemeDescriptions=$this->db->query("SELECT * FROM ".DB_PREFIX."voucher_theme_description WHERE voucher_theme_id = '".(int)$voucher_theme_id."'")
#END
addVoucherTheme1=$this->db->query("INSERT INTO ".DB_PREFIX."voucher_theme_description SET voucher_theme_id = '".(int)$voucher_theme_id."', language_id = '".(int)$language_id."', name = '".$this->db->escape($value['name'])."'")
#END
editVoucherTheme=$this->db->query("UPDATE ".DB_PREFIX."voucher_theme SET image = '".$this->db->escape($data['image'])."' WHERE voucher_theme_id = '".(int)$voucher_theme_id."'")
#END
deleteVoucherTheme1=$this->db->query("DELETE FROM ".DB_PREFIX."voucher_theme_description WHERE voucher_theme_id = '".(int)$voucher_theme_id."'")
#END
getVoucherTheme=$this->db->query("SELECT * FROM ".DB_PREFIX."voucher_theme vt LEFT JOIN ".DB_PREFIX."voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vt.voucher_theme_id = '".(int)$voucher_theme_id."' AND vtd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
