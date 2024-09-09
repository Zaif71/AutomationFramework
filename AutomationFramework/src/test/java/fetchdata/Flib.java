package fetchdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib {

	public String getDataFromPropertyFile(String path,String key ) throws IOException
	{
		
		FileInputStream f=new FileInputStream(path);
		Properties p=new Properties();
		p.load(f);
		
		return p.getProperty(key);
		
	}
}
