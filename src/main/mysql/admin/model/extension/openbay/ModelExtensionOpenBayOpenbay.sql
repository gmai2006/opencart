faqDbTableCheck=CREATE TABLE IF NOT EXISTS  oc_openbay_faq (id int(11) NOT NULL AUTO_INCREMENT,route text NOT NULL, PRIMARY KEY (id)) ENGINE=MyISAM DEFAULT CHARSET=utf8;
#END
faqDismiss=INSERT INTO  oc_openbay_faq  SET  route  = ?1
#END
faqIsDismissed=SELECT * FROM  oc_openbay_faq  WHERE  route  = ?1
#END
faqClear=TRUNCATE  oc_openbay_faq
#END
