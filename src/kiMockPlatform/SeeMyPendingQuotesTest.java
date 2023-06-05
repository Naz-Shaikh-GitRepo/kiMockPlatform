package kiMockPlatform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeeMyPendingQuotesTest {
	
	private WebDriver driver;
    private KiMockPlatformPage1 KiMockPlatformPage1;
    private KiMockPlatformPage2 KiMockPlatformPage2;

    @BeforeMethod
    public void setUp() {
        BaseTest.setupDriver(); // If using WebDriverManager
        driver = new ChromeDriver(); // or new FirefoxDriver(), new EdgeDriver(), etc.
        driver.manage().window().maximize();
        KiMockPlatformPage1 = new KiMockPlatformPage1(driver);
        KiMockPlatformPage2 = new KiMockPlatformPage2(driver);
        
    }

    @Test
    //public void testLogin() 
    public void testSeeMyPendingQuotes() throws Exception{
        driver.get("https://forms.gle/eiiqRfHiRAiCXgPX7");
        KiMockPlatformPage1.clickSeeMyPendingQuoteButton();
        
        KiMockPlatformPage2.verifyPageTitle();
    	
    }

    //@AfterMethod
    //public void tearDown() {
      //  driver.quit();
    //}


}
