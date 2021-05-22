package helper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Utility {

	public static String generateRandomStringByUUID() {
		return UUID.randomUUID().toString();
	}

	public static String getDateTime() {

		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String currentTime = sdf.format(dt);
		return currentTime;
	}
}
