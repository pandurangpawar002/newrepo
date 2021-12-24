package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\MavenProject\\src\\main\\java\\feature", glue={"stepDefination"})
public class Runner {

	
}
