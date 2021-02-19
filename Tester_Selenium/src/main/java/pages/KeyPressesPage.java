package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultKeyPressed = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void writeText(String key){
        driver.findElement(inputField).sendKeys(key);
    }

    public String getKeyPressed(){
        WebElement resultElementKeyPressed = driver.findElement(resultKeyPressed);
    return  resultElementKeyPressed.getText();
    }


}
