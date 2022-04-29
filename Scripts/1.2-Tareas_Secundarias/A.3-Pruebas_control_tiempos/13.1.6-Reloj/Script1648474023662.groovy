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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Listado_Empleados/input_Empresa 1_form_templatej_idt24_input (1)'), 
    'Listado persona')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/span_Listado Persona'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/td_1010220596'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/a_Reloj'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/td_20210701 1800'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/td_20210701 1800'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/select_AbiertoCerrado'), 
    1)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/input_Fecha Inicial_formPopupRelojfechaIni_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/input_Fecha Final_formPopupRelojfechaFin_input'), 
    '30/07/2021')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/input_Hora_formPopupRelojhoraIni'), 
    '08')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/input__formPopupRelojminutoIni'), 
    '10')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/input__formPopupRelojhoraFin'), 
    '18')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/input__formPopupRelojminutoFin'), 
    '00')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Reloj/a_Guardar'))

String Result =WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))
if(Result == 'Se ingreso el registro') {
	String Resultado = 'PRUEBA OK'
}
else {
	WebUI.acceptAlert()
}
