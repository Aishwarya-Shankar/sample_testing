package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean seleniumselected = selenium.isSelected();
		System.out.println(seleniumselected);
		
		WebElement firstelement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if (firstelement.isSelected()) {
			firstelement.click();
		
			
		}
		
		WebElement secondelement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if (secondelement.isSelected()) {
			secondelement.click();
			
		}
        
	}

}
