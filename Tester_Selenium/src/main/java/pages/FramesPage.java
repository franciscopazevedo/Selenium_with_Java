package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class FramesPage {

    private WebDriver driver;
    private By nestedFrames = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesPage(){
       driver.findElement(nestedFrames).click();

        NestedFramesPage nestedFramesPage = new NestedFramesPage(driver);
        return nestedFramesPage;
    }





}
