package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    WebDriver driver;
    private By emailField = By.id("email");
    private By sendEmailButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickSendEmailButton(){
        driver.findElement(sendEmailButton).click();
        EmailSentPage emailSentPage = new EmailSentPage(driver);
        return emailSentPage;
    }

}
