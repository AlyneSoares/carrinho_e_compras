package org.alyne.soares.infrastructure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SetUp {

    public static WebDriver driver;

    public void setWebDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alyne_Soares\\source\\Workspaces\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alyne_Soares\\source\\Workspaces\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Alyne_Soares\\source\\Workspaces\\msedgedriver.exe");

        String browser = System.getProperty("browser");
        if (browser == null) {
             browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}
