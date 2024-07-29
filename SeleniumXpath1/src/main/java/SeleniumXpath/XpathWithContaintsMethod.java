package SeleniumXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithContaintsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//xpath with Containts method
				driver.findElement(By.xpath("//input[contains(@placeholder,'sea')]")).sendKeys("Tshirts");
				 // xpath  with start.with()
				driver.findElement(By.xpath("//input[starts.with(@placeholder,'sea')]")).sendKeys("Tshirts");
				

	}

}
