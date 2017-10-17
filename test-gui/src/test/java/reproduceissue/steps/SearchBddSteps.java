package reproduceissue.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import reproduceissue.steps.serenity.SearchSteps;

/**
 * Created by mmanach on 09/08/2017.
 */

public class SearchBddSteps {

    @Steps
    private SearchSteps searchSteps;

    @Given("I am on google")
    public void iAmOnHomePage() {
        searchSteps.iAmOnHomePage();
    }

    @When("Fill search bar with $txt")
    public void fillSearchAndValidate(String txt) {
        searchSteps.fillSearchAndValidate(txt);
    }

    @Then("I should see the search button")
    public void checkHomePage() {
       searchSteps.checkButtonIsPresent();
    }
}