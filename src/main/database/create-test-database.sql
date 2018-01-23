INSERT INTO oc_affiliate (affiliate_id,firstname,lastname,email,telephone,fax,password,salt,company,website,address_1,address_2,city,postcode,country_id,zone_id,code,commission,tax,payment,cheque,paypal,bank_name,bank_branch_number,bank_swift_code,bank_account_name,bank_account_number,ip,status,approved,date_added) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_affiliate_activity (affiliate_activity_id,affiliate_id,key,data,ip,date_added) VALUES (1 /*not nullable*/,1 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/, SYSDATE() /*not nullable*/);

INSERT INTO oc_affiliate_login (affiliate_login_id,email,ip,total,date_added,date_modified) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_affiliate_transaction (affiliate_transaction_id,affiliate_id,order_id,description,amount,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_api_ip (api_ip_id,api_id,ip) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);

INSERT INTO oc_api_session (api_session_id,api_id,token,session_id,session_name,ip,date_added,date_modified) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_category_to_layout (category_id,store_id,layout_id) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);



INSERT INTO oc_customer (customer_id,customer_group_id,store_id,language_id,firstname,lastname,email,telephone,fax,password,salt,cart,wishlist,newsletter,address_id,custom_field,ip,status,approved,safe,token,code,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s','s',0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_customer_affiliate (customer_id,company,website,tracking,commission,tax,payment,cheque,paypal,bank_name,bank_branch_number,bank_swift_code,bank_account_name,bank_account_number,custom_field,status,date_added) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_customer_approval (customer_approval_id,customer_id,type,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_customer_login (customer_login_id,email,ip,total,date_added,date_modified) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_customer_reward (customer_reward_id,customer_id,order_id,description,points,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_customer_transaction (customer_transaction_id,customer_id,order_id,description,amount,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_download (download_id,filename,mask,date_added) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_order (order_id,invoice_no,invoice_prefix,store_id,store_name,store_url,customer_id,customer_group_id,firstname,lastname,email,telephone,fax,custom_field,payment_firstname,payment_lastname,payment_company,payment_address_1,payment_address_2,payment_city,payment_postcode,payment_country,payment_country_id,payment_zone,payment_zone_id,payment_address_format,payment_custom_field,payment_method,payment_code,shipping_firstname,shipping_lastname,shipping_company,shipping_address_1,shipping_address_2,shipping_city,shipping_postcode,shipping_country,shipping_country_id,shipping_zone,shipping_zone_id,shipping_address_format,shipping_custom_field,shipping_method,shipping_code,comment,total,order_status_id,affiliate_id,commission,marketing_id,tracking,language_id,currency_id,currency_code,currency_value,ip,forwarded_ip,user_agent,accept_language,date_added,date_modified) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_order_history (order_history_id,order_id,order_status_id,notify,comment,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);

INSERT INTO oc_order_shipment (order_shipment_id,order_id,date_added,shipping_courier_id,tracking_number) VALUES (0 /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/);

INSERT INTO oc_order_total (order_total_id,order_id,code,title,value,sort_order) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);



INSERT INTO oc_custom_field_description (custom_field_id,language_id,name) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);

INSERT INTO oc_custom_field (custom_field_id,type,value,validation,location,status,sort_order) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_custom_field_customer_group (custom_field_id,customer_group_id,required) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);



INSERT INTO oc_custom_field_value (custom_field_value_id,custom_field_id,sort_order) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_custom_field_value_description (custom_field_value_id,language_id,custom_field_id,name) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);


INSERT INTO oc_customer_history (customer_history_id,customer_id,comment,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_customer_ip (customer_ip_id,customer_id,ip,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);



INSERT INTO oc_customer_online (ip,customer_id,url,referer,date_added) VALUES ('s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_customer_search (customer_search_id,store_id,language_id,customer_id,keyword,category_id,sub_category,description,products,ip,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);



INSERT INTO oc_customer_wishlist (customer_id,product_id,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_download_description (download_id,language_id,name) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);



INSERT INTO oc_filter (filter_id,filter_group_id,sort_order) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_filter_description (filter_id,language_id,filter_group_id,name) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);


INSERT INTO oc_filter_group (filter_group_id,sort_order) VALUES (0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_filter_group_description (filter_group_id,language_id,name) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);



INSERT INTO oc_location (location_id,name,address,telephone,fax,geocode,image,open,comment) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s','s' /*not nullable*/,'s' /*not nullable*/);


INSERT INTO oc_marketing (marketing_id,name,description,code,clicks,date_added) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_menu (menu_id,store_id,type,link,sort_order,status) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);



INSERT INTO oc_menu_description (menu_id,language_id,name) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);


INSERT INTO oc_menu_module (menu_module_id,menu_id,code,sort_order) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_modification (modification_id,name,code,author,version,link,xml,status,date_added) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);



INSERT INTO oc_order_custom_field (order_custom_field_id,order_id,custom_field_id,custom_field_value_id,name,value,type,location) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/);


INSERT INTO oc_order_option (order_option_id,order_id,order_product_id,product_option_id,product_option_value_id,name,value,type) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/);


INSERT INTO oc_order_product (order_product_id,order_id,product_id,name,model,quantity,price,total,tax,reward) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_order_recurring (order_recurring_id,order_id,reference,product_id,product_name,product_quantity,recurring_id,recurring_name,recurring_description,recurring_frequency,recurring_cycle,recurring_duration,recurring_price,trial,trial_frequency,trial_cycle,trial_duration,trial_price,status,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_order_recurring_transaction (order_recurring_transaction_id,order_recurring_id,reference,type,amount,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_order_voucher (order_voucher_id,order_id,voucher_id,description,code,from_name,from_email,to_name,to_email,voucher_theme_id,message,amount) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_product_filter (product_id,filter_id) VALUES (0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_product_recurring (product_id,recurring_id,customer_group_id) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_product_to_download (product_id,download_id) VALUES (0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_product_to_layout (product_id,store_id,layout_id) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/);


INSERT INTO oc_recurring_description (recurring_id,language_id,name) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/);


INSERT INTO oc_return (return_id,order_id,product_id,customer_id,firstname,lastname,email,telephone,product,model,quantity,opened,return_reason_id,return_action_id,return_status_id,comment,date_ordered,date_added,date_modified) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s',{d '2018-01-15'} /*not nullable*/,NOW() /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_return_history (return_history_id,return_id,return_status_id,notify,comment,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_review (review_id,product_id,customer_id,author,text,rating,status,date_added,date_modified) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_theme (theme_id,store_id,theme,route,code) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/);



INSERT INTO oc_upload (upload_id,name,filename,code,date_added) VALUES (0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_voucher (voucher_id,order_id,code,from_name,from_email,to_name,to_email,voucher_theme_id,message,amount,status,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,'s' /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);


INSERT INTO oc_voucher_history (voucher_history_id,voucher_id,order_id,amount,date_added) VALUES (0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,0 /*not nullable*/,NOW() /*not nullable*/);


update oc_order set order_status_id=1;

commit;
update oc_zone_to_geo_zone set date_added=NOW(), date_modified=NOW();

update oc_product_discount set date_start=NOW(), date_end=NOW();


