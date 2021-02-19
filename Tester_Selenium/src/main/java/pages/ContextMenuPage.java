package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");
    private By titleContextMenu = By.tagName("h3");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rigthClickHotSpotArea(){
        WebElement hotSpotArea = driver.findElement(hotSpot);

        Actions actions = new Actions(driver);
        actions.contextClick(hotSpotArea).perform(); //contextClick will do a right Click
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void clickOkButtonAlert(){
        driver.switchTo().alert().accept();
    }

    public String getContextMenuTitle(){
        return driver.findElement(titleContextMenu).getText();
    }

}
