package reproduceissue.steps;

/**
 * Created by mmanach on 21/08/2017.
 */

import net.thucydides.core.steps.StepEventBus;
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reproduceissue.pages.BasePage;

public class UICommonSteps {

    private static final Logger logger = LoggerFactory.getLogger(UICommonSteps.class);

    private BasePage basePage;

    @BeforeScenario
    public void checkConfiguration() throws Exception {
        logger.info("____________________BEFORE SCENARIO___________________ ");
    }

    @AfterScenario(uponOutcome=AfterScenario.Outcome.ANY)
    public void checkErrorNotification()  {
        // Once a test fails, the WebDriver instance is disabled and any subsequent calls to the WebDriver instance are ignored.
        // If you want to "reactivate" the driver, we need to use :
        StepEventBus.getEventBus().clearStepFailures();
        logger.info("____________________AFTER SCENARIO___________________ ");
    }

}
