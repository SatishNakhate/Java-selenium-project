package locater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatr {

	public static void main(String[] args) {
		WebDriver drivers = new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("https://www.opencart.com/?route=account/login");
		String Actualtt = drivers.getTitle();

	}

}
