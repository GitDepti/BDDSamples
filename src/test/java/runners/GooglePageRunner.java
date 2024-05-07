package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src//test//resources//features//",
        glue= {"stepDefs"},
		dryRun= true,
		plugin= {"pretty",
				"html:target/reports/HtmlReport.html"},
		monochrome=true
		)
        
public class GooglePageRunner extends AbstractTestNGCucumberTests{
  
 
}
