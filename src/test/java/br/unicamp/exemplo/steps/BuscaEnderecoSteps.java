package br.unicamp.exemplo.steps;


import br.unicamp.exemplo.InterfaceCorreio;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaEnderecoSteps {

    private InterfaceCorreio correio;
    private Throwable throwable;

    @Given("^I am a valid Correios user$")
    public void i_am_a_valid_Correios_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Correios knows about the following adress:$")
    public void correios_knows_about_the_following_adress(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @When("^I send a GET request for \"([^\"]*)\"$")
    public void i_send_a_GET_request_for(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the response should be JSON:$")
    public void the_response_should_be_JSON(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Correios has the following error messages:$")
    public void correios_has_the_following_error_messages(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }



}