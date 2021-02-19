package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class HomePage {

    private WebDriver driver;


    public  HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationPage(){
        clickLink("Form Authentication");
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }

    public DropdownPage clickDropdownPage(){
        clickLink("Dropdown");
        DropdownPage dropdownPage = new DropdownPage(driver);
        return dropdownPage;
    }

    public ForgotPasswordPage clickForgotPasswordPage(){
        clickLink("Forgot Password");
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        return forgotPasswordPage;
    }

    public HoversPage clickHoversPage(){
        clickLink("Hovers");
        HoversPage hoversPage = new HoversPage(driver);
        return hoversPage;
    }

    public KeyPressesPage clickKeyPressesPage(){
        clickLink("Key Presses");
        KeyPressesPage keyPressesPage = new KeyPressesPage(driver);
        return keyPressesPage;
    }

    public HorizontalSliderPage clickHorizontalSlidderPage(){
        clickLink("Horizontal Slider");
        HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage(driver);
        return horizontalSliderPage;
    }

    public JavaScriptAlertsPage clickJavaScriptAlertPage(){
        clickLink("JavaScript Alerts");
        JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
        return javaScriptAlertsPage;
    }

    public FileUploaderPage clickFileUploaderPage(){
        clickLink("File Upload");
        FileUploaderPage fileUploader = new FileUploaderPage(driver);
        return fileUploader;
    }

    public ContextMenuPage clickContextMenuPage(){
        clickLink("Context Menu");
        ContextMenuPage contextMenu = new ContextMenuPage(driver);
        return contextMenu;
    }

    public WYSIWYGeditorPage clickWYSIWYGEditorPage(){
        clickLink("WYSIWYG Editor");
        WYSIWYGeditorPage wysiwyGeditorPage = new WYSIWYGeditorPage(driver);
        return wysiwyGeditorPage;

    }

    public FramesPage clickFramesPage(){
        clickLink("Frames");
        FramesPage frames = new FramesPage(driver);
        return frames;
    }

    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage(driver);
        return dynamicLoadingPage;
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOMPage(){
        clickLink("Large & Deep DOM");
        LargeAndDeepDOMPage largeAndDeepDOMPage = new LargeAndDeepDOMPage(driver);
        return largeAndDeepDOMPage;
    }

    public InfiniteScrollPage clickInfiniteScrollPage(){
        clickLink("Infinite Scroll");
        InfiniteScrollPage infiniteScrollPage = new InfiniteScrollPage(driver);
        return infiniteScrollPage;
    }

    public MultipleWindowsPage clickMultipleWindowsPage(){
        clickLink("Multiple Windows");
        MultipleWindowsPage multipleWindowsPage = new MultipleWindowsPage(driver);
        return multipleWindowsPage;
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}



