package fetchdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFetch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create object of FileInputStream class
		FileInputStream f=new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		//create the object of Properties class
		Properties p=new Properties();
		//use load method it will load every component
		p.load(f);
		//fetch the data using using get property method
		String value =p.getProperty("Browser");
		System.out.println(value);
		String value1=p.getProperty("url");
		System.out.println(value1);
		
		
	}

}