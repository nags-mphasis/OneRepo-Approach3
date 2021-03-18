import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChildModule1 {
	
	@Given("ParentModule is compiled")
	public void parent_module_is_compiled() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("ParentModule compiled");
	}

	@And("built")
	public void built() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("ParentModule built");
	}

	@And("tested")
	public void tested() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("ParentModule tested");
	}

	@When("control falls into ChildModule1")
	public void control_falls_into_child_module1() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("ParentModule to ChildModule1");
	}

	@Then("run class files")
	public void run_class_files() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule1 executed");
	}

	@And("generate report")
	public void generate_report() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("ChildModule1 reported");
	}

}
