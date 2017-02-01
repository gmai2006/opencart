getVoucherThemes=$this->db->query("SELECT * FROM ".DB_PREFIX."voucher_theme vt LEFT JOIN ".DB_PREFIX."voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vtd.language_id = '".(int)$this->config->get('config_language_id')."' ORDER BY vtd.name")
#END
getVoucherTheme=$this->db->query("SELECT * FROM ".DB_PREFIX."voucher_theme vt LEFT JOIN ".DB_PREFIX."voucher_theme_description vtd ON (vt.voucher_theme_id = vtd.voucher_theme_id) WHERE vt.voucher_theme_id = '".(int)$voucher_theme_id."' AND vtd.language_id = '".(int)$this->config->get('config_language_id')."'")
#END
