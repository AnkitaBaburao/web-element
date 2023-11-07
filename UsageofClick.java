package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement creatNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
		creatNewAccount.click();
		//find the female radio button
	//WebElement femaleRadioButtan=driver.findElement(By.xpath(
		//"//label[text()='Female']/../input[@type='radio']"));
//	femaleRadioButtan. click();
	//WebElement maleRadioButtan=driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
	//maleRadioButtan.click();
	//identify the Month dropdown buttan
	//WebElement dropdownButtan=driver.findElement(By.id("month"));
	//dropdownButtan.click();
	//identify the first name text field
	//WebElement text=driver.findElement(By.name("firstname"));
	//text.click();
	}

}
