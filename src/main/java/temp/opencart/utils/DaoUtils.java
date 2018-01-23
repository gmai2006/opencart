package temp.opencart.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

import com.opencart.util.MultilinePropertiesReader;

public class DaoUtils {
	private final static Logger logger = Logger.getLogger(DaoUtils.class.getName());
	private static final String ALLQUERIES = "alltempqueries.sql";
	private static Map<String, String> queries;
	
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
			logger.severe("Cannot find type :" + o + ":" + o.getClass().getName());
			return o;
		}
	}
	
	public static Map<String, String> getSQLQueries() {
		if (null == queries || queries.isEmpty()) {
			BufferedReader reader = 
					new BufferedReader (
							new InputStreamReader(DaoUtils.class.getResourceAsStream("/" + ALLQUERIES), Charset.defaultCharset()));
			queries = MultilinePropertiesReader.loadPropertiesToMap(reader);
		}
		
		return Collections.unmodifiableMap(queries);
	}
	
	public static String getQuery(String name) {
		return getSQLQueries().get(name);
	}

}
