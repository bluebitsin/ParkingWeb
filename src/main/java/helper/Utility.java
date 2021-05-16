package helper;

import java.util.UUID;

public class Utility {

	public static String generateRandomStringByUUID() {
        return UUID.randomUUID().toString();
    }
}
