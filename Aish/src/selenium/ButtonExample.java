package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point xypoint = getPositionButton.getLocation();
		double xvalue = xypoint.getX();
		double yvalue = xypoint.getY();
		System.out.println("x value is:"+xvalue+"y value is :"+yvalue);
		
		WebElement colorButton = driver.findElement(By.id("color"));
	    String color = colorButton.getCssValue("background-color");
		System.out.println("Button color is : "+color);
		
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width= sizeButton.getSize().getWidth();
		System.out.println("Height is :"+height+"Width is : "+width);
		
		WebElement homePage = driver.findElement(By.id("home"));
		homePage.click();
		
		
		
		
		
		
		
		

	}

}
