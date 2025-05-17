package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/feature",
glue = "stepdefinations", monochrome = true)

public class TestRunnerr extends AbstractTestNGCucumberTests {


}
