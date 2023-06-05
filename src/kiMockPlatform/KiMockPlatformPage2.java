package kiMockPlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class KiMockPlatformPage2 {
	
	private WebDriver driver;
    private By NextButton = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[3]/div[1]/div[1]/div[2]");
    
  
    
    public KiMockPlatformPage2(WebDriver driver) {
        this.driver = driver;
    }
    
    public void verifyPageTitle() {
    		
    		driver.findElement(NextButton).click();
    	
    }

}