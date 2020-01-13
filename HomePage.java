package *path*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;

	public HomePage() {
		System.setProperty("webdriver.chrome.driver", "path/chromedriver");
		driver = new ChromeDriver();
	}
	
	public void openHomePage() {
		driver.get("https://shopcart-challenge.4all.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.quit();
	}

	public TodosCategoryPage selectCategoryTodos() {
		WebElement categoryDropdown  = driver.findElement(By.xpath("//*[@id='open-categories-btn']/img"));
        WebElement subcategoryTodos =  driver.findElement(By.xpath("//*[@id='category-0']"));
        categoryDropdown.click();
        subcategoryTodos.click();
		return new homePage(driver);
    }      

    public DocesCategoryPage selectCategoryDoces() {
		WebElement categoryDropdown  = driver.findElement(By.xpath("//*[@id='open-categories-btn']/img"));
        WebElement subcategoryDoces =  driver.findElement(By.xpath("//*[@id='category-1']"));
        categoryDropdown.click();
        subcategoryDoces.click();
		return new docesCategoryPage(driver);
    }
        
	public BebidasCategoryPage selectCategoryBebidas() {
		WebElement categoryDropdown  = driver.findElement(By.xpath("//*[@id='open-categories-btn']/img"));
        WebElement subcategoryBebida =  driver.findElement(By.xpath("//*[@id='category-0']"));
        categoryDropdown.click();
        subcategoryBebida.click();
		return new bebidasCategoryPage(driver);
    }
 
	public CartContentPage openCartPage() {
		WebElement cartButton = driver.findElement(By.xpath("//*[@id='cart-btn']/img"));
		cartButton.click();
		return new CartContentPage(driver);
    }
    
    public void addRissole() {
        WebElement addRissoleButton = driver.findElement(By.xpath("//*[@id='add-product-3-btn']"));
        addRissoleButton.click();
    }

}