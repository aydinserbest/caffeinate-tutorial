package caffeinateme;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderCoffeeSteps {
    @Given("Cathy is {int} meters from the coffee shop")
    public void cathy_is_n_meters_from_the_coffee_shop(int distanceInMeters) {
        Customer cathy = new Customer();
        cathy.setDistanceFromShop(distanceInMeters);
    }
    @When("Cathy orders a large cappuccino")
    public void cathy_orders_a_large_cappuccino() {

    }
    @Then("Barry should receive the order")
    public void barry_should_receive_the_order() {

    }
    @Then("Barry should know that the coffee is Urgent")
    public void barry_should_know_that_the_coffee_is_urgent() {

    }
}
