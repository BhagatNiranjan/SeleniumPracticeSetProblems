package SeleniumXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("*[text()'Macbook']")).click();
		boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		//driver.findElement(By.xpath("*[text()'Featured']")).isDisplayed();
	    String value=driver.findElement(By.xpath("*[text()'Featured']")).getText();
		
		System.out.println(value);
		

	}

}
