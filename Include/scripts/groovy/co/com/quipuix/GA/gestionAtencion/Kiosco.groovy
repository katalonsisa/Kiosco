package co.com.quipuix.GA.gestionAtencion;

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords; 

import cucumber.api.java.ast.Y;
import cucumber.api.java.en_lol.WEN;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import internal.GlobalVariable;
import util.utilsQX;

public class Kiosco {



	//------------------- @Dado
	@Dado("que solicito un turno y ingreso un documento en el kiosco")
	public void que_solicito_un_turno_y_ingreso_un_documento_en_el_kiosco() {
		WebUiBuiltInKeywords.switchToWindowIndex(1);
		WebUiBuiltInKeywords.delay((int) GlobalVariable.delay);
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Button_turno"));
		//String currentPage = WebUiBuiltInKeywords.getUrl()
		//int currentTab = WebUiBuiltInKeywords.getWindowIndex()
		//WebUiBuiltInKeywords.selectOptionByValue(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Select_tipoDocumento"), "number:2", false);
		WebUiBuiltInKeywords.setText(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Input_Documento"), utilsQX.GenerateNIT(2));
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Button_continuar"));
	}



	@Dado("que ingreso al portal de GA")
	public void que_ingreso_al_portal_de_GA() {
		WebUiBuiltInKeywords.openBrowser((String) GlobalVariable.urlGA);
		WebUiBuiltInKeywords.maximizeWindow();
		WebUiBuiltInKeywords.setText(findTestObject("Object Repository/GA/Login/Input_username"), GlobalVariable.UserGADefaul.toString());
		WebUiBuiltInKeywords.setText(findTestObject("Object Repository/GA/Login/input_password"), GlobalVariable.PasswordGADefaul.toString());
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Login/Button_Ingresar"));
	}




	//----------------- @Cuando
	@Cuando("el sistema me pida el tipo de servicio seleccion (.*)")
	public void el_sistema_me_pida_el_tipo_de_servicio_selecion_solicitar(String tipo) {
		
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Button_Persona"))
		if(tipo.equals("Solicitar paz y salvo")) {
			WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Div_PazYSalvo"));
		}
		if(tipo.equals("Solicitar liquidación")) {
			WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Div_Liquidacion"));
		}
		if(tipo.equals("Consulta estado de cuenta")) {
			WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Div_EstadoCuenta"));
		}
	}

	@Entonces("solicito el turno")
	public void solicito_el_turno() {
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/GA/Gestion de la atencion/Kiosco/Button_continuar"));
	}



	//-----------------------@Y
	@Y("selecciono la opcion (.*) del modulo (.*)")
	public void selecciono_la_opcion (String opcion , String modulo ){
		WebUiBuiltInKeywords.delay((int) GlobalVariable.shortDelay);
		Robot rob = new Robot();
		WebUiBuiltInKeywords.mouseOver(findTestObject("Object Repository/generalObjects/menu/div_menuOpciones"));
		WebUiBuiltInKeywords.delay((int) GlobalVariable.shortDelay)
		rob.keyPress(KeyEvent.VK_LEFT)
		WebUiBuiltInKeywords.delay((int) GlobalVariable.shortDelay);
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/generalObjects/menu/a_opcionModulo",["opcion": modulo.trim()]));//, );
		WebUiBuiltInKeywords.delay((int)GlobalVariable.shortDelay);
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/generalObjects/menu/a_opcionModulo", ["opcion": opcion.trim()]));
		WebUiBuiltInKeywords.click(findTestObject("Object Repository/generalObjects/menu/a_opcionModulo", ["opcion": modulo.trim() ]),FailureHandling.OPTIONAL);
		WebUiBuiltInKeywords.delay(GlobalVariable.shortDelay);
		WebUiBuiltInKeywords.mouseOver(findTestObject("Object Repository/generalObjects/menu/div_desOver"),FailureHandling.OPTIONAL);
	}
}
