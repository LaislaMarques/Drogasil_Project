package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features/clientecadastrado.feature",
		glue = {""},
		monochrome = true,
		tags = "@CT01",
		plugin = {"pretty","html:target/cucumber-report.html"}
		
		
		
		
		)




public class Executa {

}
