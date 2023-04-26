import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import javax.swing.*

String Result = ""

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Login_Seguridad/Login-Seguridad'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Empresa 1_form_templatej_idt24_input'), 
    'Conexiones')

WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/li_Conexiones'), 0)

WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/li_Conexiones'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Portal_conexion_formj_idt65'), 
    'aspirantes')

WebUI.sendKeys(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Portal_conexion_formj_idt65'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/span_aspirantes'))

filePath = WebUI.getAttribute(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Url_conexion_formpanelTabInformacionconexionUrl'), 
    'value')

println(filePath)

if ((filePath == 'jdbc/CompensacionDS') && (GlobalVariable.G_Identificador == 'wildfly')) {
    WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Url_conexion_formpanelTabInformacionconexionUrl'), 
        'java:/AspirantesDS')

	WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/a_Actualizar'))
	
} else if ((filePath == 'java:/AspirantesDS') && (GlobalVariable.G_Identificador == 'wildfly')) {
	
	WebUI.closeBrowser()
	/*
    WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Url_conexion_formpanelTabInformacionconexionUrl'), 
        'java:/CompensacionDS')

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/a_Actualizar'))

     Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))
	 
	if(Result == 'Se actualizo la Conexion correctamente') {
		WebUI.closeBrowser()
	}else {WebUI.acceptAlert()}*/
} else {
	
    WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Url_conexion_formpanelTabInformacionconexionUrl'), 
        'jdbc/AspirantesDS')

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/a_Actualizar'))
	/*
    WebUI.setText(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/input_Url_conexion_formpanelTabInformacionconexionUrl'), 
        'jdbc/CompensacionDS')

    WebUI.click(findTestObject('3-OBJECTS UTILIDADES/Configuracion_para_weblogic_gdbc/a_Actualizar'))

	Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))
	
	if(Result == 'Se actualizo la Conexion correctamente') {
		WebUI.closeBrowser()
	}else {WebUI.acceptAlert()}*/
	}

