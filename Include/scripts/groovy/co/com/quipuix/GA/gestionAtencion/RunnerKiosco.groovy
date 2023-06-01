package co.com.quipuix.GA.gestionAtencion

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(plugin=["pretty" ,
	"html:reportecucumber/cucumber.html" ,
	"json:reportecucumber/cucumber.json",
	"junit:reportecucumber/cucumber.xml"],
features = ["Include/features/GA/Gestion de la atencion/Kiosco.feature"],
glue = [""],
dryRun = false,
tags = ["@Kiosco"],
monochrome=false,
strict=true
)

public class RunnerKiosco {
}
