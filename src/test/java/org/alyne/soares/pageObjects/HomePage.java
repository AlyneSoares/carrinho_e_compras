package org.alyne.soares.pageObjects;

import java.util.concurrent.TimeUnit;

import org.alyne.soares.infrastructure.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;       
 
	public HomePage(WebDriver driver) {   
        this.driver = SetUp.driver;
	}
	
	public void openHomePage() {
		driver.get("https://shopcart-challenge.4all.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
    
	public void selectCategoryTodos() {
		WebElement categoryDropdown  = driver.findElement(By.id("open-categories-btn"));
        categoryDropdown.click();
        WebElement subcategoryTodos =  driver.findElement(By.id("category-all"));
        subcategoryTodos.click();
    }      
    public void selectCategoryDoces() {
		WebElement categoryDropdown  = driver.findElement(By.id("open-categories-btn"));
        categoryDropdown.click();
        WebElement subcategoryDoces =  driver.findElement(By.id("category-1"));
        subcategoryDoces.click();        
    }
    
    public void selectCategoryBebidas() {
		WebElement categoryDropdown  = driver.findElement(By.id("open-categories-btn"));
        categoryDropdown.click();
        WebElement subcategoryBebida =  driver.findElement(By.id("category-0"));
        subcategoryBebida.click();
    }

    public void addBrigadeiro() {
		WebElement addBrigadeiroButton = driver.findElement(By.id("add-product-4-btn"));
        addBrigadeiroButton.click();	
        closeModal();       
    }     
    
    public void addAlfajor() {
        WebElement addAlfajorButton = driver.findElement(By.id("add-product-5-btn"));
        addAlfajorButton.click();
        closeModal();       
    }
    
    public void addCoke() {
        WebElement addCokeButton = driver.findElement(By.id("add-product-0-btn"));
        addCokeButton.click();	
        closeModal(); 	
    }

    public void addFanta() {
		WebElement addFantaButton = driver.findElement(By.id("add-product-1-btn"));
        addFantaButton.click();		
        closeModal(); 	
    }

    public void addAgua() {
		WebElement addAguaButton = driver.findElement(By.id("add-product-2-btn"));
        addAguaButton.click();	
        closeModal(); 	
    }

    public void addRissole() {
        WebElement addRissoleButton = driver.findElement(By.id("add-product-3-btn"));
        addRissoleButton.click();
        closeModal(); 
    }	  

    public void closeModal() {	
        WebElement modal = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div/div/div[1]"));
        WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.elementToBeClickable(modal));
        modal.click();        
    }
    
    public CartContentPage openCartPage() {
        WebElement cartButton = driver.findElement(By.id("cart-btn"));
        cartButton.click();
        return new CartContentPage();
    }
    
	public void closeBrowser() {
        driver.quit();
	}
}