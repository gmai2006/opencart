ModelCheckoutMarketing.getMarketingByCode.getMarketingByCode=SELECT * FROM oc_marketing
#END
ModelCheckoutOrder.addOrderHistory.getOrderVoucherQuery=SELECT * FROM oc_order_voucher
#END
ModelCheckoutOrder.addOrderHistory.getOptionQuery=SELECT * FROM oc_order_option
#END
ModelCheckoutOrder.addOrderHistory.getProductQuery=SELECT * FROM oc_order_product
#END
ModelCheckoutOrder.addOrderHistory.getOrderProductQuery=SELECT * FROM oc_order_product
#END
ModelCheckoutOrder.getOrder.getOrderQuery=
#END
ModelCheckoutOrder.addOrderHistory.getOrderTotalQuery=
#END
ModelCheckoutOrder.addOrderHistory.getProductDownloadQuery=
#END
ModelCheckoutOrder.getOrder.getCountryQuery=
#END
ModelCheckoutOrder.getOrder.getZoneQuery=
#END
ModelCheckoutOrder.addOrderHistory.getOrderOptionQuery=SELECT * FROM oc_order_option
#END
ModelCheckoutOrder.addOrderHistory.getOrderStatusQuery=SELECT * FROM oc_order_status
#END
ModelDesignTheme.getTheme.getTheme=SELECT * FROM oc_theme
#END
ModelDesignLayout.getLayout.getLayout=SELECT * FROM oc_layout_route
#END
ModelDesignLayout.getLayoutModules.getLayoutModules=SELECT * FROM oc_layout_module
#END
ModelDesignBanner.getBanner.getBanner=SELECT * FROM oc_banner b LEFT JOIN oc_banner_image bi ON( b.banner_id =bi.banner_id )
#END
ModelDesignTranslation.getTranslations.getTranslations=SELECT * FROM oc_translation
#END
ModelExtensionExtension.getExtensions.getExtensions=SELECT * FROM oc_extension
#END
ModelExtensionOpenBayAmazonProduct.setSubmitError.setSubmitError=
#END
ModelExtensionOpenBayAmazonProduct.linkProduct.linkProduct=
#END
ModelExtensionOpenBayAmazonProduct.linkItems.linkItems=
#END
ModelExtensionOpenBayEbayOpenbay.updateOrderWithConfirmedData.updateOrderWithConfirmedData=
#END
ModelExtensionOpenBayAmazonusProduct.setSubmitError.setSubmitError=
#END
ModelExtensionOpenBayAmazonusProduct.linkItems.linkItems=
#END
ModelExtensionOpenBayAmazonusProduct.linkProduct.linkProduct=
#END
ModelExtensionOpenBayAmazonOrder.getAmazonOrderId.getAmazonOrderId=
#END
ModelExtensionOpenBayAmazonOrder.getProductId.getProductId=
#END
ModelExtensionOpenBayAmazonOrder.getProductOptionsByVar.getProductOptionsByVar=
#END
ModelExtensionOpenBayAmazonOrder.getZoneId.getZoneId=
#END
ModelExtensionOpenBayAmazonOrder.addAmazonOrderProducts.addAmazonOrderProducts=
#END
ModelExtensionOpenBayAmazonOrder.getCountryId.getCountryId=
#END
ModelExtensionOpenBayAmazonOrder.getOrderStatus.getOrderStatus=
#END
ModelExtensionOpenBayAmazonOrder.getProductVar.getProductVar=
#END
ModelExtensionOpenBayAmazonOrder.getOrderId.getOrderId=
#END
ModelExtensionOpenBayAmazonOrder.getCountryName.getCountryName=
#END
ModelExtensionOpenBayAmazonusOrder.getZoneId.getZoneId=
#END
ModelExtensionOpenBayAmazonusOrder.getAmazonusOrderId.getAmazonusOrderId=
#END
ModelExtensionOpenBayAmazonusOrder.getProductId.getProductId=
#END
ModelExtensionOpenBayAmazonusOrder.getProductOptionsByVar.getProductOptionsByVar=
#END
ModelExtensionOpenBayAmazonusOrder.getProductVar.getProductVar=
#END
ModelExtensionOpenBayAmazonusOrder.getCountryId.getCountryId=
#END
ModelExtensionOpenBayAmazonusOrder.getOrderId.getOrderId=
#END
ModelExtensionOpenBayAmazonusOrder.addAmazonusOrderProducts.addAmazonusOrderProducts=
#END
ModelExtensionOpenBayAmazonusOrder.getOrderStatus.getOrderStatus=
#END
ModelExtensionOpenBayAmazonusOrder.getCountryName.getCountryName=
#END
ModelExtensionOpenBayEbayProduct.lengthClassExists.lengthClassExists=
#END
ModelExtensionOpenBayEbayProduct.getProductOption.getProductOption=SELECT * FROM oc_product_option
#END
ModelExtensionOpenBayEbayProduct.getOption.getOption=
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry=
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry=
#END
ModelExtensionOpenBayEbayProduct.getProductOptionValue.getProductOptionValue=
#END
ModelExtensionOpenBayEbayProduct.attributeAdd.attributeAdd=
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry=
#END
ModelExtensionOpenBayEbayProduct.manufacturerExists.getQry2=
#END
ModelExtensionOpenBayEbayProduct.attributeExists.getQry2=
#END
ModelExtensionOpenBayEbayProduct.repairCategories.repairCategories=
#END
ModelExtensionOpenBayEbayProduct.attributeGroupExists.getQry2=
#END
ModelExtensionOpenBayEbayProduct.weightClassExists.weightClassExists=
#END
ModelExtensionOpenBayEbayProduct.importItems.importItems=
#END
ModelExtensionOpenBayEbayProduct.createOption.createOption=
#END
ModelExtensionOpenBayEbayProduct.getOptionValue.getOptionValue=
#END
ModelExtensionOpenBayEtsyOrder.lockExists.lockExists=
#END
ModelExtensionOpenBayEtsyOrder.create.create=
#END
ModelExtensionOpenBayEbayOrder.hasAddress.hasAddress=
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderStatusQuery=
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderTotalQuery=
#END
ModelExtensionOpenBayEbayOrder.addOrderHistory.addOrderHistory=
#END
ModelExtensionOpenBayEbayOrder.lockExists.lockExists=
#END
ModelExtensionOpenBayEbayOrder.getHistory.getHistory=
#END
ModelExtensionOpenBayEbayOrder.getCountryAddressFormat.getCountryAddressFormat=
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderProductQuery=
#END
ModelExtensionOpenBayEbayOrder.confirm.getOrderOptionQuery=SELECT * FROM oc_order_option
#END
ModelExtensionOpenBayEbayOrder.getOrderLine.getOrderLine=
#END
ModelExtensionOpenBayEbayOrder.getOrderLines.getOrderLines=
#END
ModelExtensionOpenBayEbayOrder.update.update=SELECT * FROM oc_order_status
#END
ModelExtensionFeedGoogleBase.getTotalCategories.getTotalCategories=
#END
ModelExtensionFeedGoogleBase.getCategories.getCategories=
#END
ModelExtensionPaymentCOD.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentPayMate.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentG2APay.getG2aOrder.getG2aOrder=
#END
ModelExtensionPaymentG2APay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentPerpetualPayments.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentBankTransfer.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentAuthorizeNetAim.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentNOCHEX.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentSecureTradingWs.getOrder.getOrder=
#END
ModelExtensionPaymentSecureTradingWs.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentSecureTradingWs.getOrderId.getOrderId=SELECT * FROM oc_securetrading_ws_order
#END
ModelExtensionPaymentSagePayUS.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentRealexRemote.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentWorldpay.getProfile.getProfile=SELECT * FROM oc_order_recurring
#END
ModelExtensionPaymentWorldpay.getWorldpayOrder.getWorldpayOrder=SELECT * FROM oc_worldpay_order
#END
ModelExtensionPaymentWorldpay.getCards.getCards=SELECT * FROM oc_worldpay_card
#END
ModelExtensionPaymentWorldpay.getOrder.getOrder=
#END
ModelExtensionPaymentWorldpay.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_worldpay_order_recurring
#END
ModelExtensionPaymentWorldpay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentWorldpay.getTransactions.getTransactions=
#END
ModelExtensionPaymentFirstdataRemote.getStoredCards.getStoredCards=SELECT * FROM oc_firstdata_remote_card
#END
ModelExtensionPaymentFirstdataRemote.getMethod.getMethod=
#END
ModelExtensionPaymentBluePayRedirect.getMethod.getMethod=
#END
ModelExtensionPaymentBluePayRedirect.getCards.getCards=
#END
ModelExtensionPaymentBluePayRedirect.getOrder.getOrder=
#END
ModelExtensionPaymentBluePayRedirect.getTransactions.getTransactions=
#END
ModelExtensionPaymentPayza.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentPayPoint.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentEway.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentEway.checkToken.checkToken=SELECT * FROM oc_eway_card
#END
ModelExtensionPaymentEway.getCards.getCards=SELECT * FROM oc_eway_card
#END
ModelExtensionPaymentPPPayflowIframe.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentPPPayflowIframe.getOrderId.getOrderId=
#END
ModelExtensionPaymentPPExpress.getTransactionRow.getTransactionRow=
#END
ModelExtensionPaymentPPExpress.getTotalRefunded.getTotalRefunded=
#END
ModelExtensionPaymentPPExpress.getMethod.getMethod=
#END
ModelExtensionPaymentPPExpress.getTotalCaptured.getTotalCaptured=
#END
ModelExtensionPaymentGlobalpay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode2.getCountryByIsoCode2=SELECT * FROM oc_country
#END
ModelExtensionPaymentKlarnaCheckout.getZoneByCode.getZoneByCode=SELECT * FROM oc_zone
#END
ModelExtensionPaymentKlarnaCheckout.getCountryByIsoCode3.getCountryByIsoCode3=SELECT * FROM oc_country
#END
ModelExtensionPaymentBluePayHosted.getMethod.getMethod=
#END
ModelExtensionPaymentLiqPay.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentCheque.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentWebPaymentSoftware.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentRealex.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentAuthorizeNetSim.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentCardConnect.getMethod.getMethod=
#END
ModelExtensionPaymentCardConnect.getCards.getCards=
#END
ModelExtensionPaymentCardConnect.getCard.getCard=
#END
ModelExtensionPaymentTwoCheckout.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentPPPayflow.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentPPStandard.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentSagePayDirect.getCard.getCard=SELECT * FROM oc_sagepay_direct_card
#END
ModelExtensionPaymentSagePayDirect.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentSagePayDirect.getOrder.getOrder=
#END
ModelExtensionPaymentSagePayDirect.getTransactions.getTransactions=
#END
ModelExtensionPaymentSagePayDirect.getProfile.getProfile=SELECT * FROM oc_order_recurring
#END
ModelExtensionPaymentSagePayDirect.getCards.getCards=SELECT * FROM oc_sagepay_direct_card
#END
ModelExtensionPaymentSagePayDirect.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_sagepay_direct_order_recurring
#END
ModelExtensionPaymentPilibaba.getOrderTaxAmount.getOrderTaxAmount=
#END
ModelExtensionPaymentFirstdata.getOrder.getOrder=
#END
ModelExtensionPaymentFirstdata.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentFirstdata.getStoredCards.getStoredCards=
#END
ModelExtensionPaymentFirstdata.storeCard.storeCard=
#END
ModelExtensionPaymentLaybuy.getMethod.getQuery=
#END
ModelExtensionPaymentLaybuy.getMethod.getProduct=
#END
ModelExtensionPaymentLaybuy.getPayPalProfileIds.getPayPalProfileIds=
#END
ModelExtensionPaymentLaybuy.getRevisedTransaction.getRevisedTransaction=
#END
ModelExtensionPaymentLaybuy.getTransactionByLayBuyRefId.getTransactionByLayBuyRefId=
#END
ModelExtensionPaymentLaybuy.getTransaction.getTransaction=
#END
ModelExtensionPaymentKlarnaInvoice.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentAmazonLoginPay.getTransactions.getTransactions=
#END
ModelExtensionPaymentAmazonLoginPay.addAddress.addAddress=
#END
ModelExtensionPaymentAmazonLoginPay.getOrder.getOrder=
#END
ModelExtensionPaymentPPPro.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentPPProIframe.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentSagePayServer.getOrder.getOrder=
#END
ModelExtensionPaymentSagePayServer.getProfile.getProfile=SELECT * FROM oc_order_recurring
#END
ModelExtensionPaymentSagePayServer.getCard.getCard=SELECT * FROM oc_sagepay_server_card
#END
ModelExtensionPaymentSagePayServer.getMethod.getMethod=
#END
ModelExtensionPaymentSagePayServer.getRecurringOrders.getRecurringOrders=
#END
ModelExtensionPaymentSagePayServer.getRecurringOrder.getRecurringOrder=SELECT * FROM oc_sagepay_server_order_recurring
#END
ModelExtensionPaymentSagePayServer.getTransactions.getTransactions=
#END
ModelExtensionPaymentSagePayServer.getCards.getCards=
#END
ModelExtensionPaymentCardinity.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentCardinity.getOrder.getOrder=
#END
ModelExtensionPaymentKlarnaAccount.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentGlobalpayRemote.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentSecureTradingPp.getOrder.getOrder=
#END
ModelExtensionPaymentSecureTradingPp.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionPaymentSkrill.getMethod.getMethod=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionTotalCoupon.getCoupon.getCouponHistoryQuery=
#END
ModelExtensionTotalCoupon.getCoupon.getCouponQuery=
#END
ModelExtensionTotalCoupon.getCoupon.getCouponCategoryQuery=
#END
ModelExtensionTotalCoupon.getCoupon.getCouponProductQuery=
#END
ModelExtensionTotalVoucher.getVoucher.getOrderQuery=
#END
ModelExtensionTotalVoucher.getVoucher.getVoucherQuery=SELECT * FROM oc_voucher v LEFT JOIN oc_voucher_theme vt ON( v.voucher_theme_id =vt.voucher_theme_id ) LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id =vtd.voucher_theme_id )
#END
ModelExtensionTotalVoucher.getVoucher.getOrderVoucherQuery=
#END
ModelExtensionTotalVoucher.getVoucher.getVoucherHistoryQuery=
#END
ModelExtensionTotalVoucherTheme.getVoucherThemes.getVoucherThemes=SELECT * FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id =vtd.voucher_theme_id )
#END
ModelExtensionTotalVoucherTheme.getVoucherTheme.getVoucherTheme=SELECT * FROM oc_voucher_theme vt LEFT JOIN oc_voucher_theme_description vtd ON( vt.voucher_theme_id =vtd.voucher_theme_id )
#END
ModelExtensionEvent.getEvents.getEvents=
#END
ModelExtensionModuleLaybuyLayout.getTransactionByOrderId.getTransactionByOrderId=
#END
ModelExtensionModuleLaybuyLayout.isLayBuyOrder.isLayBuyOrder=
#END
ModelExtensionFraudMaxMind.check.check=
#END
ModelExtensionFraudIp.check.check=
#END
ModelExtensionFraudFraudLabsPro.check.check=
#END
ModelExtensionShippingWeight.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingParcelforce48.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingAusPost.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingPickup.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingUps.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingRoyalMail.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingFree.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingCitylink.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingItem.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingUsps.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingFlat.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionShippingFedex.getQuote.getQuote=SELECT * FROM oc_zone_to_geo_zone
#END
ModelExtensionModule.getModule.getModule=SELECT * FROM oc_module
#END
ModelCatalogProduct.getProductAttributes.getProductAttributeQuery=SELECT * FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON( pa.attribute_id =a.attribute_id ) LEFT JOIN oc_attribute_description ad ON( a.attribute_id =ad.attribute_id )
#END
ModelCatalogProduct.getTotalProductSpecials.getTotalProductSpecials=SELECT * FROM oc_product_special ps LEFT JOIN oc_product p ON( ps.product_id =p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id )
#END
ModelCatalogProduct.getLatestProducts.getLatestProducts=SELECT * FROM oc_product p LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id )
#END
ModelCatalogProduct.getProductOptions.getProductOptionValueQuery=SELECT * FROM oc_product_option_value pov LEFT JOIN oc_option_value ov ON( pov.option_value_id =ov.option_value_id ) LEFT JOIN oc_option_value_description ovd ON( ov.option_value_id =ovd.option_value_id )
#END
ModelCatalogProduct.getPopularProducts.getPopularProducts=SELECT * FROM oc_product p LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id )
#END
ModelCatalogProduct.getProductDiscounts.getProductDiscounts=SELECT * FROM oc_product_discount
#END
ModelCatalogProduct.getProfiles.getProfiles=SELECT * FROM oc_product_recurring pr JOIN oc_recurring_description rd ON( 1 =1 AND rd.recurring_id =pr.recurring_id ) JOIN oc_recurring r ON r.recurring_id =rd.recurring_id
#END
ModelCatalogProduct.getProfile.getProfile=SELECT * FROM oc_recurring r JOIN oc_product_recurring pr ON( pr.recurring_id =r.recurring_id AND 1 =1 )
#END
ModelCatalogProduct.getProductLayoutId.getProductLayoutId=SELECT * FROM oc_product_to_layout
#END
ModelCatalogProduct.getProduct.getProduct=SELECT DISTINCT * FROM oc_product p LEFT JOIN oc_product_description pd ON( p.product_id =pd.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id ) LEFT JOIN oc_manufacturer m ON( p.manufacturer_id =m.manufacturer_id )
#END
ModelCatalogProduct.getCategories.getCategories=SELECT * FROM oc_product_to_category
#END
ModelCatalogProduct.getProductAttributes.getProductAttributeGroupQuery=SELECT * FROM oc_product_attribute pa LEFT JOIN oc_attribute a ON( pa.attribute_id =a.attribute_id ) LEFT JOIN oc_attribute_group ag ON( a.attribute_group_id =ag.attribute_group_id ) LEFT JOIN oc_attribute_group_description agd ON( ag.attribute_group_id =agd.attribute_group_id )
#END
ModelCatalogProduct.getProductImages.getProductImages=SELECT * FROM oc_product_image
#END
ModelCatalogProduct.getProductOptions.getProductOptionQuery=
#END
ModelCatalogProduct.getProductRelated.getProductRelated=SELECT * FROM oc_product_related pr LEFT JOIN oc_product p ON( pr.related_id =p.product_id ) LEFT JOIN oc_product_to_store p2s ON( p.product_id =p2s.product_id )
#END
ModelCatalogProduct.getBestSellerProducts.getBestSellerProducts=
#END
ModelCatalogCategory.getCategoryFilters.getFilterQuery=SELECT DISTINCT * FROM oc_filter f LEFT JOIN oc_filter_description fd ON( f.filter_id =fd.filter_id )
#END
ModelCatalogCategory.getCategoryFilters.getQuery=SELECT * FROM oc_category_filter
#END
ModelCatalogCategory.getTotalCategoriesByCategoryId.getTotalCategoriesByCategoryId=SELECT * FROM oc_category c LEFT JOIN oc_category_to_store c2s ON( c.category_id =c2s.category_id )
#END
ModelCatalogCategory.getCategoryLayoutId.getCategoryLayoutId=SELECT * FROM oc_category_to_layout
#END
ModelCatalogCategory.getCategoryFilters.getFilterGroupQuery=SELECT DISTINCT * FROM oc_filter f LEFT JOIN oc_filter_group fg ON( f.filter_group_id =fg.filter_group_id ) LEFT JOIN oc_filter_group_description fgd ON( fg.filter_group_id =fgd.filter_group_id )
#END
ModelCatalogCategory.getCategory.getCategory=SELECT DISTINCT * FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id =cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id =c2s.category_id )
#END
ModelCatalogCategory.getCategories.getCategories=SELECT * FROM oc_category c LEFT JOIN oc_category_description cd ON( c.category_id =cd.category_id ) LEFT JOIN oc_category_to_store c2s ON( c.category_id =c2s.category_id )
#END
ModelCatalogInformation.getInformation.getInformation=SELECT DISTINCT * FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id =id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id =i2s.information_id )
#END
ModelCatalogInformation.getInformations.getInformations=SELECT * FROM oc_information i LEFT JOIN oc_information_description id ON( i.information_id =id.information_id ) LEFT JOIN oc_information_to_store i2s ON( i.information_id =i2s.information_id )
#END
ModelCatalogInformation.getInformationLayoutId.getInformationLayoutId=SELECT * FROM oc_information_to_layout
#END
ModelCatalogManufacturer.getManufacturer.getManufacturer=SELECT * FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id =m2s.manufacturer_id )
#END
ModelCatalogManufacturer.getManufacturers.getManufacturers=SELECT * FROM oc_manufacturer m LEFT JOIN oc_manufacturer_to_store m2s ON( m.manufacturer_id =m2s.manufacturer_id )
#END
ModelCatalogReview.getTotalReviewsByProductId.getTotalReviewsByProductId=SELECT * FROM oc_review r LEFT JOIN oc_product p ON( r.product_id =p.product_id ) LEFT JOIN oc_product_description pd ON( p.product_id =pd.product_id )
#END
ModelCatalogReview.getReviewsByProductId.getReviewsByProductId=SELECT * FROM oc_review r LEFT JOIN oc_product p ON( r.product_id =p.product_id ) LEFT JOIN oc_product_description pd ON( p.product_id =pd.product_id )
#END
ModelSettingSetting.getSetting.getSetting=SELECT * FROM oc_setting
#END
ModelSettingApi.login.login=SELECT * FROM oc_api
#END
ModelSettingStore.getStores.getStores=SELECT * FROM oc_store
#END
ModelAffiliateAffiliate.getTransactionTotal.getTransactionTotal=SELECT * FROM oc_affiliate_transaction
#END
ModelAffiliateAffiliate.getAffiliate.getAffiliate=SELECT * FROM oc_affiliate
#END
ModelAffiliateAffiliate.getAffiliateByEmail.getAffiliateByEmail=SELECT * FROM oc_affiliate
#END
ModelAffiliateAffiliate.getTotalAffiliatesByEmail.getTotalAffiliatesByEmail=SELECT * FROM oc_affiliate
#END
ModelAffiliateAffiliate.getAffiliateByCode.getAffiliateByCode=SELECT * FROM oc_affiliate
#END
ModelAffiliateAffiliate.addLoginAttempt.addLoginAttempt=SELECT * FROM oc_affiliate_login
#END
ModelAffiliateAffiliate.getLoginAttempts.getLoginAttempts=
#END
ModelAffiliateTransaction.getTotalTransactions.getTotalTransactions=
#END
ModelAffiliateTransaction.getBalance.getBalance=
#END
ModelLocalisationLanguage.getLanguage.getLanguage=SELECT * FROM oc_language
#END
ModelLocalisationLanguage.getLanguages.getLanguages=SELECT * FROM oc_language
#END
ModelLocalisationLocation.getLocation.getLocation=SELECT * FROM oc_location
#END
ModelLocalisationCurrency.getCurrencies.getCurrencies=SELECT * FROM oc_currency
#END
ModelLocalisationCurrency.getCurrencyByCode.getCurrencyByCode=SELECT DISTINCT * FROM oc_currency
#END
ModelLocalisationReturnReason.getReturnReasons.getReturnReasons=SELECT * FROM oc_return_reason
#END
ModelLocalisationZone.getZonesByCountryId.getZonesByCountryId=SELECT * FROM oc_zone
#END
ModelLocalisationZone.getZone.getZone=SELECT * FROM oc_zone
#END
ModelLocalisationCountry.getCountries.getCountries=SELECT * FROM oc_country
#END
ModelLocalisationCountry.getCountry.getCountry=SELECT * FROM oc_country
#END
ModelAccountCustomer.addLoginAttempt.addLoginAttempt=SELECT * FROM oc_customer_login
#END
ModelAccountCustomer.getCustomerByEmail.getCustomerByEmail=SELECT * FROM oc_customer
#END
ModelAccountCustomer.getIps.getIps=
#END
ModelAccountCustomer.getLoginAttempts.getLoginAttempts=
#END
ModelAccountCustomer.getRewardTotal.getRewardTotal=SELECT * FROM oc_customer_reward
#END
ModelAccountCustomer.getCustomerByCode.getCustomerByCode=
#END
ModelAccountCustomer.getTotalCustomersByEmail.getTotalCustomersByEmail=SELECT * FROM oc_customer
#END
ModelAccountCustomer.getCustomer.getCustomer=SELECT * FROM oc_customer
#END
ModelAccountCustomer.getCustomerByToken.getCustomerByToken=SELECT * FROM oc_customer
#END
ModelAccountApi.getApiByKey.getApiByKey=
#END
ModelAccountApi.getApiIps.getApiIps=
#END
ModelAccountDownload.getTotalDownloads.getTotalDownloads=
#END
ModelAccountDownload.getDownloads.getDownloads=
#END
ModelAccountDownload.getDownload.getDownload=
#END
ModelAccountOrder.getOrderVouchers.getOrderVouchers=
#END
ModelAccountOrder.getOrder.getZoneQuery=
#END
ModelAccountOrder.getOrderProduct.getOrderProduct=SELECT * FROM oc_order_product
#END
ModelAccountOrder.getOrderOptions.getOrderOptions=SELECT * FROM oc_order_option
#END
ModelAccountOrder.getTotalOrderProductsByOrderId.getTotalOrderProductsByOrderId=SELECT * FROM oc_order_product
#END
ModelAccountOrder.getOrderProducts.getOrderProducts=SELECT * FROM oc_order_product
#END
ModelAccountOrder.getOrder.getCountryQuery=
#END
ModelAccountOrder.getTotalOrderVouchersByOrderId.getTotalOrderVouchersByOrderId=
#END
ModelAccountOrder.getOrderHistories.getOrderHistories=SELECT * FROM oc_order_history oh LEFT JOIN oc_order_status os ON oh.order_status_id =os.order_status_id
#END
ModelAccountOrder.getOrderTotals.getOrderTotals=SELECT * FROM oc_order_total
#END
ModelAccountOrder.getOrders.getOrders=
#END
ModelAccountOrder.getOrder.getOrderQuery=
#END
ModelAccountOrder.getTotalOrders.getTotalOrders=
#END
ModelAccountTransaction.getTotalTransactions.getTotalTransactions=
#END
ModelAccountTransaction.getTotalAmount.getTotalAmount=
#END
ModelAccountRecurring.getOrderRecurring.getOrderRecurring=
#END
ModelAccountRecurring.getTotalOrderRecurrings.getTotalOrderRecurrings=
#END
ModelAccountRecurring.getOrderRecurringTransactions.getOrderRecurringTransactions=
#END
ModelAccountRecurring.getOrderRecurringByReference.getOrderRecurringByReference=
#END
ModelAccountRecurring.getOrderRecurrings.getOrderRecurrings=
#END
ModelAccountCustomField.getCustomFields.getCustomFieldValueQuery=SELECT * FROM oc_custom_field_value cfv LEFT JOIN oc_custom_field_value_description cfvd ON( cfv.custom_field_value_id =cfvd.custom_field_value_id )
#END
ModelAccountCustomField.getCustomFields.getCustomFieldQuery=
#END
ModelAccountCustomField.getCustomField.getCustomField=
#END
ModelAccountAddress.getAddress.getAddressQuery=SELECT DISTINCT * FROM oc_address
#END
ModelAccountAddress.getTotalAddresses.getTotalAddresses=SELECT * FROM oc_address
#END
ModelAccountAddress.getAddresses.getZoneQuery=
#END
ModelAccountAddress.getAddress.getZoneQuery=
#END
ModelAccountAddress.getAddresses.getQuery=SELECT * FROM oc_address
#END
ModelAccountAddress.getAddress.getCountryQuery=
#END
ModelAccountAddress.getAddresses.getCountryQuery=
#END
ModelAccountReturn.getReturns.getReturns=
#END
ModelAccountReturn.getTotalReturns.getTotalReturns=
#END
ModelAccountReturn.getReturnHistories.getReturnHistories=SELECT * FROM oc_return_history rh LEFT JOIN oc_return_status rs ON rh.return_status_id =rs.return_status_id
#END
ModelAccountReturn.getReturn.getReturn=
#END
ModelAccountCustomerGroup.getCustomerGroup.getCustomerGroup=SELECT DISTINCT * FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id =cgd.customer_group_id )
#END
ModelAccountCustomerGroup.getCustomerGroups.getCustomerGroups=SELECT * FROM oc_customer_group cg LEFT JOIN oc_customer_group_description cgd ON( cg.customer_group_id =cgd.customer_group_id )
#END
ModelAccountWishlist.getWishlist.getWishlist=SELECT * FROM oc_customer_wishlist
#END
ModelAccountWishlist.getTotalWishlist.getTotalWishlist=SELECT * FROM oc_customer_wishlist
#END
ModelAccountReward.getTotalPoints.getTotalPoints=
#END
ModelAccountReward.getTotalRewards.getTotalRewards=
#END
ModelToolUpload.getUploadByCode.getUploadByCode=
#END
