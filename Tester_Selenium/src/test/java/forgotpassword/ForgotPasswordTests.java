package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public  void testRetrievePasswordSucess(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordPage();
        forgotPasswordPage.setEmailField("emailtest@test.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickSendEmailButton();
        assertEquals(emailSentPage.getMessageText(),"Your e-mail's been sent!", "Can´t retrieve email" );

    }


}
