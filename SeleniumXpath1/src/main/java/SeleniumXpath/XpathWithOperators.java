package SeleniumXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search'and @placeholder='Search']")).sendKeys("Tshirts");
				//xpath with or operators
				driver.findElement(By.xpath("//input[@name='search'or @placeholder='xyz']")).sendKeys("Tshirts");

	}

}
