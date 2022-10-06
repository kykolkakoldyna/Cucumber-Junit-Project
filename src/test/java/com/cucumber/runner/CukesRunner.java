package com.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-reports/CucumberTestReport.json"
        },
        features = "src/test/resources/features",
        glue = "com/cucumber/step_definitions",
        dryRun = false,
        tags = "@smoke",
        publish = true
)
public class CukesRunner {
}
