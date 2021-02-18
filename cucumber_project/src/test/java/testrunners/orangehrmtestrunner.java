package testrunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles",glue="stepdefinitions",dryRun=false,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/TestReport.html"})
public class orangehrmtestrunner
{

}
