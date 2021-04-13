package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utilities.CommonOps;

import java.util.List;

public class Verifications extends CommonOps {

    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertEquals(elem.getText(), expected);
    }

    public static void numberOfElements(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        Assert.assertEquals(elems.size(), expected);
    }

    public static void visibilityOfElements(List<WebElement> elems){
        for (WebElement elem: elems) {
            softAssert.assertTrue(elem.isDisplayed(), "Sorry " + elem.getText() + " not displayed");
        }
        softAssert.assertAll("Some elements were not displayed");
    }



}
