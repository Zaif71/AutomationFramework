package fetchdata;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingDataFromExcelFile implements IAutConstant {
   static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Flib lib=new Flib();
    String browser=lib.getDataFromPropertyFile(PROP_PATH, BROWSER);
    String url=lib.getDataFromPropertyFile(PROP_PATH,URL);
    if(browser.equals("Chrome"))
    	driver=new ChromeDriver();
    else if(browser.equals("edge"))
    	driver=new EdgeDriver();
    else if(browser.equals("firefox"))
    	driver=new FirefoxDriver();
    else 
    	System.out.println("invalid browser");
       driver.manage().window().maximize();
       driver.get(url);
       
 
    
    

	}

}
