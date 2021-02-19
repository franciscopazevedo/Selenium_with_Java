package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGeditorPage;
import static org.testng.Assert.*;

public class WYSIWYGeditorTests extends BaseTests {


    @Test
    public void testWysiwygFrame(){
        WYSIWYGeditorPage wysiwyGeditorPage = homePage.clickWYSIWYGEditorPage();

        String text1 = "Look";
        String text2 = "the Moon!";

        wysiwyGeditorPage.clear_TextEditorArea();
        wysiwyGeditorPage.write_TextEditorArea(text1);
        wysiwyGeditorPage.clickMoveTextRigthButton();
        wysiwyGeditorPage.write_TextEditorArea(text2);

        assertEquals(wysiwyGeditorPage.getText_TextEditorArea(),text1+text2,"Text Message is incorrect");

    }


}
