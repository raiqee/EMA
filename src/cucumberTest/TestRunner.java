package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		//features = "Feature/Parent_Registration.feature"
		,tags={"@AR"}
		,glue={"stepDefinition"}
		,monochrome = true
		,format={"junit:reports/xml/reports.xml", "pretty", "html:reports/html", "json:reports/json/cucumber.json"}
		)

public class TestRunner {

	}
