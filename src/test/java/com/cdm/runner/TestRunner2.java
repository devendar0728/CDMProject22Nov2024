package com.cdm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(



		features = "src/test/resources/Features/EDGEDevicesLatest.feature",


		glue = { "com.cdm.Stepdefinations" },

		plugin = { "pretty", "json:target/cucumber-reports/Cucumber4.json",
				"junit:target/cucumber-reports/Cucumber4.xml", "html:target/cucumber-reports1.html",
				"html:target/SparkReport/Spark.html"

		}

)

public class TestRunner2 {

}
