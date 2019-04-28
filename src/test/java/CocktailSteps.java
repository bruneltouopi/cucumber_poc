/**
 * Created by fabrice on 4/28/19.
 */

import com.fabrice.model.Order;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import java.util.List;

public class CocktailSteps {
    private Order order;
    @Given("(.*) who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String romeo) {
        // Write code here that turns the phrase above into concrete actions
        order = new Order();
        order.declareOwner(romeo);
    }
    @When("an order is declared for (.*)")
    public void an_order_is_declared_for_Juliette(String juliette) {
        // Write code here that turns the phrase above into concrete actions
        order.declareTarget(juliette);
    }
    @Then("there is (\\d+) cocktails in the order")
    public void there_is_no_cocktail_in_the_order(int nbCocktails) {
        // Write code here that turns the phrase above into concrete actions
        List<String> cocktails =  order.getCocktails();

        assertEquals(nbCocktails, cocktails.size());
    }
    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        // Write code here that turns the phrase above into concrete actions
        order.withMessage(message);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String message) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(message,order.getTicketMessage());
    }

}