package com.cdm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

//features = "src/test/resources/Features/EDGEDevicesLatest.feature",
		// features = "src/test/resources/Features/Dashboard.feature",
		// features = "src/test/resources/Features/Reports.feature",
		// features = "src/test/resources/Features/Deployments.feature",
		// features = "src/test/resources/Features/AppGroups.feature",
		//features = "src/test/resources/Features/Configurations.feature",
				//features = "src/test/resources/Features/About.feature",
						//features = "src/test/resources/Features/Certificates.feature",
						
								//features = "src/test/resources/Features/Notifications.feature",
								
										//features = "src/test/resources/Features/EdgeGroupsNew.feature",
												features = "src/test/resources/Features/Apps.feature",

		glue = { "com.cdm.StepDefinations" }

)

public class TestRunner {

}
