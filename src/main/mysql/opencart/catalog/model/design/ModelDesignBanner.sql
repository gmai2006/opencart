ModelDesignBanner.getBanner.getBanner=SELECT b.banner_id, b.name, b.status, bi.banner_image_id, bi.banner_id as banner_id0, bi.language_id, bi.title, bi.link, bi.image, bi.sort_order FROM oc_banner b LEFT JOIN oc_banner_image bi ON( b.banner_id = bi.banner_id ) WHERE b.banner_id = 'param0' AND b.status = '1' AND bi.language_id = 'param1' ORDER BY bi.sort_order ASC 
#END
