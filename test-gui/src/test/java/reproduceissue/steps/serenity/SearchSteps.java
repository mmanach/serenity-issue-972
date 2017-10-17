package reproduceissue.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import reproduceissue.pages.SearchPage;

/**
 * Created by mmanach on 09/08/2017.
 */
public class SearchSteps extends ScenarioSteps {

    private SearchPage searchPage;

    @Step
    public void iAmOnHomePage() {
        searchPage.open();
    }

    @Step
    public void fillSearchAndValidate(String txt) {
        searchPage.fillSearchAndValidate(txt);
    }

    @Step
    public void checkButtonIsPresent() {
        Assert.assertEquals(true, searchPage.isButtonPresent());
    }
}