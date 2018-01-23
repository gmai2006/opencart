package com.opencart.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

public class MultilinePropertiesReader {
	private final static Logger logger = Logger.getLogger(DaoUtils.class.getName());
	
	private static final String DELIMTER = "#END";

	public static Properties loadProperties(String classpath) {
		Properties prop = new Properties();
		try {
			BufferedReader reader = new BufferedReader(
			    new InputStreamReader(MultilinePropertiesReader.class.getResourceAsStream(classpath)));
			prop = loadProperties(reader);

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info("FAILED to load the properties file");
		}
		return prop;
	}

	public static Map<String, String> loadPropertiesToMap(BufferedReader reader) {
		Map<String, String> result = new HashMap<String, String>();
		Properties prop = loadProperties(reader);
		for (String key : prop.stringPropertyNames()) {
			result.put(key, prop.getProperty(key));
		}
		return result;
	}

	public static Properties loadProperties(BufferedReader reader) {
		Properties prop = new Properties();
		try {
			String line = null;
			String key = null;
			StringBuilder builder = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				if (line.trim().isEmpty())
					continue;
				int index = line.indexOf("=");

				if (index > 0) {
					key = line.substring(0, index).trim();
					line = line.substring(index + 1).trim();
					while (null != line && !line.trim().startsWith(DELIMTER)) {

						builder.append(line.trim() + " ");
						line = reader.readLine();
					}
					prop.setProperty(key, builder.toString());
					// logger.debug(key + ":" + prop.getProperty(key));
					builder = new StringBuilder();
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.info("Failed to load the properties file:");
		}
		return prop;
	}
}
