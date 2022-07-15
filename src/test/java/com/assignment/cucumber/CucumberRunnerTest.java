
package com.assignment.cucumber;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= "src/test/resources/feature",
		glue={"com.assignment.step", "com.assignment.cucumber"},
		//tags= {"@Test"},
		/*plugin = {"pretty", "json:target/reports/index.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/reports/index.html" */
				
				plugin = {"pretty",
						"html:target/html/",
						"json:target/json/file.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
		)

public class CucumberRunnerTest {
	
	

}
