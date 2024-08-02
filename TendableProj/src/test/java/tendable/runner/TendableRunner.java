package tendable.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
    features = ("src\\test\\resources\\feature"),
    glue = ("tendable.steps"),
    dryRun = false,
    		plugin = {
    		        "pretty", // Prints Gherkin source with additional colors and stack traces for errors
    		        "html:target/cucumber-reports/Tendable-cucumber-html-report.html", // HTML report
    		        "json:target/cucumber-reports/Tendable-addtochart-cucumber-report.json", // JSON report
    		        "junit:target/cucumber-reports/Tendable-addtochart-cucumber-report.xml" // JUnit XML report
    		    },
    monochrome = true
   
    		
)

public class TendableRunner {

}
