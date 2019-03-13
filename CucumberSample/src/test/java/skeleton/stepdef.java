package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	
	@Given("^i have some cakes in my place$")
	public void i_have_some_cakes_in_my_place() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("cakes in my hand"); 
	}

	@When("^i ask my team to collecr it$")
	public void i_ask_my_team_to_collecr_it() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("team comes");
	}

	@Then("^my cakes disappear$")
	public void my_cakes_disappear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("cakes disapper");
	}

}
