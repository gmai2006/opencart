package com.opencart.config; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin  {
  private static Map<String, List<String> > map = new HashMap<String, List<String> > ();

  static {
    insert("site_base", "HTTP_SERVER");
    insert("site_ssl", "HTTPS_SERVER");
    insert("db_type", "DB_DRIVER");
    insert("db_hostname", "DB_HOSTNAME");
    insert("db_username", "DB_USERNAME");
    insert("db_password", "DB_PASSWORD");
    insert("db_database", "DB_DATABASE");
    insert("db_port", "DB_PORT");
    insert("action_pre_action", "startup/startup");
    insert("action_pre_action", "startup/error");
    insert("action_pre_action", "startup/event");
    insert("action_pre_action", "startup/sass");
    insert("action_pre_action", "startup/login");
    insert("action_pre_action", "startup/permission");
    insert("action_default", "common/dashboard");
    insert("action_event", "event/theme");
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