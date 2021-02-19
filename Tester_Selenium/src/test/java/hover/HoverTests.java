package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser0(){
        var hoversPage = homePage.clickHoversPage();
        var caption = hoversPage.hoverOverFigure(0);
        assertTrue(caption.isCaptionDisplay(), "Caption not displayed.");
        assertEquals(caption.getTitle(),"name: user1", "Title isn´t correct.");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link isn´t correct."); //if the link change we still okay
        assertEquals(caption.getLinkText(),"View profile","Link text isn´t correct");
    }



}
