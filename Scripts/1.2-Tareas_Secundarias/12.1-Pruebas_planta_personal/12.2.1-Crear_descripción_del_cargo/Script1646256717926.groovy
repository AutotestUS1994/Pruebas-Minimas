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

WebUI.callTestCase(findTestCase('1.2-Tareas_Secundarias/12.1-Pruebas_planta_personal/12.1.6-Buscar_puesto_de_trabajo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/a_Salgado . Paula_organigramaj_idt111'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/a_Aceptar'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/a_Aceptar'))
}

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/textarea__descripcionCargo_formj_idt15140idTexto5'), 
    'pruebas k')

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/textarea__descripcionCargo_formj_idt15141idTexto5'), 
    'pruebas automaticas')

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/textarea__descripcionCargo_formj_idt15142idTexto5'), 
    'NULL')

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/textarea__descripcionCargo_formj_idt15143idTexto5'), 
    'NULL')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/a_Guardar'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Crear_descripción_del_cargo/p_Se ha actualizado el registro'), 
    1)) {
    WebUI.closeBrowser()
}

