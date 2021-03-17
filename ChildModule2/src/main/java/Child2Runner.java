import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources",
monochrome = true,
plugin = {"pretty", "json:target/Reports/ChildModule2.json"})

public class Child2Runner {

}
