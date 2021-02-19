package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private WebDriver driver;


    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public NewWindowPage clickHere_clickNewWindowPage(){
        driver.findElement(By.linkText("Click Here")).click();
        NewWindowPage newWindowPage = new NewWindowPage(driver);
        return newWindowPage;
    }




}
