package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDOMPage {


    private WebDriver driver;
    private By table = By.id("large-table");


    public LargeAndDeepDOMPage(WebDriver driver) {
    this.driver = driver;
    }

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        String scriptJS = "arguments[0].scrollIntoView();"; // JS code responsible for scrolling
        ((JavascriptExecutor)driver).executeScript(scriptJS,tableElement); // JS cast
    }

}
