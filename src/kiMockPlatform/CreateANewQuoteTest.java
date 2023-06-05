package kiMockPlatform;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateANewQuoteTest {
	
	private WebDriver driver;
    private KiMockPlatformPage1 KiMockPlatformPage1;
    private CreateANewQuotePage1 CreateANewQuotePage1;
    private CreateANewQuotePage2 CreateANewQuotePage2;

    @BeforeMethod
    public void setUp() {
        BaseTest.setupDriver(); // If using WebDriverManager
        driver = new ChromeDriver(); // or new FirefoxDriver(), new EdgeDriver(), etc.
        driver.manage().window().maximize();
        KiMockPlatformPage1 = new KiMockPlatformPage1(driver);
        CreateANewQuotePage1 = new CreateANewQuotePage1(driver);
        CreateANewQuotePage2 = new CreateANewQuotePage2(driver);
        
    }

    @Test
    //public void testLogin() 
    public void verifyCreateANewQuote() throws Exception{
        driver.get("https://forms.gle/eiiqRfHiRAiCXgPX7");
        KiMockPlatformPage1.clickCreateNewQuoteButton();
                       
        CreateANewQuotePage1.clickClassOfBusiness();
        
        CreateANewQuotePage1.selectPrimaryInsured();  
        
        CreateANewQuotePage1.selectPrimaryCountry();
              
        CreateANewQuotePage1.clickNextButton();
        
        
        CreateANewQuotePage2.enterDateFeild();
        
        CreateANewQuotePage2.enterAUMValue();
        
        CreateANewQuotePage2.enterPremium();
        
        CreateANewQuotePage2.clickNextButtonPage2();
    	
    }

    //@AfterMethod
    //public void tearDown() {
      //  driver.quit();
    //}

}
