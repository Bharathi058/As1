package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityMethod {
	
	public String getDataFromPropertyFile(String key) throws IOException
	{
	FileInputStream fis = new FileInputStream("./TestData/prop.properties.txt");
	Properties prop = new Properties();
	prop.load(fis);
	return prop.getProperty(key);

}
}

