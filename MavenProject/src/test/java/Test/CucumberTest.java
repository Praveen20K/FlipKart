package Test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="./src/test/java/Feature/ebay.feature", glue="methods", monochrome = true, snippets= SnippetType.CAMELCASE)

public class CucumberTest extends AbstractTestNGCucumberTests {

}
