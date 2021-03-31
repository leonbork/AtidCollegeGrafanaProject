package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

public class UIActions extends CommonOps {

    public static void click(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    public static void updateText(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    public static void updateDropDown(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropdown = new Select(elem);
        dropdown.selectByVisibleText(text);
    }

    public static void mouseHover(WebElement elem1, WebElement elem2){
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

}
