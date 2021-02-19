package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeAndDeepDOMPage;

public class LargeAndDeepDomTests extends BaseTests {


    @Test
    public void testScrollToTableWithJavaScript(){
        homePage.clickLargeAndDeepDOMPage().scrollToTable();
        System.out.println("444");
    }


}
