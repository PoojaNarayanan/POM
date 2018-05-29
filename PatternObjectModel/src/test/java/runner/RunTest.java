package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features=
   {"C:\\Users\\Harish Kumar\\Desktop\\PatternObjectModel\\PatternObjectModel\\src\\test\\java\\features\\CreateLead.feature"},glue= {"teststeps","pages"},tags= {"@smoke and @regression"},monochrome=true)

public class RunTest {

	
	
	
}
