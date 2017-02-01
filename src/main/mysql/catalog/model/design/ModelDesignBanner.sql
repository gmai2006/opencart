getBanner=SELECT * FROM oc_banner b LEFT JOIN oc_banner_image bi ON (b.banner_id = bi.banner_id) WHERE b.banner_id = ?1 AND b.status = '1' AND bi.language_id = ?2 ORDER BY bi.sort_order ASC
#END
