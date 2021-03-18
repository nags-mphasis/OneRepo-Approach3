import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="${WORKSPACE}/ChildModule1/src/main/resources",
monochrome = true,
plugin = {"pretty", "json:target/Reports/ChildModule1.json"})

public class Child1Runner {

}
