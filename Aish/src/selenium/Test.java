package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("test.gmail.com1");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Ishu");
		String value = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.name("username")).clear();
	}

}
