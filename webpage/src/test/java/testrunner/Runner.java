package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/stories",
dryRun = !true,
snippets = SnippetType.CAMELCASE, 
monochrome = true, 
glue = "stories", 
plugin = {"pretty", 
		"html:reports/results/cucumber-reports", 
		"json:reports/results.json", 
		"junit:reports/results.xml" })
		
public class Runner extends AbstractTestNGCucumberTests {

}
