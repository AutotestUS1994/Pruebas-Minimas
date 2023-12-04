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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Compensación/Listado_Empleados/input_Empresa 1_form_templatej_idt24_input (1)'), 
    'Liquidacion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/span_Liquidacion'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/td_27022019'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Reversar Nomina'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Reversar Nomina'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Aplicar'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Si'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Aceptar'))

WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Continuar'), 
    0)

String Result = WebUI.getText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/div0'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Prueba Control De Tiempo/Aplicar/a_Continuar'))

if (Result == 'Proceso realizado con éxito.') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

