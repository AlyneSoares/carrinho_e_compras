package path;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	private WebDriver driver;
	
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitModal() {	
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.spath("//*[@id='root']/div[2]/div[2]/div/div/div[1]")));	
	}

	public void addBrigadeiro() {
		WebElement addBrigadeiroButton = driver.findElement(By.xpath("//*[@id='add-product-4-btn']"));
		addBrigadeiroButton.click();		
	}

    public void addAlfajor() {
		WebElement addAlfajorButton = driver.findElement(By.xpath("//*[@id='add-product-5-btn']"));
		addAlfajorButton.click();		
    }
    
	public void addCoke() {
		WebElement addCokeButton = driver.findElement(By.xpath("//*[@id='add-product-0-btn']"));
		addCokeButton.click();		
	}

    public void addFanta() {
		WebElement addFantaButton = driver.findElement(By.xpath("//*[@id='add-product-1-btn']"));
		addFantaButton.click();		
    }
    
    public void addAgua() {
		WebElement addAguaButton = driver.findElement(By.xpath("//*[@id='add-product-2-btn']"));
		addAguaButton.click();		
    }
}