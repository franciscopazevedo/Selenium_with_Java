package multiple_windows;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Example2Page;
import static org.testng.Assert.*;


public class WindowsTests extends BaseTests {

    @Test
    public void testWindow(){
        Example2Page example2Page = homePage.clickDynamicLoadingPage().clickExample2Page_andOpenNewTab();

        getWindowManager().switchToNewTab();

        assertTrue(example2Page.isStartButtonDisplayed(),"Start button is nt displayed");
    }

}
