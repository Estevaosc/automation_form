package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/automated_test.feature", // Caminho para o arquivo .feature
        glue = "stepdefinitions", // Pacote das definições de etapa
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins para relatórios
)
public class TestRunner {
}