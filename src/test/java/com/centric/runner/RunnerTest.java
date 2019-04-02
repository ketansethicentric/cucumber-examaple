package com.centric.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "classpath:features", tags = { "@regression" }, glue = { "com.centric.steps" }, plugin = {
		"pretty" }, monochrome = true)

public class RunnerTest {

}
