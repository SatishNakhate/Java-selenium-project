package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class Runnerfile {

	@CucumberOptions(features= "src/test/java/featuress", 
			glue = "stepdefin", monochrome = true)
			public class runnrfile extends AbstractTestNGCucumberTests {
				
				
				
	}
			
}
