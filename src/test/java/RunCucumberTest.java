import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by fabrice on 4/28/19.
 */
@RunWith(Cucumber.class)
@CucumberOptions(strict = true,features = "src/test/resources",monochrome = true,plugin = {"pretty", "json:target/cucumber.json"})
public class RunCucumberTest {
}
