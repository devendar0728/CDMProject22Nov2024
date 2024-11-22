package com.cdm.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		// features = "src/test/resources/Features/Login.feature",
		// features = "src/test/resources/Features/GenearlTab.feature",

		//features = "src/test/resources/Features/Dashboard.feature",
		 //features = "src/test/resources/Features/EDGEGroupsNew.feature",

		features = "src/test/resources/NewFeatures/EDGEDevicesLatest.feature",

		//features = "src/test/resources/Features/Deployments.feature",

		//features = "src/test/resources/Features/ConfigurationsNew.feature",

		//features = "src/test/resources/Features/Licenses.feature",

		// features = "src/test/resources/Features/AppGroupsNew.feature",

		// features = "src/test/resources/Features/Reports.feature",

		//features = "src/test/resources/Features/Users.feature",

		// features = "src/test/resources/Features/UserGroups.feature",

		// features = "src/test/resources/Features/UserRoles.feature",

		// features = "src/test/resources/Features/Notifications.feature",

		//features = "src/test/resources/Features/hardware.feature",

		// features = "src/test/resources/Features/Volumes.feature",

		// features = "src/test/resources/Features/Repositories.feature",

		//features = "src/test/resources/Features/Apps.feature",

		//features = "src/test/resources/Features/Wells.feature",

		// features = "src/test/resources/Features/certificates.feature",

		//features = "src/test/resources/Features/About.feature",

		glue = { "com.cdm.Stepdefinations", "com.cdm.Stepdefinations.New" },

 plugin = {"html:target/SparkReport/Spark.html"
  }

)

public class TestRunner {

}
