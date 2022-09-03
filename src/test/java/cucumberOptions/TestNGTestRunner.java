package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/", glue = "stepDefinitions", monochrome = true, tags ="@AddPrice")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	//@Override
	//@DataProvider(parallel = false)
	//public Object[][] scenarios() {
	//	return super.scenarios();
	//}

}
