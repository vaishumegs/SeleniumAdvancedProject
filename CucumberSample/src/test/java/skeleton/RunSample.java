package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber-report"},monochrome=true)


public class RunSample {

}
