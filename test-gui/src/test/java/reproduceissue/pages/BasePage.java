package reproduceissue.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by mmanach on 09/08/2017.
 */
public class BasePage extends PageObject{

    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public void waitAndSend(WebElement webElement, CharSequence keysToSend){
        waitFor(webElement);
        webElement.sendKeys(keysToSend);
    }
}