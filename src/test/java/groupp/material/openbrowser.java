package groupp.material;



import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


public class openbrowser extends browser {

	@Test
	public void open() throws IOException, InterruptedException
	{
		driver=browserr();
		driver.manage().window().maximize();
		driver.get("http://10.10.3.11/EX175_TST/(S(fzospg3sa5nayxowhpcmt4vm))/index.aspx");
		
		LoginObject login=new LoginObject(driver);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login.enterbtn().click();
		
		/*Set<String> id=driver.getWindowHandles();
	       Iterator<String> it=id.iterator();
	       String parentID=it.next();
	       String childid=it.next();
	       driver.switchTo().window(childid);
	       driver.switchTo().window(parentID).close();
	       driver.switchTo().window(childid);
	       Thread.sleep(1000);*/
		
		//addd
		login.username().sendKeys("pvps");
		login.password().sendKeys("password0");
		login.proceed().click();
		
		if(login.plantselection().isDisplayed())
		{
			login.plantselection().click();
			login.plantselectioncontinue.click();
		}

	}
}
