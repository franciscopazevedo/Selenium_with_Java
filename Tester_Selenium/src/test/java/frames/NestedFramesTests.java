package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;
import static org.testng.Assert.*;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testTextInsideLeftAndBottomFrames(){
        NestedFramesPage nestedFramesPage = homePage.clickFramesPage().clickNestedFramesPage();

        assertTrue((nestedFramesPage.getTextInside_LeftFrame()).contains("LEFT"),"Text inside LeftFrame is incorrect.");

        assertTrue((nestedFramesPage.getTextInside_BottomFrame()).contains("BOTTOM"),"Text inside BottomFrame is incorrect.");


    }

}
