package reproduceissue.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by mmanach on 09/08/2017.
 */
public class SearchPage extends BasePage{

    private static final Logger logger = LoggerFactory.getLogger(SearchPage.class);

    @FindBy(id="lst-ib")
    private WebElement search;

    @FindBy(css=".jhp input[type=\"submit\"]")
    private WebElement submit;

    public void fillSearchAndValidate(String txt){
        waitFor(search);
        waitAndSend(search, txt);
    }

    public boolean isButtonPresent(){
        waitFor(submit);
        return submit.isDisplayed();
    }
}