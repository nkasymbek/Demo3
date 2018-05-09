package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	private static Properties properties;

	static {
		String filePath = "./Test.properties";
		try {
			FileInputStream input = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(input);
			input.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

	public static String getPropertyValue(String key) {
		return properties.getProperty(key);
	}

}
