package php.utils;

public class StringUtils {
	public static String implode(String delimiter, String[] arr ) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
		    sb.append(arr[i]);
		    if (i != arr.length - 1) {
		        sb.append(delimiter);
		    }
		}
		String joined = sb.toString();
		return joined.toString();
	}
	
	public static String[] explode(String regex, String s) {
		return s.split(regex);
	}
	
	public static String implode(char delimiter, String[] arr ) {
		return implode(String.valueOf(delimiter), arr);
	}
}
