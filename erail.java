package leaning1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eral {
public static void main(String[] args) {
	

	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://erail.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("Md");
	from.sendKeys(Keys.ENTER);
	
	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("mdu");
	to.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();
	
	WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']/table"));
	List<WebElement> trainList = table.findElements(By.xpath("//div[@id='divTrainsList']/table//tr/td[2]"));
	
	for(WebElement trainList1:trainList) {
		String trainnames = trainList1.getText();
	System.out.println(trainnames);
	
	
	
	}
}
	
}	
	
	
	
	
	


