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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/input_Empresa 1_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/span_Proceso de Se'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/span_Proceso de Se'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/td_8028     - Analista De Sistemas'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_Condicin de Derecho'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_Edad_seleccion_procesotabla_ventanaCDTB1j_idt15812'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_Edad_seleccion_procesotabla_ventanaCDTB1j_idt15812'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_Aceptar'))
}

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_BOGOT_seleccion_procesotabla_ventanaCDTB0j_idt1581'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_BOGOT_seleccion_procesotabla_ventanaCDTB0j_idt1581'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_Aceptar'))
}

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/select_-- Seleccione --CargoCargos MultiplesCategoriaCiudad'), 
    4)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_No se encontr registros_seleccion_procesotabla_ventanaCDTBj_idt1504'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt2630'), 
    'bogotá')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/input_Ubicacin Geogrfica_formPopUpUbicacionj_idt2630'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/td_11001     BOGOT'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_No se encontr registros_seleccion_procesotabla_ventanaCDTBj_idt1582'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/select_-- Seleccione --CargoCargos MultiplesCategoriaCiudad'), 
    6)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/input_BOGOT_seleccion_procesotabla_ventanaCDTBedadMinima'), 
    '20')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/input_BOGOT_seleccion_procesotabla_ventanaCDTBedadMaxima'), 
    '60')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Selección/Condición_de_derecho/a_No se encontr registros_seleccion_procesotabla_ventanaCDTBj_idt1582'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta')) 

if(Result == 'Se guardó el registro correctamente') {
	String Resultado = 'PRUEBA OK'
}
else {
	WebUI.acceptAlert()
}