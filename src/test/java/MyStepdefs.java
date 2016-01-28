import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by markwinspear on 28/01/2016.
 */
public class MyStepdefs {
    @Steps
    String a;

    @Given("^I want to buy a wool scarf$")
    public void i_want_to_buy_a_wool_scarf() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I search for items containing 'wool'$")
    public void i_search_for_items_containing_wool() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should only see items related to 'wool'$")
    public void i_should_only_see_items_related_to_wool() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
