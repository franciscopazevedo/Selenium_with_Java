package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page {

    private WebDriver driver;
    //By startButton = By.tagName("button");
    By startButton = By.cssSelector("#start button");
    By loadingIndicator = By.id("loading");
    By finishText = By.id("finish");

    public Example1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
       driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.invisibilityOf( // wait until 7 seconds to loadingInicator disappear of the screen
                driver.findElement(loadingIndicator))); // if the condition fails the exception will be throw

        /* another way to do the same but with more detail and control
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(7)) // wait until 7 seconds
                .pollingEvery(Duration.ofSeconds(1)) // check the condition every second
                .ignoring(NoSuchElementException.class); //  ignores the exceptions of that type
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    */
    }


    public String getFinishText(){
        return driver.findElement(finishText).getText();
    }




}
