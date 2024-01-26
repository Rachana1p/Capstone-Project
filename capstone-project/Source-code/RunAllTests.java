package runner;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "C:\\Users\\INDIA\\eclipse-workspace\\ATE-Phase3-RestAssured\\src\\test\\java\\features\\CourseEndProject.feature",
	    glue = {"steps"},
	    plugin = {"pretty", "html:target/cucumber-reports"}
	)
	public class RunAllTests {
	}