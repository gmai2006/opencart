ModelCheckoutMarketing.getMarketingByCode.getMarketingByCode=SELECT * FROM oc_marketing WHERE code = :code
#END
ModelCheckoutOrder.addOrderHistory.getOrderVoucherQuery=SELECT * FROM oc_order_voucher WHERE order_id = :order_id
#END
ModelCheckoutOrder.addOrderHistory.getOptionQuery=SELECT * FROM oc_order_option WHERE order_id = :order_id AND order_product_id = :order_product_id
#END
ModelCheckoutOrder.addOrderHistory.getProductQuery=SELECT * FROM oc_order_product WHERE order_id = :order_id
#END
ModelCheckoutOrder.addOrderHistory.getOrderProductQuery=SELECT * FROM oc_order_product WHERE order_id = :order_id
#END
ModelCheckoutOrder.getOrder.getOrderQuery=SELECT * ,( SELECT os.name FROM `oc_order_status` os WHERE os.order_status_id =o.order_status_id AND os.language_id =o.language_id ) AS order_status FROM `oc_order` o WHERE o.order_id = :order_id
#END
ModelCheckoutOrder.addOrderHistory.getOrderTotalQuery=SELECT * FROM `oc_order_total` WHERE order_id = :order_id ORDER BY sort_order ASC
#END
ModelCheckoutOrder.addOrderHistory.getProductDownloadQuery=SELECT COUNT( * ) AS total FROM `oc_product_to_download` WHERE product_id = :product_id
#END
ModelCheckoutOrder.getOrder.getCountryQuery=SELECT * FROM `oc_country` WHERE country_id = :country_id
#END
ModelCheckoutOrder.getOrder.getZoneQuery=SELECT * FROM `oc_zone` WHERE zone_id = :zone_id
#END
ModelCheckoutOrder.addOrderHistory.getOrderOptionQuery=SELECT * FROM oc_order_option WHERE order_id = :order_id AND order_product_id = :order_product_id
#END
ModelCheckoutOrder.addOrderHistory.getOrderStatusQuery=SELECT * FROM oc_order_status WHERE order_status_id = :order_status_id AND language_id = :language_id
#END
ModelDesignTheme.getTheme.getTheme=SELECT * FROM oc_theme WHERE store_id = :store_id AND theme = :theme AND route = :route
#END
ModelDesignLayout.getLayout.getLayout=SELECT * FROM oc_layout_route WHERE 'param0' LIKE route AND store_id = :store_id ORDER BY route DESC
#END
ModelDesignLayout.getLayoutModules.getLayoutModules=SELECT * FROM oc_layout_module WHERE layout_id = :layout_id AND position = :position ORDER BY sort_order
#END
ModelDesignBanner.getBanner.getBanner=SELECT b.banner_id , b.name , b.status , bi.banner_image_id , bi.banner_id as banner_id0 , bi.language_id , bi.title , bi.link , bi.image , bi.sort_order FROM oc_banner b LEFT JOIN oc_banner_image bi ON( b.banner_id =bi.banner_id ) WHERE b.banner_id = :banner_id AND b.status ='1' AND bi.language_id = :language_id ORDER BY bi.sort_order ASC
#END
ModelDesignTranslation.getTranslations.getTranslations=SELECT * FROM oc_translation WHERE store_id = :store_id AND language_id = :language_id AND route = :route
#END
ModelExtensionExtension.getExtensions.getExtensions=SELECT * FROM oc_extension WHERE `type` = :type
#END
ModelExtensionOpenBayAmazonProduct.setSubmitError.setSubmitError=SELECT `sku` FROM `oc_amazon_product` WHERE `insertion_id` = :insertion_id
#END
ModelExtensionOpenBayAmazonProduct.linkProduct.linkProduct=SELECT COUNT( * ) as 'count' FROM `oc_amazon_product_link` WHERE `product_id` = :product_id AND `amazon_sku` = :amazon_sku AND `var` = :var
#END
ModelExtensionOpenBayAmazonProduct.linkItems.linkItems=SELECT `var` FROM `oc_amazon_product` WHERE `sku` = :sku AND `product_id` = :product_id
#END
ModelExtensionOpenBayEbayOpenbay.updateOrderWithConfirmedData.updateOrderWithConfirmedData=SELECT * FROM `oc_country` WHERE `iso_code_2` = :iso_code_2
#END
ModelExtensionOpenBayAmazonusProduct.setSubmitError.setSubmitError=SELECT `sku` FROM `oc_amazonus_product` WHERE `insertion_id` = :insertion_id
#END
ModelExtensionOpenBayAmazonusProduct.linkItems.linkItems=SELECT `var` FROM `oc_amazonus_product` WHERE `sku` = :sku AND `product_id` = :product_id
#END
ModelExtensionOpenBayAmazonusProduct.linkProduct.linkProduct=SELECT COUNT( * ) as 'count' FROM `oc_amazonus_product_link` WHERE `product_id` = :product_id AND `amazonus_sku` = :amazonus_sku AND `var` = :var
#END
ModelExtensionOpenBayAmazonOrder.getAmazonOrderId.getAmazonOrderId=SELECT `amazon_order_id` FROM `oc_amazon_order` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayAmazonOrder.getProductId.getProductId=SELECT `product_id` FROM `oc_amazon_product_link` WHERE `amazon_sku` = :amazon_sku
#END
ModelExtensionOpenBayAmazonOrder.getProductOptionsByVar.getProductOptionsByVar=SELECT pov.product_option_id , pov.product_option_value_id , od.name , ovd.name as value , opt.type FROM `oc_product_option_value` as pov , `oc_product_option` as po , `oc_option` as opt , `oc_option_value_description` as ovd , `oc_option_description` as od WHERE pov.product_option_value_id = :product_option_value_id AND po.product_option_id =pov.product_option_id AND opt.option_id =pov.option_id AND ovd.option_value_id =pov.option_value_id AND ovd.language_id = :language_id AND od.option_id =pov.option_id AND od.language_id = :language_id
#END
ModelExtensionOpenBayAmazonOrder.getZoneId.getZoneId=SELECT `zone_id` FROM `oc_zone` WHERE LOWER( `name` ) = :name
#END
ModelExtensionOpenBayAmazonOrder.addAmazonOrderProducts.addAmazonOrderProducts=SELECT `order_product_id` FROM `oc_order_product` WHERE `model` = :model AND `order_id` = :order_id
#END
ModelExtensionOpenBayAmazonOrder.getCountryId.getCountryId=SELECT `country_id` FROM `oc_country` WHERE LOWER( `iso_code_2` ) = :iso_code_2
#END
ModelExtensionOpenBayAmazonOrder.getOrderStatus.getOrderStatus=SELECT `order_status_id` FROM `oc_order` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayAmazonOrder.getProductVar.getProductVar=SELECT `var` FROM `oc_amazon_product_link` WHERE `amazon_sku` = :amazon_sku
#END
ModelExtensionOpenBayAmazonOrder.getOrderId.getOrderId=SELECT `order_id` FROM `oc_amazon_order` WHERE `amazon_order_id` = :amazon_order_id
#END
ModelExtensionOpenBayAmazonOrder.getCountryName.getCountryName=SELECT `name` FROM `oc_country` WHERE LOWER( `iso_code_2` ) = :iso_code_2
#END
ModelExtensionOpenBayAmazonusOrder.getZoneId.getZoneId=SELECT `zone_id` FROM `oc_zone` WHERE LOWER( `name` ) = :name
#END
ModelExtensionOpenBayAmazonusOrder.getAmazonusOrderId.getAmazonusOrderId=SELECT `amazonus_order_id` FROM `oc_amazonus_order` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayAmazonusOrder.getProductId.getProductId=SELECT `product_id` FROM `oc_amazonus_product_link` WHERE `amazonus_sku` = :amazonus_sku
#END
ModelExtensionOpenBayAmazonusOrder.getProductOptionsByVar.getProductOptionsByVar=SELECT pov.product_option_id , pov.product_option_value_id , od.name , ovd.name as value , opt.type FROM `oc_product_option_value` as pov , `oc_product_option` as po , `oc_option` as opt , `oc_option_value_description` as ovd , `oc_option_description` as od WHERE pov.product_option_value_id = :product_option_value_id AND po.product_option_id =pov.product_option_id AND opt.option_id =pov.option_id AND ovd.option_value_id =pov.option_value_id AND ovd.language_id = :language_id AND od.option_id =pov.option_id AND od.language_id = :language_id
#END
ModelExtensionOpenBayAmazonusOrder.getProductVar.getProductVar=SELECT `var` FROM `oc_amazonus_product_link` WHERE `amazonus_sku` = :amazonus_sku
#END
ModelExtensionOpenBayAmazonusOrder.getCountryId.getCountryId=SELECT `country_id` FROM `oc_country` WHERE LOWER( `iso_code_2` ) = :iso_code_2
#END
ModelExtensionOpenBayAmazonusOrder.getOrderId.getOrderId=SELECT `order_id` FROM `oc_amazonus_order` WHERE `amazonus_order_id` = :amazonus_order_id
#END
ModelExtensionOpenBayAmazonusOrder.addAmazonusOrderProducts.addAmazonusOrderProducts=SELECT `order_product_id` FROM `oc_order_product` WHERE `model` = :model AND `order_id` = :order_id
#END
ModelExtensionOpenBayAmazonusOrder.getOrderStatus.getOrderStatus=SELECT `order_status_id` FROM `oc_order` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayAmazonusOrder.getCountryName.getCountryName=SELECT `name` FROM `oc_country` WHERE LOWER( `iso_code_2` ) = :iso_code_2
#END
ModelExtensionOpenBayEbayProduct.lengthClassExists.lengthClassExists=SELECT `length_class_id` FROM `oc_length_class_description` WHERE LCASE( `title` ) = :title
#END
ModelExtensionOpenBayEbayProduct.getProductOption.getProductOption=SELECT * FROM oc_product_option WHERE product_id = :product_id AND option_id = :option_id
#END
ModelExtensionOpenBayEbayProduct.getOption.getOption=SELECT `o`.option_id , `o`.type , `o`.sort_order , `od`.option_id as option_id0 , `od`.language_id , `od`.name FROM `oc_option` `o` LEFT JOIN `oc_option_description` `od` ON( `od`.`option_id` =`o`.`option_id` ) WHERE `od`.`name` = :name
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry=SELECT * FROM `oc_attribute_group_description` WHERE `name` = :name AND `language_id` = :language_id
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry=SELECT * FROM `oc_attribute_description` `ad` , `oc_attribute` `a` WHERE `ad`.`name` = :name AND `ad`.`language_id` = :language_id AND `a`.`attribute_id` =`ad`.`attribute_id` AND `a`.`attribute_group_id` = :attribute_group_id
#END
ModelExtensionOpenBayEbayProduct.getProductOptionValue.getProductOptionValue=SELECT * FROM `oc_product_option_value` WHERE `product_id` = :product_id AND `option_id` = :option_id AND `product_option_id` = :product_option_id AND `option_value_id` = :option_value_id
#END
ModelExtensionOpenBayEbayProduct.attributeAdd.attributeAdd=SELECT * FROM `oc_product_attribute` WHERE `product_id` = :product_id AND `attribute_id` = :attribute_id AND `language_id` = :language_id
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry=SELECT * FROM `oc_manufacturer` WHERE LCASE( `name` ) = :name
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry2=SELECT `sort_order` FROM `oc_manufacturer` ORDER BY `sort_order` DESC
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry2=SELECT `sort_order` FROM `oc_attribute` ORDER BY `sort_order` DESC
#END
ModelExtensionOpenBayEbayProduct.repairCategories.repairCategories=SELECT * FROM `oc_category_path` WHERE category_id = :category_id ORDER BY level ASC
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry2=SELECT `sort_order` FROM `oc_attribute_group` ORDER BY `sort_order` DESC
#END
ModelExtensionOpenBayEbayProduct.weightClassExists.weightClassExists=SELECT `weight_class_id` FROM `oc_weight_class_description` WHERE LCASE( `title` ) = :title
#END
ModelExtensionOpenBayEbayProduct.importItems.importItems=SELECT * FROM `oc_category` , `oc_category_description` WHERE `oc_category`.`parent_id` = :parent_id AND `oc_category_description`.`name` = :name
#END
ModelExtensionOpenBayEbayProduct.createOption.createOption=SELECT * FROM `oc_option` WHERE `option_id` = :option_id
#END
ModelExtensionOpenBayEbayProduct.getOptionValue.getOptionValue=SELECT ov.option_value_id , ov.option_id , ov.image , ov.sort_order , `ovd`.option_value_id as option_value_id0 , `ovd`.language_id , `ovd`.option_id as option_id0 , `ovd`.name FROM `oc_option_value` ov LEFT JOIN `oc_option_value_description` `ovd` ON( `ovd`.`option_value_id` =`ov`.`option_value_id` ) WHERE `ovd`.`name` = :name AND `ovd`.`option_id` = :option_id
#END
ModelExtensionOpenBayEtsyOrder.lockExists.lockExists=SELECT * FROM `oc_etsy_order_lock` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayEtsyOrder.create.create=SELECT * FROM `oc_country` WHERE `iso_code_2` = :iso_code_2
#END
ModelExtensionOpenBayEbayOrder.hasAddress.hasAddress=SELECT * FROM `oc_order` WHERE `order_id` = :order_id AND `payment_firstname` !='' AND `payment_address_1` !='' AND `payment_country` !=''
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderStatusQuery=SELECT * FROM `oc_order_status` WHERE `order_status_id` = :order_status_id AND `language_id` = :language_id
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderTotalQuery=SELECT * FROM `oc_order_total` WHERE `order_id` = :order_id ORDER BY `sort_order` ASC
#END
ModelExtensionOpenBayEbayOrder.addOrderHistory.addOrderHistory=SELECT * FROM `oc_product` WHERE `product_id` = :product_id
#END
ModelExtensionOpenBayEbayOrder.lockExists.lockExists=SELECT * FROM `oc_ebay_order_lock` WHERE `smp_id` = :smp_id
#END
ModelExtensionOpenBayEbayOrder.getHistory.getHistory=SELECT `order_status_id` FROM `oc_order_history` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayEbayOrder.getCountryAddressFormat.getCountryAddressFormat=SELECT * FROM `oc_country` WHERE `iso_code_2` = :iso_code_2
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderProductQuery=SELECT * FROM `oc_order_product` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderOptionQuery=SELECT * FROM oc_order_option WHERE order_id = :order_id AND order_product_id = :order_product_id
#END
ModelExtensionOpenBayEbayOrder.getOrderLine.getOrderLine=SELECT * FROM `oc_ebay_transaction` WHERE `txn_id` = :txn_id AND `item_id` = :item_id
#END
ModelExtensionOpenBayEbayOrder.getOrderLines.getOrderLines=SELECT * FROM `oc_ebay_transaction` WHERE `order_id` = :order_id
#END
ModelExtensionOpenBayEbayOrder.update.update=SELECT * FROM oc_order_status WHERE order_status_id = :order_status_id AND language_id = :language_id
#END
ModelExtensionFeedGoogleBase.getTotalCategories.getTotalCategories=SELECT COUNT( * ) AS total FROM `oc_google_base_category_to_category`
#END
ModelExtensionFeedGoogleBase.getCategories.getCategories=SELECT google_base_category_id ,( SELECT name FROM `oc_google_base_category` gbc WHERE gbc.google_base_category_id =gbc2c.google_base_category_id ) AS google_base_category , category_id ,( SELECT name FROM `oc_category_description` cd WHERE cd.category_id =gbc2c.category_id AND cd.language_id = :language_id ) AS category FROM `oc_google_base_category_to_category` gbc2c ORDER BY google_base_category ASC
#END
ModelExtensionPaymentCOD.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentPayMate.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentG2APay.getG2aOrder.getG2aOrder=SELECT * FROM `oc_g2apay_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentG2APay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentPerpetualPayments.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentBankTransfer.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentAuthorizeNetAim.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentNOCHEX.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSecureTradingWs.getOrder.getOrder=SELECT * FROM `oc_securetrading_ws_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentSecureTradingWs.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSecureTradingWs.getOrderId.getOrderId=SELECT order_id FROM oc_securetrading_ws_order WHERE md = :md
#END
ModelExtensionPaymentSagePayUS.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentRealexRemote.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentWorldpay.getProfile.getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = :order_recurring_id
#END
ModelExtensionPaymentWorldpay.getWorldpayOrder.getWorldpayOrder=SELECT * FROM oc_worldpay_order WHERE order_code = :order_code
#END
ModelExtensionPaymentWorldpay.getCards.getCards=SELECT * FROM oc_worldpay_card WHERE customer_id = :customer_id
#END
ModelExtensionPaymentWorldpay.getOrder.getOrder=SELECT * FROM `oc_worldpay_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentWorldpay.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_worldpay_order_recurring WHERE order_recurring_id = :order_recurring_id
#END
ModelExtensionPaymentWorldpay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentWorldpay.getTransactions.getTransactions=SELECT * FROM `oc_worldpay_order_transaction` WHERE `worldpay_order_id` = :worldpay_order_id
#END
ModelExtensionPaymentFirstdataRemote.getStoredCards.getStoredCards=SELECT * FROM oc_firstdata_remote_card WHERE customer_id = :customer_id
#END
ModelExtensionPaymentFirstdataRemote.getMethod.getMethod=SELECT * FROM `oc_zone_to_geo_zone` WHERE `geo_zone_id` = :geo_zone_id AND `country_id` = :country_id AND( `zone_id` = :zone_id OR `zone_id` ='0' )
#END
ModelExtensionPaymentBluePayRedirect.getMethod.getMethod=SELECT * FROM `oc_zone_to_geo_zone` WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentBluePayRedirect.getCards.getCards=SELECT * FROM `oc_bluepay_redirect_card` WHERE customer_id = :customer_id
#END
ModelExtensionPaymentBluePayRedirect.getOrder.getOrder=SELECT * FROM `oc_bluepay_redirect_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentBluePayRedirect.getTransactions.getTransactions=SELECT * FROM `oc_bluepay_redirect_order_transaction` WHERE `bluepay_redirect_order_id` = :bluepay_redirect_order_id
#END
ModelExtensionPaymentPayza.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentPayPoint.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentEway.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentEway.checkToken.checkToken=SELECT * FROM oc_eway_card WHERE token_id = :token_id
#END
ModelExtensionPaymentEway.getCards.getCards=SELECT * FROM oc_eway_card WHERE customer_id = :customer_id
#END
ModelExtensionPaymentPPPayflowIframe.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentPPPayflowIframe.getOrderId.getOrderId=SELECT `order_id` FROM `oc_paypal_payflow_iframe_order` WHERE `secure_token_id` = :secure_token_id
#END
ModelExtensionPaymentPPExpress.getTransactionRow.getTransactionRow=SELECT * FROM `oc_paypal_order_transaction` `pt` LEFT JOIN `oc_paypal_order` `po` ON `pt`.`paypal_order_id` =`po`.`paypal_order_id` WHERE `pt`.`transaction_id` = :transaction_id
#END
ModelExtensionPaymentPPExpress.getTotalRefunded.getTotalRefunded=SELECT SUM( `amount` ) AS `amount` FROM `oc_paypal_order_transaction` WHERE `paypal_order_id` = :paypal_order_id AND `payment_status` ='Refunded'
#END
ModelExtensionPaymentPPExpress.getMethod.getMethod=SELECT * FROM `oc_zone_to_geo_zone` WHERE `geo_zone_id` = :geo_zone_id AND `country_id` = :country_id AND( `zone_id` = :zone_id OR `zone_id` ='0' )
#END
ModelExtensionPaymentPPExpress.getTotalCaptured.getTotalCaptured=SELECT SUM( `amount` ) AS `amount` FROM `oc_paypal_order_transaction` WHERE `paypal_order_id` = :paypal_order_id AND `pending_reason` !='authorization' AND `pending_reason` !='paymentreview' AND( `payment_status` ='Partially-Refunded' OR `payment_status` ='Completed' OR `payment_status` ='Pending' ) AND `transaction_entity` ='payment'
#END
ModelExtensionPaymentGlobalpay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode2.getCountryByIsoCode2=SELECT * FROM oc_country WHERE `iso_code_2` = :iso_code_2 AND `status` ='1'
#END
ModelExtensionPaymentKlarnaCheckout.getZoneByCode.getZoneByCode=SELECT * FROM oc_zone WHERE `code` = :code AND `country_id` = :country_id AND `status` ='1'
#END
ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode3.getCountryByIsoCode3=SELECT * FROM oc_country WHERE `iso_code_3` = :iso_code_3 AND `status` ='1'
#END
ModelExtensionPaymentBluePayHosted.getMethod.getMethod=SELECT * FROM `oc_zone_to_geo_zone` WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentLiqPay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentCheque.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentWebPaymentSoftware.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentRealex.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentAuthorizeNetSim.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentCardConnect.getMethod.getMethod=SELECT * FROM `oc_zone_to_geo_zone` WHERE `geo_zone_id` = :geo_zone_id AND `country_id` = :country_id AND( `zone_id` = :zone_id OR `zone_id` ='0' )
#END
ModelExtensionPaymentCardConnect.getCards.getCards=SELECT * FROM `oc_cardconnect_card` WHERE `customer_id` = :customer_id
#END
ModelExtensionPaymentCardConnect.getCard.getCard=SELECT * FROM `oc_cardconnect_card` WHERE `token` = :token AND `customer_id` = :customer_id
#END
ModelExtensionPaymentTwoCheckout.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentPPPayflow.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentPPStandard.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSagePayDirect.getCard.getCard=SELECT * FROM oc_sagepay_direct_card WHERE( card_id = :card_id OR token = :token ) AND customer_id = :customer_id
#END
ModelExtensionPaymentSagePayDirect.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSagePayDirect.getOrder.getOrder=SELECT * FROM `oc_sagepay_direct_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentSagePayDirect.getTransactions.getTransactions=SELECT * FROM `oc_sagepay_direct_order_transaction` WHERE `sagepay_direct_order_id` = :sagepay_direct_order_id
#END
ModelExtensionPaymentSagePayDirect.getProfile.getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = :order_recurring_id
#END
ModelExtensionPaymentSagePayDirect.getCards.getCards=SELECT * FROM oc_sagepay_direct_card WHERE customer_id = :customer_id ORDER BY card_id
#END
ModelExtensionPaymentSagePayDirect.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_sagepay_direct_order_recurring WHERE order_recurring_id = :order_recurring_id
#END
ModelExtensionPaymentPilibaba.getOrderTaxAmount.getOrderTaxAmount=SELECT SUM( `value` ) AS `value` FROM `oc_order_total` WHERE `order_id` = :order_id AND `code` ='tax'
#END
ModelExtensionPaymentFirstdata.getOrder.getOrder=SELECT * FROM `oc_firstdata_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentFirstdata.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentFirstdata.getStoredCards.getStoredCards=SELECT * FROM `oc_firstdata_card` WHERE `customer_id` = :customer_id
#END
ModelExtensionPaymentFirstdata.storeCard.storeCard=SELECT * FROM `oc_firstdata_card` WHERE `token` = :token AND `customer_id` = :customer_id
#END
ModelExtensionPaymentLaybuy.getMethod.getQuery=SELECT * FROM `oc_zone_to_geo_zone` WHERE `geo_zone_id` = :geo_zone_id AND `country_id` = :country_id AND( `zone_id` = :zone_id OR `zone_id` ='0' )
#END
ModelExtensionPaymentLaybuy.getMethod.getProduct=SELECT GROUP_CONCAT( `category_id` ) as `categories` FROM `oc_product_to_category` WHERE `product_id` = :product_id
#END
ModelExtensionPaymentLaybuy.getPayPalProfileIds.getPayPalProfileIds=SELECT `paypal_profile_id` FROM `oc_laybuy_transaction` WHERE `status` ='1'
#END
ModelExtensionPaymentLaybuy.getRevisedTransaction.getRevisedTransaction=SELECT * FROM `oc_laybuy_revise_request` WHERE `laybuy_revise_request_id` = :laybuy_revise_request_id
#END
ModelExtensionPaymentLaybuy.getTransactionByLayBuyRefId.getTransactionByLayBuyRefId=SELECT * FROM `oc_laybuy_transaction` WHERE `laybuy_ref_no` = :laybuy_ref_no
#END
ModelExtensionPaymentLaybuy.getTransaction.getTransaction=SELECT * FROM `oc_laybuy_transaction` WHERE `laybuy_transaction_id` = :laybuy_transaction_id
#END
ModelExtensionPaymentKlarnaInvoice.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentAmazonLoginPay.getTransactions.getTransactions=SELECT * FROM `oc_amazon_login_pay_order_transaction` WHERE `amazon_login_pay_order_id` = :amazon_login_pay_order_id
#END
ModelExtensionPaymentAmazonLoginPay.addAddress.addAddress=SELECT * FROM `oc_address` WHERE `firstname` = :firstname AND `lastname` = :lastname AND `address_1` = :address_1 AND `address_2` = :address_2 AND `postcode` = :postcode AND `city` = :city AND `zone_id` = :zone_id AND `country_id` = :country_id
#END
ModelExtensionPaymentAmazonLoginPay.getOrder.getOrder=SELECT * FROM `oc_amazon_login_pay_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentPPPro.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentPPProIframe.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSagePayServer.getOrder.getOrder=SELECT * FROM `oc_sagepay_server_order` WHERE `order_id` = :order_id OR `VPSTxId` = :VPSTxId
#END
ModelExtensionPaymentSagePayServer.getProfile.getProfile=SELECT * FROM oc_order_recurring WHERE order_recurring_id = :order_recurring_id
#END
ModelExtensionPaymentSagePayServer.getCard.getCard=SELECT * FROM oc_sagepay_server_card WHERE( card_id = :card_id OR token = :token ) AND customer_id = :customer_id
#END
ModelExtensionPaymentSagePayServer.getMethod.getMethod=SELECT * FROM `oc_zone_to_geo_zone` WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSagePayServer.getRecurringOrders.getRecurringOrders=SELECT * FROM `oc_order_recurring` WHERE order_id = :order_id
#END
ModelExtensionPaymentSagePayServer.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_sagepay_server_order_recurring WHERE order_recurring_id = :order_recurring_id
#END
ModelExtensionPaymentSagePayServer.getTransactions.getTransactions=SELECT * FROM `oc_sagepay_server_order_transaction` WHERE `sagepay_server_order_id` = :sagepay_server_order_id
#END
ModelExtensionPaymentSagePayServer.getCards.getCards=SELECT * FROM `oc_sagepay_server_card` WHERE customer_id = :customer_id
#END
ModelExtensionPaymentCardinity.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentCardinity.getOrder.getOrder=SELECT * FROM `oc_cardinity_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentKlarnaAccount.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentGlobalpayRemote.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSecureTradingPp.getOrder.getOrder=SELECT * FROM `oc_securetrading_pp_order` WHERE `order_id` = :order_id
#END
ModelExtensionPaymentSecureTradingPp.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionPaymentSkrill.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionTotalCoupon.getCoupon.getCouponHistoryQuery=SELECT COUNT( * ) AS total FROM `oc_coupon_history` ch WHERE ch.coupon_id = :coupon_id AND ch.customer_id = :customer_id
#END
ModelExtensionTotalCoupon.getCoupon.getCouponQuery=SELECT * FROM `oc_coupon` WHERE code = :code AND(( date_start ='0000-00-00' OR date_start <NOW( ) ) AND( date_end ='0000-00-00' OR date_end >NOW( ) ) ) AND status ='1'
#END
ModelExtensionTotalCoupon.getCoupon.getCouponCategoryQuery=SELECT COUNT( * ) AS total FROM `oc_product_to_category` WHERE `product_id` = :product_id AND category_id = :category_id
#END
ModelExtensionTotalCoupon.getCoupon.getCouponProductQuery=SELECT * FROM `oc_coupon_product` WHERE coupon_id = :coupon_id
#END
ModelExtensionTotalVoucher.getVoucher.getOrderQuery=SELECT order_id FROM `oc_order` WHERE order_id = :order_id AND order_status_id IN( param1 )
#END
ModelExtensionTotalVoucher.getVoucher.getVoucherQuery=SELECT * , vtd.name AS theme FROM oc_voucher v LEFT JOIN oc_voucher_theme vt ON( v.voucher_theme_id =vt.voucher_theme_id ) LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id =vtd.voucher_theme_id ) WHERE v.code = :code AND vtd.language_id = :language_id AND v.status ='1'
#END
ModelExtensionTotalVoucher.getVoucher.getOrderVoucherQuery=SELECT order_voucher_id FROM `oc_order_voucher` WHERE order_id = :order_id AND voucher_id = :voucher_id
#END
ModelExtensionTotalVoucher.getVoucher.getVoucherHistoryQuery=SELECT SUM( amount ) AS total FROM `oc_voucher_history` vh WHERE vh.voucher_id = :voucher_id GROUP BY vh.voucher_id
#END
ModelExtensionTotalVoucherTheme.getVoucherThemes.getVoucherThemes=SELECT vt.voucher_theme_id , vt.image , vtd.voucher_theme_id as voucher_theme_id0 , vtd.language_id , vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id =vtd.voucher_theme_id ) WHERE vtd.language_id = :language_id ORDER BY vtd.name
#END
ModelExtensionTotalVoucherTheme.getVoucherTheme.getVoucherTheme=SELECT vt.voucher_theme_id , vt.image , vtd.voucher_theme_id as voucher_theme_id0 , vtd.language_id , vtd.name FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id =vtd.voucher_theme_id ) WHERE vt.voucher_theme_id = :voucher_theme_id AND vtd.language_id = :language_id
#END
ModelExtensionEvent.getEvents.getEvents=SELECT * FROM `oc_event` WHERE `trigger` LIKE 'catalog/%' AND status ='1' ORDER BY `event_id` ASC
#END
ModelExtensionModuleLaybuyLayout.getTransactionByOrderId.getTransactionByOrderId=SELECT * FROM `oc_laybuy_transaction` WHERE `order_id` = :order_id ORDER BY `laybuy_ref_no` DESC
#END
ModelExtensionModuleLaybuyLayout.isLayBuyOrder.isLayBuyOrder=SELECT * FROM `oc_laybuy_transaction` WHERE `order_id` = :order_id
#END
ModelExtensionFraudMaxMind.check.check=SELECT * FROM `oc_maxmind` WHERE order_id = :order_id
#END
ModelExtensionFraudIp.check.check=SELECT * FROM `oc_fraud_ip` WHERE ip = :ip
#END
ModelExtensionFraudFraudLabsPro.check.check=SELECT * FROM `oc_fraudlabspro` WHERE order_id = :order_id
#END
ModelExtensionShippingWeight.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingParcelforce48.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingAusPost.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingPickup.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingUps.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingRoyalMail.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingFree.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingCitylink.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingItem.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingUsps.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingFlat.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionShippingFedex.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone WHERE geo_zone_id = :geo_zone_id AND country_id = :country_id AND( zone_id = :zone_id OR zone_id ='0' )
#END
ModelExtensionModule.getModule.getModule=SELECT * FROM oc_module WHERE module_id = :module_id
#END
ModelCatalogProduct.getProductAttributes.getProductAttributeQuery=SELECT a.attribute_id , ad.name , pa.text FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON( pa.attribute_id =a.attribute_id ) LEFT JOIN oc_attribute_description ad ON( a.attribute_id =ad.attribute_id ) WHERE pa.product_id = :product_id AND a.attribute_group_id = :attribute_group_id AND ad.language_id = :language_id AND pa.language_id = :language_id ORDER BY a.sort_order , ad.name
#END
ModelCatalogProduct.getTotalProductSpecials.getTotalProductSpecials=SELECT COUNT( DISTINCT ps.product_id ) AS total FROM oc_product_special ps LEFT JOIN oc_product p ON( ps.product_id =p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id ) WHERE p.status ='1' AND p.date_available <=NOW( ) AND p2s.store_id = :store_id AND ps.customer_group_id = :customer_group_id AND(( ps.date_start ='0000-00-00' OR ps.date_start <NOW( ) ) AND( ps.date_end ='0000-00-00' OR ps.date_end >NOW( ) ) )
#END
ModelCatalogProduct.getLatestProducts.getLatestProducts=SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id ) WHERE p.status ='1' AND p.date_available <=NOW( ) AND p2s.store_id = :store_id ORDER BY p.date_added DESC
#END
ModelCatalogProduct.getProductOptions.getProductOptionValueQuery=SELECT pov.product_option_value_id , pov.product_option_id , pov.product_id , pov.option_id , pov.option_value_id , pov.quantity , pov.subtract , pov.price , pov.price_prefix , pov.points , pov.points_prefix , pov.weight , pov.weight_prefix , ov.option_value_id as option_value_id0 , ov.option_id as option_id0 , ov.image , ov.sort_order , ovd.option_value_id as option_value_id01 , ovd.language_id , ovd.option_id as option_id01 , ovd.name FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON( pov.option_value_id =ov.option_value_id ) LEFT JOIN oc_option_value_description ovd ON( ov.option_value_id =ovd.option_value_id ) WHERE pov.product_id = :product_id AND pov.product_option_id = :product_option_id AND ovd.language_id = :language_id ORDER BY ov.sort_order
#END
ModelCatalogProduct.getPopularProducts.getPopularProducts=SELECT p.product_id FROM oc_product p LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id ) WHERE p.status ='1' AND p.date_available <=NOW( ) AND p2s.store_id = :store_id ORDER BY p.viewed DESC , p.date_added DESC
#END
ModelCatalogProduct.getProductDiscounts.getProductDiscounts=SELECT * FROM oc_product_discount WHERE product_id = :product_id AND customer_group_id = :customer_group_id AND quantity >1 AND(( date_start ='0000-00-00' OR date_start <NOW( ) ) AND( date_end ='0000-00-00' OR date_end >NOW( ) ) ) ORDER BY quantity ASC , priority ASC , price ASC
#END
ModelCatalogProduct.getProfiles.getProfiles=SELECT rd.* FROM oc_product_recurring pr JOIN oc_recurring_description rd ON( rd.language_id = :language_id AND rd.recurring_id =pr.recurring_id ) JOIN oc_recurring r ON r.recurring_id =rd.recurring_id WHERE pr.product_id = :product_id AND status ='1' AND pr.customer_group_id = :customer_group_id ORDER BY sort_order ASC
#END
ModelCatalogProduct.getProfile.getProfile=SELECT r.recurring_id , r.price , r.frequency , r.duration , r.cycle , r.trial_status , r.trial_price , r.trial_frequency , r.trial_duration , r.trial_cycle , r.status , r.sort_order , pr.product_id , pr.recurring_id as recurring_id0 , pr.customer_group_id FROM oc_recurring r JOIN oc_product_recurring pr ON( pr.recurring_id =r.recurring_id AND pr.product_id = :product_id ) WHERE pr.recurring_id = :recurring_id AND status ='1' AND pr.customer_group_id = :customer_group_id
#END
ModelCatalogProduct.getProductLayoutId.getProductLayoutId=SELECT * FROM oc_product_to_layout WHERE product_id = :product_id AND store_id = :store_id
#END
ModelCatalogProduct.getProduct.getProduct=SELECT DISTINCT * , pd.name AS name , p.image , m.name AS manufacturer ,( SELECT price FROM oc_product_discount pd2 WHERE pd2.product_id =p.product_id AND pd2.customer_group_id = :customer_group_id AND pd2.quantity ='1' AND(( pd2.date_start ='0000-00-00' OR pd2.date_start <NOW( ) ) AND( pd2.date_end ='0000-00-00' OR pd2.date_end >NOW( ) ) ) ORDER BY pd2.priority ASC , pd2.price ASC  ) AS discount ,( SELECT price FROM oc_product_special ps WHERE ps.product_id =p.product_id AND ps.customer_group_id = :customer_group_id AND(( ps.date_start ='0000-00-00' OR ps.date_start <NOW( ) ) AND( ps.date_end ='0000-00-00' OR ps.date_end >NOW( ) ) ) ORDER BY ps.priority ASC , ps.price ASC  ) AS special ,( SELECT points FROM oc_product_reward pr WHERE pr.product_id =p.product_id AND pr.customer_group_id = :customer_group_id ) AS reward ,( SELECT ss.name FROM oc_stock_status ss WHERE ss.stock_status_id =p.stock_status_id AND ss.language_id = :language_id ) AS stock_status ,( SELECT wcd.unit FROM oc_weight_class_description wcd WHERE p.weight_class_id =wcd.weight_class_id AND wcd.language_id = :language_id ) AS weight_class ,( SELECT lcd.unit FROM oc_length_class_description lcd WHERE p.length_class_id =lcd.length_class_id AND lcd.language_id = :language_id ) AS length_class ,( SELECT AVG( rating ) AS total FROM oc_review r1 WHERE r1.product_id =p.product_id AND r1.status ='1' GROUP BY r1.product_id ) AS rating ,( SELECT COUNT( * ) AS total FROM oc_review r2 WHERE r2.product_id =p.product_id AND r2.status ='1' GROUP BY r2.product_id ) AS reviews , p.sort_order FROM oc_product p LEFT JOIN oc_product_description pd ON( p.product_id =pd.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id ) LEFT JOIN oc_manufacturer m ON( p.manufacturer_id =m.manufacturer_id ) WHERE p.product_id = :product_id AND pd.language_id = :language_id AND p.status ='1' AND p.date_available <=NOW( ) AND p2s.store_id = :store_id
#END
ModelCatalogProduct.getCategories.getCategories=SELECT * FROM oc_product_to_category WHERE product_id = :product_id
#END
ModelCatalogProduct.getProductAttributes.getProductAttributeGroupQuery=SELECT ag.attribute_group_id , agd.name FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON( pa.attribute_id =a.attribute_id ) LEFT JOIN oc_attribute_group ag ON( a.attribute_group_id =ag.attribute_group_id ) LEFT JOIN oc_attribute_group_description agd ON( ag.attribute_group_id =agd.attribute_group_id ) WHERE pa.product_id = :product_id AND agd.language_id = :language_id GROUP BY ag.attribute_group_id ORDER BY ag.sort_order , agd.name
#END
ModelCatalogProduct.getProductImages.getProductImages=SELECT * FROM oc_product_image WHERE product_id = :product_id ORDER BY sort_order ASC
#END
ModelCatalogProduct.getProductOptions.getProductOptionQuery=SELECT po.product_option_id , po.product_id , po.option_id , po.value , po.required , o.option_id as option_id0 , o.type , o.sort_order , od.option_id as option_id01 , od.language_id , od.name FROM oc_product_option po LEFT JOIN `oc_option` o ON( po.option_id =o.option_id ) LEFT JOIN oc_option_description od ON( o.option_id =od.option_id ) WHERE po.product_id = :product_id AND od.language_id = :language_id ORDER BY o.sort_order
#END
ModelCatalogProduct.getProductRelated.getProductRelated=SELECT pr.product_id , pr.related_id , p.product_id as product_id0 , p.model , p.sku , p.upc , p.ean , p.jan , p.isbn , p.mpn , p.location , p.quantity , p.stock_status_id , p.image , p.manufacturer_id , p.shipping , p.price , p.points , p.tax_class_id , p.date_available , p.weight , p.weight_class_id , p.length , p.width , p.height , p.length_class_id , p.subtract , p.minimum , p.sort_order , p.status , p.viewed , p.date_added , p.date_modified , p2s.product_id as product_id01 , p2s.store_id FROM oc_product_related pr LEFT JOIN oc_product p ON( pr.related_id =p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id ) WHERE pr.product_id = :product_id AND p.status ='1' AND p.date_available <=NOW( ) AND p2s.store_id = :store_id
#END
ModelCatalogProduct.getBestSellerProducts.getBestSellerProducts=SELECT op.product_id , SUM( op.quantity ) AS total FROM oc_order_product op LEFT JOIN `oc_order` o ON( op.order_id =o.order_id ) LEFT JOIN `oc_product` p ON( op.product_id =p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id ) WHERE o.order_status_id >'0' AND p.status ='1' AND p.date_available <=NOW( ) AND p2s.store_id = :store_id GROUP BY op.product_id ORDER BY total DESC
#END
ModelCatalogCategory.getCategoryFilters.getFilterQuery=SELECT DISTINCT f.filter_id , fd.name FROM oc_filter f LEFT JOIN oc_filter_description fd ON( f.filter_id =fd.filter_id ) WHERE f.filter_id IN( param0 ) AND f.filter_group_id = :filter_group_id AND fd.language_id = :language_id ORDER BY f.sort_order , LCASE( fd.name )
#END
ModelCatalogCategory.getCategoryFilters.getQuery=SELECT filter_id FROM oc_category_filter WHERE category_id = :category_id
#END
ModelCatalogCategory.getTotalCategoriesByCategoryId.getTotalCategoriesByCategoryId=SELECT COUNT( * ) AS total FROM oc_category c LEFT JOIN oc_category_to_store c2s ON( c.category_id =c2s.category_id ) WHERE c.parent_id = :parent_id AND c2s.store_id = :store_id AND c.status ='1'
#END
ModelCatalogCategory.getCategoryLayoutId.getCategoryLayoutId=SELECT * FROM oc_category_to_layout WHERE category_id = :category_id AND store_id = :store_id
#END
ModelCatalogCategory.getCategoryFilters.getFilterGroupQuery=SELECT DISTINCT f.filter_group_id , fgd.name , fg.sort_order FROM oc_filter f LEFT JOIN oc_filter_group fg ON( f.filter_group_id =fg.filter_group_id ) LEFT JOIN oc_filter_group_description fgd ON( fg.filter_group_id =fgd.filter_group_id ) WHERE f.filter_id IN( param0 ) AND fgd.language_id = :language_id GROUP BY f.filter_group_id ORDER BY fg.sort_order , LCASE( fgd.name )
#END
ModelCatalogCategory.getCategory.getCategory=SELECT c.category_id , c.image , c.parent_id , c.top , c.column , c.sort_order , c.status , c.date_added , c.date_modified , cd.category_id as category_id0 , cd.language_id , cd.name , cd.description , cd.meta_title , cd.meta_description , cd.meta_keyword , c2s.category_id as category_id01 , c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id =cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id =c2s.category_id ) WHERE c.category_id = :category_id AND cd.language_id = :language_id AND c2s.store_id = :store_id AND c.status ='1'
#END
ModelCatalogCategory.getCategories.getCategories=SELECT c.category_id , c.image , c.parent_id , c.top , c.column , c.sort_order , c.status , c.date_added , c.date_modified , cd.category_id as category_id0 , cd.language_id , cd.name , cd.description , cd.meta_title , cd.meta_description , cd.meta_keyword , c2s.category_id as category_id01 , c2s.store_id FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id =cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id =c2s.category_id ) WHERE c.parent_id = :parent_id AND cd.language_id = :language_id AND c2s.store_id = :store_id AND c.status ='1' ORDER BY c.sort_order , LCASE( cd.name )
#END
ModelCatalogInformation.getInformation.getInformation=SELECT i.information_id , i.bottom , i.sort_order , i.status , id.information_id as information_id0 , id.language_id , id.title , id.description , id.meta_title , id.meta_description , id.meta_keyword , i2s.information_id as information_id01 , i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id =id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id =i2s.information_id ) WHERE i.information_id = :information_id AND id.language_id = :language_id AND i2s.store_id = :store_id AND i.status ='1'
#END
ModelCatalogInformation.getInformations.getInformations=SELECT i.information_id , i.bottom , i.sort_order , i.status , id.information_id as information_id0 , id.language_id , id.title , id.description , id.meta_title , id.meta_description , id.meta_keyword , i2s.information_id as information_id01 , i2s.store_id FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id =id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id =i2s.information_id ) WHERE id.language_id = :language_id AND i2s.store_id = :store_id AND i.status ='1' ORDER BY i.sort_order , LCASE( id.title ) ASC
#END
ModelCatalogInformation.getInformationLayoutId.getInformationLayoutId=SELECT * FROM oc_information_to_layout WHERE information_id = :information_id AND store_id = :store_id
#END
ModelCatalogManufacturer.getManufacturer.getManufacturer=SELECT m.manufacturer_id , m.name , m.image , m.sort_order , m2s.manufacturer_id as manufacturer_id0 , m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id =m2s.manufacturer_id ) WHERE m.manufacturer_id = :manufacturer_id AND m2s.store_id = :store_id
#END
ModelCatalogManufacturer.getManufacturers.getManufacturers=SELECT m.manufacturer_id , m.name , m.image , m.sort_order , m2s.manufacturer_id as manufacturer_id0 , m2s.store_id FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id =m2s.manufacturer_id ) WHERE m2s.store_id = :store_id ORDER BY name
#END
ModelCatalogReview.getTotalReviewsByProductId.getTotalReviewsByProductId=SELECT COUNT( * ) AS total FROM oc_review r LEFT JOIN oc_product p ON( r.product_id =p.product_id ) LEFT JOIN oc_product_description pd ON( p.product_id =pd.product_id ) WHERE p.product_id = :product_id AND p.date_available <=NOW( ) AND p.status ='1' AND r.status ='1' AND pd.language_id = :language_id
#END
ModelCatalogReview.getReviewsByProductId.getReviewsByProductId=SELECT r.review_id , r.author , r.rating , r.text , p.product_id , pd.name , p.price , p.image , r.date_added FROM oc_review r LEFT JOIN oc_product p ON( r.product_id =p.product_id ) LEFT JOIN oc_product_description pd ON( p.product_id =pd.product_id ) WHERE p.product_id = :product_id AND p.date_available <=NOW( ) AND p.status ='1' AND r.status ='1' AND pd.language_id = :language_id ORDER BY r.date_added DESC
#END
ModelSettingSetting.getSetting.getSetting=SELECT * FROM oc_setting WHERE store_id = :store_id AND `code` = :code
#END
ModelSettingApi.login.login=SELECT * FROM oc_api WHERE username = :username AND password = :password
#END
ModelSettingStore.getStores.getStores=SELECT * FROM oc_store ORDER BY url
#END
ModelAffiliateAffiliate.getTransactionTotal.getTransactionTotal=SELECT SUM( amount ) AS total FROM oc_affiliate_transaction WHERE affiliate_id = :affiliate_id
#END
ModelAffiliateAffiliate.getAffiliate.getAffiliate=SELECT * FROM oc_affiliate WHERE affiliate_id = :affiliate_id
#END
ModelAffiliateAffiliate.getAffiliateByEmail.getAffiliateByEmail=SELECT * FROM oc_affiliate WHERE LOWER( email ) = :email
#END
ModelAffiliateAffiliate.getTotalAffiliatesByEmail.getTotalAffiliatesByEmail=SELECT COUNT( * ) AS total FROM oc_affiliate WHERE LOWER( email ) = :email
#END
ModelAffiliateAffiliate.getAffiliateByCode.getAffiliateByCode=SELECT * FROM oc_affiliate WHERE code = :code
#END
ModelAffiliateAffiliate.addLoginAttempt.addLoginAttempt=SELECT * FROM oc_affiliate_login WHERE email = :email AND ip = :ip
#END
ModelAffiliateAffiliate.getLoginAttempts.getLoginAttempts=SELECT * FROM `oc_affiliate_login` WHERE email = :email
#END
ModelAffiliateTransaction.getTotalTransactions.getTotalTransactions=SELECT COUNT( * ) AS total FROM `oc_affiliate_transaction` WHERE affiliate_id = :affiliate_id
#END
ModelAffiliateTransaction.getBalance.getBalance=SELECT SUM( amount ) AS total FROM `oc_affiliate_transaction` WHERE affiliate_id = :affiliate_id GROUP BY affiliate_id
#END
ModelLocalisationLanguage.getLanguage.getLanguage=SELECT * FROM oc_language WHERE language_id = :language_id
#END
ModelLocalisationLanguage.getLanguages.getLanguages=SELECT * FROM oc_language WHERE status ='1' ORDER BY sort_order , name
#END
ModelLocalisationLocation.getLocation.getLocation=SELECT location_id , name , address , geocode , telephone , fax , image , open , comment FROM oc_location WHERE location_id = :location_id
#END
ModelLocalisationCurrency.getCurrencies.getCurrencies=SELECT * FROM oc_currency ORDER BY title ASC
#END
ModelLocalisationCurrency.getCurrencyByCode.getCurrencyByCode=SELECT DISTINCT * FROM oc_currency WHERE code = :code
#END
ModelLocalisationReturnReason.getReturnReasons.getReturnReasons=SELECT return_reason_id , name FROM oc_return_reason WHERE language_id = :language_id ORDER BY name
#END
ModelLocalisationZone.getZonesByCountryId.getZonesByCountryId=SELECT * FROM oc_zone WHERE country_id = :country_id AND status ='1' ORDER BY name
#END
ModelLocalisationZone.getZone.getZone=SELECT * FROM oc_zone WHERE zone_id = :zone_id AND status ='1'
#END
ModelLocalisationCountry.getCountries.getCountries=SELECT * FROM oc_country WHERE status ='1' ORDER BY name ASC
#END
ModelLocalisationCountry.getCountry.getCountry=SELECT * FROM oc_country WHERE country_id = :country_id AND status ='1'
#END
ModelAccountCustomer.addLoginAttempt.addLoginAttempt=SELECT * FROM oc_customer_login WHERE email = :email AND ip = :ip
#END
ModelAccountCustomer.getCustomerByEmail.getCustomerByEmail=SELECT * FROM oc_customer WHERE LOWER( email ) = :email
#END
ModelAccountCustomer.getIps.getIps=SELECT * FROM `oc_customer_ip` WHERE customer_id = :customer_id
#END
ModelAccountCustomer.getLoginAttempts.getLoginAttempts=SELECT * FROM `oc_customer_login` WHERE email = :email
#END
ModelAccountCustomer.getRewardTotal.getRewardTotal=SELECT SUM( points ) AS total FROM oc_customer_reward WHERE customer_id = :customer_id
#END
ModelAccountCustomer.getCustomerByCode.getCustomerByCode=SELECT customer_id , firstname , lastname , email FROM `oc_customer` WHERE code = :code AND code !=''
#END
ModelAccountCustomer.getTotalCustomersByEmail.getTotalCustomersByEmail=SELECT COUNT( * ) AS total FROM oc_customer WHERE LOWER( email ) = :email
#END
ModelAccountCustomer.getCustomer.getCustomer=SELECT * FROM oc_customer WHERE customer_id = :customer_id
#END
ModelAccountCustomer.getCustomerByToken.getCustomerByToken=SELECT * FROM oc_customer WHERE token = :token AND token !=''
#END
ModelAccountApi.getApiByKey.getApiByKey=SELECT * FROM `oc_api` WHERE `key` = :key AND status ='1'
#END
ModelAccountApi.getApiIps.getApiIps=SELECT * FROM `oc_api_ip` WHERE api_id = :api_id
#END
ModelAccountDownload.getTotalDownloads.getTotalDownloads=SELECT COUNT( * ) AS total FROM `oc_order` o LEFT JOIN oc_order_product op ON( o.order_id =op.order_id ) LEFT JOIN oc_product_to_download p2d ON( op.product_id =p2d.product_id ) WHERE o.customer_id = :customer_id AND( param1 )
#END
ModelAccountDownload.getDownloads.getDownloads=SELECT DISTINCT d.download_id , o.order_id , o.date_added , dd.name , d.filename FROM `oc_order` o LEFT JOIN oc_order_product op ON( o.order_id =op.order_id ) LEFT JOIN oc_product_to_download p2d ON( op.product_id =p2d.product_id ) LEFT JOIN oc_download d ON( p2d.download_id =d.download_id ) LEFT JOIN oc_download_description dd ON( d.download_id =dd.download_id ) WHERE o.customer_id = :customer_id AND dd.language_id = :language_id AND( param2 ) ORDER BY o.date_added DESC
#END
ModelAccountDownload.getDownload.getDownload=SELECT d.filename , d.mask FROM `oc_order` o LEFT JOIN oc_order_product op ON( o.order_id =op.order_id ) LEFT JOIN oc_product_to_download p2d ON( op.product_id =p2d.product_id ) LEFT JOIN oc_download d ON( p2d.download_id =d.download_id ) WHERE o.customer_id = :customer_id AND( param1 ) AND d.download_id = :download_id
#END
ModelAccountOrder.getOrderVouchers.getOrderVouchers=SELECT * FROM `oc_order_voucher` WHERE order_id = :order_id
#END
ModelAccountOrder.getOrder.getZoneQuery=SELECT * FROM `oc_zone` WHERE zone_id = :zone_id
#END
ModelAccountOrder.getOrderProduct.getOrderProduct=SELECT * FROM oc_order_product WHERE order_id = :order_id AND order_product_id = :order_product_id
#END
ModelAccountOrder.getOrderOptions.getOrderOptions=SELECT * FROM oc_order_option WHERE order_id = :order_id AND order_product_id = :order_product_id
#END
ModelAccountOrder.getTotalOrderProductsByOrderId.getTotalOrderProductsByOrderId=SELECT COUNT( * ) AS total FROM oc_order_product WHERE order_id = :order_id
#END
ModelAccountOrder.getOrderProducts.getOrderProducts=SELECT * FROM oc_order_product WHERE order_id = :order_id
#END
ModelAccountOrder.getOrder.getCountryQuery=SELECT * FROM `oc_country` WHERE country_id = :country_id
#END
ModelAccountOrder.getTotalOrderVouchersByOrderId.getTotalOrderVouchersByOrderId=SELECT COUNT( * ) AS total FROM `oc_order_voucher` WHERE order_id = :order_id
#END
ModelAccountOrder.getOrderHistories.getOrderHistories=SELECT date_added , os.name AS status , oh.comment , oh.notify FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id =os.order_status_id WHERE oh.order_id = :order_id AND os.language_id = :language_id ORDER BY oh.date_added
#END
ModelAccountOrder.getOrderTotals.getOrderTotals=SELECT * FROM oc_order_total WHERE order_id = :order_id ORDER BY sort_order
#END
ModelAccountOrder.getOrders.getOrders=SELECT o.order_id , o.firstname , o.lastname , os.name as status , o.date_added , o.total , o.currency_code , o.currency_value FROM `oc_order` o LEFT JOIN oc_order_status os ON( o.order_status_id =os.order_status_id ) WHERE o.customer_id = :customer_id AND o.order_status_id >'0' AND o.store_id = :store_id AND os.language_id = :language_id ORDER BY o.order_id DESC
#END
ModelAccountOrder.getOrder.getOrderQuery=SELECT * FROM `oc_order` WHERE order_id = :order_id AND customer_id = :customer_id AND order_status_id >'0'
#END
ModelAccountOrder.getTotalOrders.getTotalOrders=SELECT COUNT( * ) AS total FROM `oc_order` o WHERE customer_id = :customer_id AND o.order_status_id >'0' AND o.store_id = :store_id
#END
ModelAccountTransaction.getTotalTransactions.getTotalTransactions=SELECT COUNT( * ) AS total FROM `oc_customer_transaction` WHERE customer_id = :customer_id
#END
ModelAccountTransaction.getTotalAmount.getTotalAmount=SELECT SUM( amount ) AS total FROM `oc_customer_transaction` WHERE customer_id = :customer_id GROUP BY customer_id
#END
ModelAccountRecurring.getOrderRecurring.getOrderRecurring=SELECT `or`.* , `o`.`payment_method` , `o`.`payment_code` , `o`.`currency_code` FROM `oc_order_recurring` `or` LEFT JOIN `oc_order` `o` ON `or`.`order_id` =`o`.`order_id` WHERE `or`.`order_recurring_id` = :order_recurring_id AND `o`.`customer_id` = :customer_id
#END
ModelAccountRecurring.getTotalOrderRecurrings.getTotalOrderRecurrings=SELECT COUNT( * ) AS total FROM `oc_order_recurring` `or` LEFT JOIN `oc_order` `o` ON `or`.`order_id` =`o`.`order_id` WHERE `o`.`customer_id` = :customer_id
#END
ModelAccountRecurring.getOrderRecurringTransactions.getOrderRecurringTransactions=SELECT * FROM `oc_order_recurring_transaction` WHERE `order_recurring_id` = :order_recurring_id
#END
ModelAccountRecurring.getOrderRecurringByReference.getOrderRecurringByReference=SELECT * FROM `oc_order_recurring` WHERE `reference` = :reference
#END
ModelAccountRecurring.getOrderRecurrings.getOrderRecurrings=SELECT `or`.* , `o`.`payment_method` , `o`.`currency_id` , `o`.`currency_value` FROM `oc_order_recurring` `or` LEFT JOIN `oc_order` `o` ON `or`.`order_id` =`o`.`order_id` WHERE `o`.`customer_id` = :customer_id ORDER BY `o`.`order_id` DESC
#END
ModelAccountCustomField.getCustomFields.getCustomFieldValueQuery=SELECT cfv.custom_field_value_id , cfv.custom_field_id , cfv.sort_order , cfvd.custom_field_value_id as custom_field_value_id0 , cfvd.language_id , cfvd.custom_field_id as custom_field_id0 , cfvd.name FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON( cfv.custom_field_value_id =cfvd.custom_field_value_id ) WHERE cfv.custom_field_id = :custom_field_id AND cfvd.language_id = :language_id ORDER BY cfv.sort_order ASC
#END
ModelAccountCustomField.getCustomFields.getCustomFieldQuery=SELECT cfcg.custom_field_id , cfcg.customer_group_id , cfcg.required , cf.custom_field_id as custom_field_id0 , cf.type , cf.value , cf.validation , cf.location , cf.status , cf.sort_order , cfd.custom_field_id as custom_field_id01 , cfd.language_id , cfd.name FROM `oc_custom_field_customer_group` cfcg LEFT JOIN `oc_custom_field` cf ON( cfcg.custom_field_id =cf.custom_field_id ) LEFT JOIN `oc_custom_field_description` cfd ON( cf.custom_field_id =cfd.custom_field_id ) WHERE cf.status ='1' AND cfd.language_id = :language_id AND cfcg.customer_group_id = :customer_group_id ORDER BY cf.sort_order ASC
#END
ModelAccountCustomField.getCustomField.getCustomField=SELECT cf.custom_field_id , cf.type , cf.value , cf.validation , cf.location , cf.status , cf.sort_order , cfd.custom_field_id as custom_field_id0 , cfd.language_id , cfd.name FROM `oc_custom_field` cf LEFT JOIN `oc_custom_field_description` cfd ON( cf.custom_field_id =cfd.custom_field_id ) WHERE cf.status ='1' AND cf.custom_field_id = :custom_field_id AND cfd.language_id = :language_id
#END
ModelAccountAddress.getAddress.getAddressQuery=SELECT DISTINCT * FROM oc_address WHERE address_id = :address_id AND customer_id = :customer_id
#END
ModelAccountAddress.getTotalAddresses.getTotalAddresses=SELECT COUNT( * ) AS total FROM oc_address WHERE customer_id = :customer_id
#END
ModelAccountAddress.getAddresses.getZoneQuery=SELECT * FROM `oc_zone` WHERE zone_id = :zone_id
#END
ModelAccountAddress.getAddress.getZoneQuery=SELECT * FROM `oc_zone` WHERE zone_id = :zone_id
#END
ModelAccountAddress.getAddresses.getQuery=SELECT * FROM oc_address WHERE customer_id = :customer_id
#END
ModelAccountAddress.getAddress.getCountryQuery=SELECT * FROM `oc_country` WHERE country_id = :country_id
#END
ModelAccountAddress.getAddresses.getCountryQuery=SELECT * FROM `oc_country` WHERE country_id = :country_id
#END
ModelAccountReturn.getReturns.getReturns=SELECT r.return_id , r.order_id , r.firstname , r.lastname , rs.name as status , r.date_added FROM `oc_return` r LEFT JOIN oc_return_status rs ON( r.return_status_id =rs.return_status_id ) WHERE r.customer_id = :customer_id AND rs.language_id = :language_id ORDER BY r.return_id DESC
#END
ModelAccountReturn.getTotalReturns.getTotalReturns=SELECT COUNT( * ) AS total FROM `oc_return` WHERE customer_id = :customer_id
#END
ModelAccountReturn.getReturnHistories.getReturnHistories=SELECT rh.date_added , rs.name AS status , rh.comment FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id =rs.return_status_id WHERE rh.return_id = :return_id AND rs.language_id = :language_id ORDER BY rh.date_added ASC
#END
ModelAccountReturn.getReturn.getReturn=SELECT r.return_id , r.order_id , r.firstname , r.lastname , r.email , r.telephone , r.product , r.model , r.quantity , r.opened ,( SELECT rr.name FROM oc_return_reason rr WHERE rr.return_reason_id =r.return_reason_id AND rr.language_id = :language_id ) AS reason ,( SELECT ra.name FROM oc_return_action ra WHERE ra.return_action_id =r.return_action_id AND ra.language_id = :language_id ) AS action ,( SELECT rs.name FROM oc_return_status rs WHERE rs.return_status_id =r.return_status_id AND rs.language_id = :language_id ) AS status , r.comment , r.date_ordered , r.date_added , r.date_modified FROM `oc_return` r WHERE r.return_id = :return_id AND r.customer_id = :customer_id
#END
ModelAccountCustomerGroup.getCustomerGroup.getCustomerGroup=SELECT cg.customer_group_id , cg.approval , cg.sort_order , cgd.customer_group_id as customer_group_id0 , cgd.language_id , cgd.name , cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id =cgd.customer_group_id ) WHERE cg.customer_group_id = :customer_group_id AND cgd.language_id = :language_id
#END
ModelAccountCustomerGroup.getCustomerGroups.getCustomerGroups=SELECT cg.customer_group_id , cg.approval , cg.sort_order , cgd.customer_group_id as customer_group_id0 , cgd.language_id , cgd.name , cgd.description FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id =cgd.customer_group_id ) WHERE cgd.language_id = :language_id ORDER BY cg.sort_order ASC , cgd.name ASC
#END
ModelAccountWishlist.getWishlist.getWishlist=SELECT * FROM oc_customer_wishlist WHERE customer_id = :customer_id
#END
ModelAccountWishlist.getTotalWishlist.getTotalWishlist=SELECT COUNT( * ) AS total FROM oc_customer_wishlist WHERE customer_id = :customer_id
#END
ModelAccountReward.getTotalPoints.getTotalPoints=SELECT SUM( points ) AS total FROM `oc_customer_reward` WHERE customer_id = :customer_id GROUP BY customer_id
#END
ModelAccountReward.getTotalRewards.getTotalRewards=SELECT COUNT( * ) AS total FROM `oc_customer_reward` WHERE customer_id = :customer_id
#END
ModelToolUpload.getUploadByCode.getUploadByCode=SELECT * FROM `oc_upload` WHERE code = :code
#END
