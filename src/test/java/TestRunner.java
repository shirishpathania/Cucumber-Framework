import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature"
        ,glue={"src/test/java/StepDefinitions"}
)

public class TestRunner {

}
