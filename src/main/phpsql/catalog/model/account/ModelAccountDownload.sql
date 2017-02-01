getTotalDownloads=$this->db->query("SELECT COUNT(*) AS total FROM `".DB_PREFIX."order` o LEFT JOIN ".DB_PREFIX."order_product op ON (o.order_id = op.order_id) LEFT JOIN ".DB_PREFIX."product_to_download p2d ON (op.product_id = p2d.product_id) WHERE o.customer_id = '".(int)$this->customer->getId()."' AND (".implode(" OR ",$implode).")")
#END
getDownload=$this->db->query("SELECT d.filename, d.mask FROM `".DB_PREFIX."order` o LEFT JOIN ".DB_PREFIX."order_product op ON (o.order_id = op.order_id) LEFT JOIN ".DB_PREFIX."product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN ".DB_PREFIX."download d ON (p2d.download_id = d.download_id) WHERE o.customer_id = '".(int)$this->customer->getId()."' AND (".implode(" OR ",$implode).") AND d.download_id = '".(int)$download_id."'")
#END
getDownloads=$this->db->query("SELECT DISTINCT d.download_id, o.order_id, o.date_added, dd.name, d.filename FROM `".DB_PREFIX."order` o LEFT JOIN ".DB_PREFIX."order_product op ON (o.order_id = op.order_id) LEFT JOIN ".DB_PREFIX."product_to_download p2d ON (op.product_id = p2d.product_id) LEFT JOIN ".DB_PREFIX."download d ON (p2d.download_id = d.download_id) LEFT JOIN ".DB_PREFIX."download_description dd ON (d.download_id = dd.download_id) WHERE o.customer_id = '".(int)$this->customer->getId()."' AND dd.language_id = '".(int)$this->config->get('config_language_id')."' AND (".implode(" OR ",$implode).") ORDER BY o.date_added DESC LIMIT ".(int)$start.",".(int)$limit)
#END