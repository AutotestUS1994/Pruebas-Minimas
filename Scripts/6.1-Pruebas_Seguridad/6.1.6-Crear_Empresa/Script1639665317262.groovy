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

WebUI.callTestCase(findTestCase('Hutilidades/Login_Seguridad/Login-Seguridad'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Empresa')

WebUI.click(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/span_Empresa'))

WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/td_Pruebas katalon'), 0)

WebUI.click(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/td_Pruebas katalon'))

WebUI.click(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/a_Eliminar'))

WebUI.click(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/a_link_aceptar'))

WebUI.click(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/input_Cdigo_empresa_formcodigoEmpresa'), '5')

WebUI.setText(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/input_Nombre_empresa_formnombreEmpresa'), 'Pruebas katalon')

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/select_-- Seleccione --generalMexico'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/select_-- Seleccione --Aspirantes CALIDADSitio Calidad'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/select_-- Seleccione --Grupo a'), 1)

WebUI.click(findTestObject('Modulo Pruebas Seguridad/Crear_Empresa/a_Actualizar'))

