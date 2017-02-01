addBanner=$this->db->query("INSERT INTO ".DB_PREFIX."banner SET name = '".$this->db->escape($data['name'])."', status = '".(int)$data['status']."'")
#END
addBanner1=$this->db->query("INSERT INTO ".DB_PREFIX."banner_image SET banner_id = '".(int)$banner_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($banner_image['title'])."', link = '".$this->db->escape($banner_image['link'])."', image = '".$this->db->escape($banner_image['image'])."', sort_order = '".(int)$banner_image['sort_order']."'")
#END
getBannerImages=$this->db->query("SELECT * FROM ".DB_PREFIX."banner_image WHERE banner_id = '".(int)$banner_id."' ORDER BY sort_order ASC")
#END
deleteBanner=$this->db->query("DELETE FROM ".DB_PREFIX."banner WHERE banner_id = '".(int)$banner_id."'")
#END
editBanner=$this->db->query("UPDATE ".DB_PREFIX."banner SET name = '".$this->db->escape($data['name'])."', status = '".(int)$data['status']."' WHERE banner_id = '".(int)$banner_id."'")
#END
editBanner2=$this->db->query("INSERT INTO ".DB_PREFIX."banner_image SET banner_id = '".(int)$banner_id."', language_id = '".(int)$language_id."', title = '".$this->db->escape($banner_image['title'])."', link = '".$this->db->escape($banner_image['link'])."', image = '".$this->db->escape($banner_image['image'])."', sort_order = '".(int)$banner_image['sort_order']."'")
#END
getTotalBanners=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."banner")
#END
editBanner1=$this->db->query("DELETE FROM ".DB_PREFIX."banner_image WHERE banner_id = '".(int)$banner_id."'")
#END
getBanner=$this->db->query("SELECT DISTINCT * FROM ".DB_PREFIX."banner WHERE banner_id = '".(int)$banner_id."'")
#END
deleteBanner1=$this->db->query("DELETE FROM ".DB_PREFIX."banner_image WHERE banner_id = '".(int)$banner_id."'")
#END
