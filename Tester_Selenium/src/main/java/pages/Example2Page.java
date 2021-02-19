package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2Page {

    private WebDriver driver;
    By startButton = By.cssSelector("#start button");
    By finishText = By.id("finish");


    public Example2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.presenceOfElementLocated( //wait until 7 seconds to find element finishText
                finishText)); // if the condition fails the exception will be throw
    }

    public String getFinishText(){
        return driver.findElement(finishText).getText();
    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }
}
