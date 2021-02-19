package javascript;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class InfiniteScrollTests extends BaseTests {

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
        System.out.println("5s");
    }



}
