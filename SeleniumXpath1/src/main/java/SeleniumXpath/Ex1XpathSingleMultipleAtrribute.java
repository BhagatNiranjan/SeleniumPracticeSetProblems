package SeleniumXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1XpathSingleMultipleAtrribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//xpath with single attribute
				driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
				//xpath with multiply attribute
				driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");

	}

}
