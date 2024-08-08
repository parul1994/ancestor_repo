package ancestor_descendant.parnet_child_follwing;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fb_reg_ancesstor {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid='open-registration-form-button']"))).click();
		
		//<!--------self------------------>
		List<WebElement> self=driver.findElements(By.xpath("//select[@id='day']/self::select"));
		//String txt=self.getText();
		System.out.println("self val : "+self.size());
		
		//<!--------parent------------------>
		List<WebElement> parent=driver.findElements(By.xpath("//select[@id='day']/parent::span"));
		System.out.println("parent val : "+parent.size());
		
		//<!--------ancestor------------------>
		List<WebElement> ancestor=driver.findElements(By.xpath("//select[@id='day']/ancestor::span"));
		System.out.println("ancestor val : "+ancestor.size());
		
		//<!--------child------------------>
		List<WebElement> child=driver.findElements(By.xpath("//select[@id='day']/child::option"));
		System.out.println("child val : " +child.size());
		
		
		//<!--------following------------------>
		List<WebElement> follow=driver.findElements(By.xpath("//select[@id='day']/following::span"));
		System.out.println("follow val : "+follow.size());
		
		//<!--------following-sibling------------------>
		List<WebElement> flw_sib=driver.findElements(By.xpath("//select[@id='day']/following-sibling::select"));
		System.out.println("follow_sibling val : "+flw_sib.size());
		
		//<!--------descendant------------------>
		List<WebElement> descendant=driver.findElements(By.xpath("//select[@id='day']/descendant::option"));
		System.out.println("desc val : "+descendant.size());
				
		driver.quit();
		

	}

}
