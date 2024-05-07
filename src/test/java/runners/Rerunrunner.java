package runners;

import io.cucumber.testng.CucumberOptions;

public class Rerunrunner {
	@CucumberOptions(
			features="@target//FailedScenarios.txt",
			glue= {"stepDefs"},
			monochrome=true,
			plugin= {"pretty"},
					
			)
			
}
