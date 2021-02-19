package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {


    @Test
    public void sliderUp4(){
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlidderPage();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getSliderValue(),value,"Slider value is incorrect.");

    }



}
