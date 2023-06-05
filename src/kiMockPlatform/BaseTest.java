package kiMockPlatform;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static void setupDriver() {
        WebDriverManager.chromedriver().setup();
        // or WebDriverManager.firefoxdriver().setup();
        // or WebDriverManager.edgedriver().setup();
        // or WebDriverManager.operadriver().setup();
        // ...add other browser options as needed
        
      
    }

}
