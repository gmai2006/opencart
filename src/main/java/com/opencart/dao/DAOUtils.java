package com.opencart.dao;

import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DAOUtils {
	public static int updateByQuery(EntityManager em, String query, Map<String, Object> params) throws Exception {
		int updatecount = 0;

		Query q = em.createNativeQuery(query);
		if (params != null && !params.isEmpty()) {
			Set<String> keySet = params.keySet();
			for (String key : keySet) {
				q.setParameter(key, params.get(key));
			}
		}
		updatecount = q.executeUpdate();
		return updatecount;
	}
}
