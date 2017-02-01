addWishlist1=$this->db->query("INSERT INTO ".DB_PREFIX."customer_wishlist SET customer_id = '".(int)$this->customer->getId()."', product_id = '".(int)$product_id."', date_added = NOW()")
#END
getTotalWishlist=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."customer_wishlist WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
deleteWishlist=$this->db->query("DELETE FROM ".DB_PREFIX."customer_wishlist WHERE customer_id = '".(int)$this->customer->getId()."' AND product_id = '".(int)$product_id."'")
#END
getWishlist=$this->db->query("SELECT * FROM ".DB_PREFIX."customer_wishlist WHERE customer_id = '".(int)$this->customer->getId()."'")
#END
addWishlist=$this->db->query("DELETE FROM ".DB_PREFIX."customer_wishlist WHERE customer_id = '".(int)$this->customer->getId()."' AND product_id = '".(int)$product_id."'")
#END
