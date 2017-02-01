package com.opencart.config; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Install  {
  private static Map<String, List<String> > map = new HashMap<String, List<String> > ();

  static {
    insert("site_base", "HTTP_SERVER");
    insert("site_ssl", "HTTP_SERVER");
    insert("language_default", "en-gb");
    insert("language_autoload", "en-gb");
    insert("action_default", "install/step_1");
    insert("action_router", "startup/router");
    insert("action_error", "error/not_found");
    insert("action_pre_action", "startup/language");
    insert("action_pre_action", "startup/upgrade");
    insert("action_pre_action", "startup/database");
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