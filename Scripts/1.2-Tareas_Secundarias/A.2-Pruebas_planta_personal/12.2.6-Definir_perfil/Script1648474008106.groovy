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

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/input_Empresa 1_form_templatej_idt24_input'), 
    'Listado Descripcion Cargo')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/li_Listado Descripcion Cargo (tal)'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Unidad_form_listadoDescripcionCargoj_idt66'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/input_Unidad_form_popupUnidadUsuarioj_idt612'), 
    'ADMINISTRACION')

WebUI.sendKeys(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/input_Unidad_form_popupUnidadUsuarioj_idt612'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/span_ADMINISTRACION'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Cargo_form_listadoDescripcionCargoj_idt70'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/span_40 MIL STAFF'))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/span_01072021'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Definir Perfil'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Definir Perfil'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Aceptar'))
}

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Contratos'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/td_1010220596'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/td_1010220596'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_A A A_descripcionCargo_formtabla_perfil_contratos0j_idt971'))

    WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Aceptar'))
}

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Fecha Final_descripcionCargo_formtabla_perfil_contratosj_idt957'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/input_Filtro Empleado_form_popupEmpleadoj_idt1700'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/input_Filtro Empleado_form_popupEmpleadoj_idt1700'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/span_1010220596'))

WebUI.setText(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/input_Fecha Final_descripcionCargo_formtabla_perfil_contratosfechainicial_input'), 
    '01/07/2021')

WebUI.click(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/a_Fecha Final_descripcionCargo_formtabla_perfil_contratosj_idt972'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Planta de Personal/Definir_perfil/span_1010220596'), 1)) {
    WebUI.closeBrowser()
}

