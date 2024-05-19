package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "definitions"
)

public class TestRunner {
}
