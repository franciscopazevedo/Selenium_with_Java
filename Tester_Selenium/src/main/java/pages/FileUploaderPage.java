package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {

    private WebDriver driver;
    By uploadButton = By.id("file-submit");
    By inputField = By.id("file-upload");
    By uploadedFiles = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver) {
    this.driver = driver;
    }

    public void uploadFileAndClick(String absolutePathFile){
        driver.findElement(inputField).sendKeys(absolutePathFile);
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }


}
