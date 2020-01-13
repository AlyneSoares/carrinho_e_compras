package path;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartContentPage {

	private WebDriver driver;

	public CartContentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void increaseBrigadeiro() {
		WebElement increaseBrigadeiroButton = driver.findElement(By.xpath("//*[@id='add-product-4-qtd']"));
		increaseBrigadeiroButton.click();		
	}

	public void increaseRissole() {
		WebElement increaseRissoleButton = driver.findElement(By.xpath("//*[@id='add-product-4-qtd']"));
		increaseRissoleButton.click();		
	}

	public void decreaseRissole() {
		WebElement decreaseRissoleButton = driver.findElement(By.xpath("//*[@id='remove-product-3-qtd']/span"));
		decreaseRissoleButton.click();		
	}

    public String cokePrice() {
		String cokePrice = driver.findElement(By.xpath("//*[@id='product-0-price']")).getText();
        return cokePrice;
    }

    public String fantaPrice() {
		String fantaPrice = driver.findElement(By.xpath("//*[@id='product-1-price']")).getText();
        return fantaPrice;
    }

    public String aguaPrice() {
		String aguaPrice = driver.findElement(By.xpath("//*[@id='product-2-price']")).getText();
        return aguaPrice;
    }
    
    public String rissolePrice() {
		String rissolePrice = driver.findElement(By.xpath("//*[@id='product-3-price']")).getText();
        return rissolePrice;
    }

    public String brigadeiroPrice() {
		String brigadeiroPrice = driver.findElement(By.xpath("//*[@id='product-4-price']")).getText();
        return brigadeiroPrice;
    }

    public String alfajorPrice() {
		String alfajorPrice = driver.findElement(By.xpath("//*[@id='product-5-price']")).getText();
        return alfajorPrice;
    }

    public String totalPrice() {
		String totalPrice = driver.findElement(By.xpath("//*[@id='price-total-checkout']")).getText();
        return totalPrice;
    }
    
    public String brigadeiroQuantity() {
		String brigadeiroQuantity = driver.findElement(By.xpath("//*[@id='product-4-qtd']")).getText();
        return brigadeiroQuantity;
    }

    public String rissoleQuantity() {
		String rissoleQuantity = driver.findElement(By.xpath("//*[@id='product-3-qtd']")).getText();
        return rissoleQuantity;
    }		

    public void clickCheckOut() {
        WebElement CheckOutButton = driver.findElement(By.xpath("//*[@id='finish-checkout-button']"));
		CheckOutButton.click();	
    }

    public String modalMessage() {
        WebElement modalMessage = driver.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div/h2"));
		return modalMessage.getText();
    }

    public void closeConfirmationModal() {
        WebElement closeConfirmationModal = driver.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div/button"));
		closeConfirmationModal.click();	
    }

}