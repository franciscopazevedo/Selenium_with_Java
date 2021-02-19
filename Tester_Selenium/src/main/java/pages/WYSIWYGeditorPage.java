package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYGeditorPage {

    private WebDriver driver;
    private String editorIframe = "mce_0_ifr";
    private By textArea = By.id("tinymce");


    public WYSIWYGeditorPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToIframeEditorArea(){
        driver.switchTo().frame(editorIframe);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    private WebElement increaseIndentButtonElement(){
      WebElement button = driver.findElements(By.tagName("button")).get(14); // was to be like that because I couldn´t use valid xpath or cssSelecter
        return button;
    }

    public void clickMoveTextRigthButton(){
        increaseIndentButtonElement().click();
    }

    public String getText_TextEditorArea(){
        switchToIframeEditorArea();
       String resultText = driver.findElement(textArea).getText();
        switchToMainArea();
        return resultText;
    }

    public void clear_TextEditorArea(){
        switchToIframeEditorArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void write_TextEditorArea(String textAndMore){
        switchToIframeEditorArea();
        driver.findElement(textArea).sendKeys(textAndMore);
        switchToMainArea();
    }






}
