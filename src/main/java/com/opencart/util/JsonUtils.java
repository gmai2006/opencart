package com.opencart.util;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {
	private final static Logger logger = Logger.getLogger(JsonUtils.class.getName());
	public static void write2File(Path output, Object o) {
		try (Writer writer = new FileWriter(output.toFile())) {
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    gson.toJson(o, writer);
		} catch (Exception ex) {
			logger.severe("Unable to write object to json [" + ex.getMessage() + "]");
		}
	}
	
	public static String write2String(Object o) {
		try {
//	    Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
	    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    return gson.toJson(o);
		} catch (Exception ex) {
			logger.severe("Unable to write object to json [" + ex.getMessage() + "]");
			return "";
		}
	}
	
	public static String write2CompressString(Object o) {
		try {
//	    Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
	    Gson gson = new GsonBuilder().create();
	    return gson.toJson(o);
		} catch (Exception ex) {
			logger.severe("Unable to write object to json [" + ex.getMessage() + "]");
			return "";
		}
	}
}
