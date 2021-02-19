package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Example2Page;
import static org.testng.Assert.*;


public class Example2Tests extends BaseTests {

    @Test
    public void testWaitUntilRenderAfterSomething(){
        Example2Page example2Page = homePage.clickDynamicLoadingPage().clickExample2Page();

        example2Page.clickStartButton();
        assertEquals(example2Page.getFinishText(),"Hello World!","Example1 message is incorrect");


    }


}
