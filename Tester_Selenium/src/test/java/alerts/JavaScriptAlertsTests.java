package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;
import static org.testng.Assert.*;

public class JavaScriptAlertsTests extends BaseTests {




    @Test
    public void testAlertButton(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertPage();
        javaScriptAlertsPage.clickTriggerAlertButton();

        // message checking and consequently if the alert is open
        String messageText = javaScriptAlertsPage.alert_getMessage();
        assertEquals(messageText,"I am a JS Alert","Alert Message is incorrect.");

        //click checking and consequently if the alert is close
        javaScriptAlertsPage.alert_clickOk();
        String result = javaScriptAlertsPage.getResult();
        assertEquals(result,"You successfully clicked an alert","Result Alert Message is incorrect.");
    }

    @Test
    public void testConfirmButtonWithOkButton(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertPage();
        javaScriptAlertsPage.clickTriggerConfirmButton();

        // message checking and consequently if the alert is open
        String messageText = javaScriptAlertsPage.alert_getMessage();
        assertEquals(messageText,"I am a JS Confirm","Confirm Message is incorrect.");

        //ok click checking and consequently if the alert is close
        javaScriptAlertsPage.alert_clickOk();
        String result = javaScriptAlertsPage.getResult();
        assertEquals(result,"You clicked: Ok","Result Confirm Message is incorrect.");
    }

    @Test
    public void testConfirmButtonWithCancelButton(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertPage();
        javaScriptAlertsPage.clickTriggerConfirmButton();

        //Cancel click checking and result
        javaScriptAlertsPage.alert_clickCancel();
        String result = javaScriptAlertsPage.getResult();
        assertEquals(result,"You clicked: Cancel","Result Confirm Message is incorrect.");
    }

    @Test
    public void testPromptWithTextAndOkButton(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertPage();
        javaScriptAlertsPage.clickTriggerPromptButton();

        // message checking and consequently if the alert is open
        String messageText = javaScriptAlertsPage.alert_getMessage();
        assertEquals(messageText,"I am a JS prompt","Prompt Message is incorrect.");

        //for text
        String text = "Look the Moon!";
        javaScriptAlertsPage.writeTextPromptAlert(text);

        //Ok click checking and result, consequently if the alert is close
        javaScriptAlertsPage.alert_clickOk();
        String result = javaScriptAlertsPage.getResult();
        assertTrue((result.contains("You entered:"))&&(result.contains(text)),"Result Prompt Message is incorrect.");
        //was to be with && condition because the space with empty String or with text is different
    }

    @Test
    public void testPromptButtonWithCancelButton(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertPage();
        javaScriptAlertsPage.clickTriggerPromptButton();

        //Cancel click checking and result
        javaScriptAlertsPage.alert_clickCancel();
        String result = javaScriptAlertsPage.getResult();
        assertEquals(result,"You entered: null","Result Prompt Message is incorrect.");
    }

/*
     -- was nice but we can´t use, because inside of the same method we ask always a new javaScriptAlertsPage()

    public JavaScriptAlertsPage javaScriptAlertsPage(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertPage();
        return javaScriptAlertsPage;
    }

    public String messageText(){
        String messageText = javaScriptAlertsPage().alert_getMessage();
        return messageText;
    }

    public String clickOkandGetResult(){
        javaScriptAlertsPage().alert_clickOk();
        String result = javaScriptAlertsPage().getResult();
        return result;
    }
    */

}
