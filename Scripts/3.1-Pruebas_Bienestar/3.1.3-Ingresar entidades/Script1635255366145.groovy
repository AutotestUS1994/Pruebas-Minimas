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

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt282j_idt29'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/a_menu'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/label_bienestar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/a_evento'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/a_Entidades'))

if (WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/a_US_form_entidadlistaEntidades0j_idt626'), 
    1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/a_US_form_entidadlistaEntidades0j_idt626'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/a_Aceptar'))
}

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/select_-- Seleccione --US'), 1)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Ingresar_Entidades/a_Entidades_form_entidadlistaEntidadesj_idt628'))

WebUI.closeBrowser()

