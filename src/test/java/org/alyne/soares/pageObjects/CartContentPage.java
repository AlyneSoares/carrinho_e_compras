package org.alyne.soares.pageObjects;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartContentPage {

    private WebDriver driver;
    
	public CartContentPage(WebDriver driver) {        
        this.driver = driver;
    }
    
    public CartContentPage(){       
    }

	public void increaseBrigadeiro(int qnt) {
        WebElement increaseBrigadeiroButton = driver.findElement(By.id("add-product-4-qtd"));
        for (int i = 0; i < qnt; i++){ 
            increaseBrigadeiroButton.click();
        }		
	}

    public void increaseRissole(int qnt) {
        WebElement increaseRissoleButton = driver.findElement(By.id("add-product-3-qtd"));
        for (int i = 0; i < qnt; i++){
            increaseRissoleButton.click();		
        }
    }
    
    public void decreaseRissole(int qnt) {
        WebElement decreaseRissoleButton = driver.findElement(By.id("remove-product-3-qtd"));
        for (int i = 0; i < qnt; i++){
            decreaseRissoleButton.click();
        }		
    }

    public void clickCheckOut() {
        WebElement CheckOutButton = driver.findElement(By.id("finish-checkout-button"));
		CheckOutButton.click();	
    }

    public void closeConfirmationModal() {
        WebElement closeConfirmationModal = driver.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div/button"));
		closeConfirmationModal.click();	
    }

    public String modalMessage() {
        WebElement modalMessage = driver.findElement(By.xpath("//*[@id='root']/div[3]/div/div/div/h2"));
        return modalMessage.getText();
    }

    public Double cokeTotalPrice() {
        Double price = getCokePrice();
        Double quantity = getCokeQuantity();    
        Double cokeTotalPrice = quantity * price;
        return cokeTotalPrice;
    }

    private Double getCokePrice() {
        String cokePrice = driver.findElement(By.id("product-0-price")).getText();
        String cleanedNumber = cokePrice.replaceAll(",", ".").replaceAll(Pattern.quote("R$ "),"");
        Double price = Double.parseDouble(cleanedNumber);
        return price;
    }

    private Double getCokeQuantity(){
        String cokeQuantity = driver.findElement(By.id("product-0-qtd")).getText();
        Double quantity = Double.parseDouble(cokeQuantity);
        return quantity;
    }

    public Double fantaTotalPrice() {
        Double price = getFantaPrice();
        Double quantity = getFantaQuantity();    
        Double fantaTotalPrice = quantity * price;
        return fantaTotalPrice;
    }

    private Double getFantaPrice() {
        String fantaPrice = driver.findElement(By.id("product-1-price")).getText();
        String cleanedNumber = fantaPrice.replaceAll(",", ".").replaceAll(Pattern.quote("R$ "),"");
        Double price = Double.parseDouble(cleanedNumber);
        return price;
    }

    private Double getFantaQuantity(){
        String fantaQuantity = driver.findElement(By.id("product-1-qtd")).getText();
        Double quantity = Double.parseDouble(fantaQuantity);
        return quantity;
    }

    public Double aguaTotalPrice() {
        Double price = getAguaPrice();
        Double quantity = getAguaQuantity();    
        Double aguaTotalPrice = quantity * price;
        return aguaTotalPrice;
    }

    private Double getAguaPrice() {
        String aguaPrice = driver.findElement(By.id("product-2-price")).getText();
        String cleanedNumber = aguaPrice.replaceAll(",", ".").replaceAll(Pattern.quote("R$ "),"");
        Double price = Double.parseDouble(cleanedNumber);
        return price;
    }

    private Double getAguaQuantity(){
        String aguaQuantity = driver.findElement(By.id("product-2-qtd")).getText();
        Double quantity = Double.parseDouble(aguaQuantity);
        return quantity;
    }
    
    public Double rissoleTotalPrice() {
        Double price = getRissolePrice();
        Double quantity = getRissoleQuantity();    
        Double rissoleTotalPrice = quantity * price;
        return rissoleTotalPrice;
    }

    private Double getRissolePrice() {
        String rissolePrice = driver.findElement(By.id("product-3-price")).getText();
        String cleanedNumber = rissolePrice.replaceAll(",", ".").replaceAll(Pattern.quote("R$ "),"");
        Double price = Double.parseDouble(cleanedNumber);
        return price;
    }

    private Double getRissoleQuantity(){
        String rissoleQuantity = driver.findElement(By.id("product-3-qtd")).getText();
        Double quantity = Double.parseDouble(rissoleQuantity);
        return quantity;
    }
    
    public Double totalPrice() {
        String totalPriceStr = driver.findElement(By.id("price-total-checkout")).getText();          
        String cleanedNumber = totalPriceStr.replaceAll(",", ".").replaceAll(Pattern.quote("R$ "),"");      
        Double totalPrice = Double.parseDouble(cleanedNumber);
        return totalPrice;
    }

}