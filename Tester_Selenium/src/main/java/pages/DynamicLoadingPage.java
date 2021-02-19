package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1 = By.linkText("Example 1: Element on page that is hidden");
    private By example2 = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public Example1Page clickExample1Page(){
        driver.findElement(example1).click();
        Example1Page example1Page = new Example1Page(driver);
        return example1Page;
    }

    public Example2Page clickExample2Page(){
        driver.findElement(example2).click();
        Example2Page example2Page = new Example2Page(driver);
        return example2Page;
    }

    public Example2Page clickExample2Page_andOpenNewTab(){
       WebElement webElement = driver.findElement(example2);

       Actions actions = new Actions(driver);
       actions.keyDown(Keys.CONTROL).click(webElement).perform();

       Example2Page example2Page = new Example2Page(driver);
       return example2Page;

    }



}
