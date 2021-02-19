package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");



    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    // Alert Button
    public void clickTriggerAlertButton(){
    driver.findElement(triggerAlertButton).click();

    }

    // Confirm Button
    public void clickTriggerConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }

    // Prompt Button
    public void clickTriggerPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }

    public void writeTextPromptAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    // general
    public String getResult(){
        return driver.findElement(result).getText();
    }

    public String alert_getMessage(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickOk(){
        driver.switchTo().alert().accept(); //o switchTo() will change the context because alert is not a new page but doesn´t belong to JavaSriptAlerts either.
    }

    public void alert_clickCancel(){
        driver.switchTo().alert().dismiss();
    }

}
