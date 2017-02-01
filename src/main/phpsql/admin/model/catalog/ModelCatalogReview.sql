getTotalReviewsAwaitingApproval=$this->db->query("SELECT COUNT(*) AS total FROM ".DB_PREFIX."review WHERE status = '0'")
#END
editReview=$this->db->query("UPDATE ".DB_PREFIX."review SET author = '".$this->db->escape($data['author'])."', product_id = '".(int)$data['product_id']."', text = '".$this->db->escape(strip_tags($data['text']))."', rating = '".(int)$data['rating']."', status = '".(int)$data['status']."', date_added = '".$this->db->escape($data['date_added'])."', date_modified = NOW() WHERE review_id = '".(int)$review_id."'")
#END
getReview=$this->db->query("SELECT DISTINCT *, (SELECT pd.name FROM ".DB_PREFIX."product_description pd WHERE pd.product_id = r.product_id AND pd.language_id = '".(int)$this->config->get('config_language_id')."') AS product FROM ".DB_PREFIX."review r WHERE r.review_id = '".(int)$review_id."'")
#END
addReview=$this->db->query("INSERT INTO ".DB_PREFIX."review SET author = '".$this->db->escape($data['author'])."', product_id = '".(int)$data['product_id']."', text = '".$this->db->escape(strip_tags($data['text']))."', rating = '".(int)$data['rating']."', status = '".(int)$data['status']."', date_added = '".$this->db->escape($data['date_added'])."'")
#END
deleteReview=$this->db->query("DELETE FROM ".DB_PREFIX."review WHERE review_id = '".(int)$review_id."'")
#END
