package kiMockPlatform;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateANewQuotePage1 {
	
	private WebDriver driver;
    //private By PrimaryCountry = By.xpath("//div[@jsname='LgbsSe']//span[text()='China']");
    private By PrimaryCountry = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]");
    
    //private By PrimaryCountry1 = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]");
  
    private By PrimaryInsured = By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]");
    
    private By ClassOfBusiness = By.id("i16");
    
    private By NextButton = By.xpath("//*[@id='mG61Hd']/div[2]/div/div[3]/div[1]/div[1]/div[2]/span/span");

    public CreateANewQuotePage1(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPrimaryCountry() throws InterruptedException {
    	
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         	
    	WebElement country = driver.findElement(PrimaryCountry);
    	//WebElement country1 = driver.findElement(PrimaryCountry1);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.visibility='visible';", country);

      
       Actions actions = new Actions(driver);
       actions.moveToElement(country).click().perform();
       
       Thread.sleep(2000);
        
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
      // Actions actions1 = new Actions(driver);
      actions.moveToElement(country).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
      
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("arguments[0].style.visibility='visible';", country);
      
      actions.moveToElement(country).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
      actions.moveToElement(country).click().perform();
        
        
      
          }
       
    	
    public void selectPrimaryInsured() throws Exception {	
    	
        WebElement insured = driver.findElement(PrimaryInsured);
    	
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.visibility='visible';", insured);

      
       Actions actions = new Actions(driver);
       actions.moveToElement(insured).click().perform();
       
       Thread.sleep(2000);
        
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
      // Actions actions1 = new Actions(driver);
      actions.moveToElement(insured).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
      
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("arguments[0].style.visibility='visible';", insured);
      
      actions.moveToElement(insured).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
      actions.moveToElement(insured).click().perform();

      

}
    public void clickClassOfBusiness() throws InterruptedException {
    	
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
        WebElement ClassOfBusinessRadioButton = driver.findElement(ClassOfBusiness);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement ClassOfBusinessRadioButtonWait = wait.until(ExpectedConditions.elementToBeClickable(ClassOfBusinessRadioButton));
    	
    	if(ClassOfBusinessRadioButton.isDisplayed() && ClassOfBusinessRadioButton.isEnabled()) {
    		
    		ClassOfBusinessRadioButtonWait.click();
    		
    		
    	
    }
}
    public void clickNextButton() {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	WebElement nextButton = driver.findElement(NextButton);
    	
    	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
          js1.executeScript("arguments[0].style.visibility='visible';", nextButton);
    
    	Actions actions = new Actions(driver);
        actions.moveToElement(nextButton).click().perform();
}
    }