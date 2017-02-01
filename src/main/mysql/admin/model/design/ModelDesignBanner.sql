addBanner=INSERT INTO oc_banner SET name = ?1, status = ?2
#END
addBanner1=INSERT INTO oc_banner_image SET banner_id = ?1, language_id = ?2, title = ?3, link = ?4, image = ?5, sort_order = ?6
#END
getBannerImages=SELECT * FROM oc_banner_image WHERE banner_id = ?1 ORDER BY sort_order ASC
#END
deleteBanner=DELETE FROM oc_banner WHERE banner_id = ?1
#END
editBanner=UPDATE oc_banner SET name = ?1, status = ?2 WHERE banner_id = ?3
#END
editBanner2=INSERT INTO oc_banner_image SET banner_id = ?1, language_id = ?2, title = ?3, link = ?4, image = ?5, sort_order = ?6
#END
getTotalBanners=SELECT COUNT(*) AS total FROM oc_banner
#END
editBanner1=DELETE FROM oc_banner_image WHERE banner_id = ?1
#END
getBanner=SELECT DISTINCT * FROM oc_banner WHERE banner_id = ?1
#END
deleteBanner1=DELETE FROM oc_banner_image WHERE banner_id = ?1
#END
