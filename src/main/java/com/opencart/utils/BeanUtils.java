package com.opencart.utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class BeanUtils {
	
		static Log logger = LogFactory.getLog(BeanUtils.class);
		
		public static String getQueryString(String queryName) {
			return queryName;
		}
		
		public static Object getNullableValue(Object o) {
			if (null == o)
				return null;

			if (o instanceof Date) {
				return o;
			} else if (o instanceof BigDecimal) {
				return ((BigDecimal) o).longValue();
			} else if (o instanceof String) {
				return o;
			} else if (o instanceof BigInteger) {
				return ((BigInteger) o).longValue();
			} else if (o instanceof java.sql.Timestamp) {
				return o;
			} else if (o instanceof java.sql.Time) {
				return o;
			} else if (o instanceof Character) {
				return String.valueOf(o);
			} else if (o instanceof Short) {
				return Integer.valueOf((Short) o);
			} else if (o instanceof Integer) {
				return o;
			} else if (o instanceof java.sql.Clob) {
				StringBuilder sb = new StringBuilder();
				try {
					java.sql.Clob data = (java.sql.Clob) o;
					Reader reader = data.getCharacterStream();
					BufferedReader br = new BufferedReader(reader);

					String line;
					while (null != (line = br.readLine())) {
						sb.append(line);
					}
					br.close();
				} catch (SQLException e) {
					// handle this exception
				} catch (IOException e) {
					// handle this exception
				}
				return sb.toString();
			} else {
				logger.error("Cannot find type :" + o + ":" + o.getClass().getName());
				return o;
			}
		}

		/**
		 * This method returns if an input value has only alpha and numeric characters
		 * @param str - input value
		 * @return - boolean value if its alpha numeric or not
		 */
		public static boolean isStringNumeric(String str) {
			return str.matches("-?\\d+(\\.\\d+)?");
		}


}
