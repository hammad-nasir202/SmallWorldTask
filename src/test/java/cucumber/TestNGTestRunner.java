package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit

@CucumberOptions(features="src/test/java/cucumber",glue="smallworld.stepDefinitions"
)
//monochrome=false, tags = "@Login")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	
}
