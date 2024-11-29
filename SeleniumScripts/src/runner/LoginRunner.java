package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\SeleniumTheoryMay\\SeleniumScripts\\src\\feature\\Login.feature",
                         glue="stepdefination",monochrome=true,
                         plugin= {"pretty","json:Target/Orange/LoginRes.json"})
public class LoginRunner 
{

}
