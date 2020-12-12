package groupp.material;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browser {

	
	
	public WebDriver driver;
	public WebDriver browserr() throws IOException
	
	{
		
		Properties pro =new Properties();
		FileInputStream fi=new FileInputStream(".\\src\\main\\java\\groupp\\material\\data.properties");
		pro.load(fi);
		
		String browsername=pro.getProperty("browser1");
		System.out.println(browsername);
		if(browsername.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\selenium sw\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			
		}
		
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium sw\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();	
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\selenium sw\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();	
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}
}
