package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Example1Page;
import static org.testng.Assert.*;

public class Example1Tests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        Example1Page example1Page = homePage.clickDynamicLoadingPage().clickExample1Page();

        example1Page.clickStartButton();
        assertEquals(example1Page.getFinishText(),"Hello World!","Example1 message is incorrect");


    }

}
