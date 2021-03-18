import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChildModule2 {
	
	@Given("ChildModule1 is compiled")
	public void child_module1_is_compiled() {
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule1 compiled");
	}

	@And("built")
	public void built() {
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule1 built");
	}

	@And("tested")
	public void tested() {
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule1 tested");
	}

	@When("control falls into ChildModule2")
	public void control_falls_into_child_module2() {
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule1 to ChildModule2");
	}

	@Then("run class files")
	public void run_class_files() {
	    // Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule2 executed");
	}

	@And("generate report")
	public void generate_report() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule2 reported");
	}

}
