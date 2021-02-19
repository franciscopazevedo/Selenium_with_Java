package multiple_windows;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NewWindowPage;

import static org.testng.Assert.*;

public class NewMultipleWindowsTests extends BaseTests {

    @Test
    public void testSwitchTab(){
        NewWindowPage newWindow= homePage.clickMultipleWindowsPage().clickHere_clickNewWindowPage();
        getWindowManager().switchToTab("New Window");
        assertEquals(newWindow.getTitleText(),"New Window","Wrong link.");
    }



}
