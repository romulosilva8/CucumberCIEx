package azulseguroscucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue = {"azulseguroscucumber"}, monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/Report.xml"}
)
public class TestRunner {

}
