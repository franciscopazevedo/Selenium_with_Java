package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPressesPage();
        keyPage.writeText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getKeyPressed(),"You entered: BACK_SPACE","You entered the wrong key.");
    }


}
