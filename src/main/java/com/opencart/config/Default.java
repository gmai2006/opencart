package com.opencart.config; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Default  {
  private static Map<String, List<String> > map = new HashMap<String, List<String> > ();

  static {
    insert("site_base", "");
    insert("language_default", "en-gb");
    insert("language_autoload", "en-gb");
    insert("db_type", "mysqli");
    insert("db_hostname", "localhost");
    insert("db_username", "root");
    insert("db_password", "");
    insert("db_database", "");
    insert("mail_protocol", "mail");
    insert("mail_from", "");
    insert("mail_sender", "");
    insert("mail_reply_to", "");
    insert("mail_smtp_hostname", "");
    insert("mail_smtp_username", "");
    insert("mail_smtp_password", "");
    insert("mail_parameter", "");
    insert("cache_type", "file");
    insert("session_name", "PHPSESSID");
    insert("template_type", "php");
    insert("error_filename", "error.log");
    insert("response_header", "Content-Type: text/html; charset=utf-8");
    insert("action_default", "common/home");
    insert("action_router", "startup/router");
    insert("action_error", "error/not_found");
  } 

  public static Map<String, List<String> > getMap() {
    return map;
  }

  public static List<String> getValues(String key) {
    return map.get(key);
  }

  private static void insert(final String key, final String value) {
    if (map.containsKey(key)) {
      List<String> values = map.get(key);
      values.add(value);
    } else {
      List<String> values = new ArrayList<String>();
      values.add(value);
      map.put(key, values);
    }
  }
}