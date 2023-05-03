package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest3 {
WebDriver driver;
	
  @Test
  public void Tc_01() {
	  WebDriverManager.edgedriver().setup();
	  WebDriverManager.chromedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
	  
	  
  }
}
