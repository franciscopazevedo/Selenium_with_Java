package upload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploaderPage;
import static org.testng.Assert.*;


public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploaderPage fileUploaderPage = homePage.clickFileUploaderPage();
        fileUploaderPage.uploadFileAndClick("C:\\Users\\truai\\Desktop\\Codigo\\Tester_Selenium\\resources\\chromedriver.exe");
        assertEquals(fileUploaderPage.getUploadedFiles(),"chromedriver.exe","Uploaded is incorrect");
    }

}
