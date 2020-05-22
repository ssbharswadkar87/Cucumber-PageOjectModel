package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// path of the .feature file
		features = "C:\\Users\\Dell\\eclipse-workspace\\CucumberPageObjectModelProject\\src\\main\\java\\feature\\registration.feature",

		// Step Defination package name or path
		glue = {"stepDefinition"},

		// to check mapping is propper between .feature file and step defination file
		dryRun = false,

		// it will check if any step is not defined in step defination file
		 strict = true,

		// Display console tab output in redable format
		monochrome = true,

		// pretty means format is in pretty look.
		// html:test-output html means report generate in HTML format and test-output
		// means it will generate report in test-output folder (index.html file)
		// json:json-output/cucumber.json json format report and json-output is folder
		// and cucumber.json is file
		// junit:junit_xml/cucumber.xml juni is format and junit_xml is folder and
		// cucumber.xml is file
		// format = {"pretty", "html:test-output"}
		format = { "pretty", "html:test-output"})

public class RunCode {

}
