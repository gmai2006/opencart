package com.opencart.util;

import java.util.Map;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLoadingQueries {
	@Test
	public void testLoadingQueries() throws Exception {
		Map<String, String> queries = DaoUtils.getSQLQueries();
		String query = queries.get("getOrderVoucherQuery");
		assertEquals("Expect SELECT", true, query.startsWith("SELECT"));
	}
	
	@Test
	public void testGetQuery() throws Exception {
		String query = DaoUtils.getQuery("getOrderVoucherQuery");
		assertEquals("Expect SELECT", true, query.startsWith("SELECT"));
	}
}
