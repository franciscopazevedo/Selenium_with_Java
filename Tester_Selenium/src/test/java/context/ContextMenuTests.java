package context;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRigthClickAndAlert(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.rigthClickHotSpotArea();
        assertEquals(contextMenuPage.getAlertText(),"You selected a context menu","Incorrect Alert Text.");
        contextMenuPage.clickOkButtonAlert();
        assertEquals(contextMenuPage.getContextMenuTitle(),"Context Menu","Ok buttun inside Alert is not working!.");
    }


}
