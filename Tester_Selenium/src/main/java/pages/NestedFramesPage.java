package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By textLeftFrame = By.tagName("body");
    private By textBottomFrame = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchTo_LeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
    }

    private void switchTo_BottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }

    private void switchTo_TopFrameSinceLeftFrame(){
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    private void switchTo_TopFrameSinceBottomFrame(){
        driver.switchTo().parentFrame();
    }

    public String getTextInside_LeftFrame(){
        switchTo_LeftFrame();
        String resultText = driver.findElement(textLeftFrame).getText();
        switchTo_TopFrameSinceLeftFrame();
        return resultText;
    }

    public String getTextInside_BottomFrame(){
        switchTo_BottomFrame();
        String resultText = driver.findElement(textBottomFrame).getText();
        switchTo_TopFrameSinceBottomFrame();
        return resultText;
    }












}
