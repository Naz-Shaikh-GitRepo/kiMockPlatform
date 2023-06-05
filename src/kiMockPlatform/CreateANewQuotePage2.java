package kiMockPlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateANewQuotePage2 {
	
	private WebDriver driver;
	
    private By dateFeild = By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/input");
    
    private By AUMValue = By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input");
    
    private By enterPremium = By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input");
    
    private By NextButton = By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div[2]/span/span");
    
    public CreateANewQuotePage2(WebDriver driver) {
        this.driver = driver;
    }
    
    
    public void enterDateFeild() {
    	
    	WebElement dateField1 = driver.findElement(dateFeild);
    	
    	dateField1.clear();

        // Enter the date
        String date = "04-06-2023"; // Replace with your desired date
        dateField1.sendKeys(date);
    	
    }
    
	public void enterAUMValue() {
		
		WebElement AUMValue1 = driver.findElement(AUMValue);
		
		AUMValue1.sendKeys("400");
		
	}
	
	public void enterPremium() {
		
		WebElement enterPremium1 = driver.findElement(enterPremium);
		
		enterPremium1.sendKeys("20");
		
	}
	
	public void clickNextButtonPage2() {
		
		WebElement nextButton = driver.findElement(NextButton);
    	
  	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].style.visibility='visible';", nextButton);
  
  	Actions actions = new Actions(driver);
      actions.moveToElement(nextButton).click().perform();
		
		
	}

}
