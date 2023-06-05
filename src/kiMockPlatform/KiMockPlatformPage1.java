package kiMockPlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KiMockPlatformPage1 {
	
	private WebDriver driver;
    private By SeeMyPendingQuoteButton = By.xpath("//div[@class='AB7Lab Id5V1']");
    private By CreateANewQuote = By.id("i10");
    private By NextButton = By.xpath("//span[@class='l4V7wb Fxmcue']");

    public KiMockPlatformPage1(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSeeMyPendingQuoteButton() {
        //driver.findElement(SeeMyPendingQuoteButton).click();
    	
    	WebElement seeMyPendingQuoteButtonRadio = driver.findElement(SeeMyPendingQuoteButton);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement SeeMyPendingQuoteButtonWait = wait.until(ExpectedConditions.elementToBeClickable(seeMyPendingQuoteButtonRadio));
    	
    	if(seeMyPendingQuoteButtonRadio.isDisplayed() && seeMyPendingQuoteButtonRadio.isEnabled()) {
    		
    		seeMyPendingQuoteButtonRadio.click();
    		
    	}
    	
    	
    	driver.findElement(NextButton).click();
        
    }
    
    public void clickCreateNewQuoteButton() throws Exception {
    	
    	WebElement CreateNewQuoteButtonRadio = driver.findElement(CreateANewQuote);
    	
    	WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement CreateNewQuoteButtonWait = wait.until(ExpectedConditions.elementToBeClickable(CreateNewQuoteButtonRadio));
    	
    	if(CreateNewQuoteButtonRadio.isDisplayed() && CreateNewQuoteButtonRadio.isEnabled()) {
    		
    		CreateNewQuoteButtonRadio.click();
    		
    		Thread.sleep(5000);
    		
    	}
    	
    	
    	driver.findElement(NextButton).click();
        
    }

}
