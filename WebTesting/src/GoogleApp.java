import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleApp {
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		//To Open Application 
		try {
			Driver.get("https://www.opencart.com/index.php?route=cms/demo");
			String actualtitle = Driver.getTitle();
			//Driver.close();
			//Verify the Actual title 
			System.out.println("Title is :" +actualtitle );
			String expectedtitle = "OpenCart - Demo";
			Driver.manage().window().maximize();
			Driver.close();
			if (actualtitle.equals(expectedtitle))
			{
				System.out.println("Title is math");
			}
			else
			{
				System.out.println("Title does not match");
			}

		}catch(Exception e)
		{
			throw e;
		}
		finally {
			System.out.println("First show me Open Cart file");
		}
		
		//verifytitle();
		//'''Driver.findElement(By.ById= "cms-demo");
		//''@FindBy(How= How.ID, "cms-demo")
		//public webelement demo;
		
	}

}
