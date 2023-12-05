package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\lokes\\eclipse-workspace\\DemoWebShop-CucumberTest1\\src\\test\\resources\\features\\Login8.feature", 
		
   				 glue= {"stepDefinition"},
                 plugin= {"html:target/Cucumberreport1.html","json:target/cucumber-reports/Cucumber.json"})

public class TestRunner {

}
