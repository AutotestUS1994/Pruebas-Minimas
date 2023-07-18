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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/input_Empresa 1_form_templatej_idt24_input'), 
    'Parametros Contratacion')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/li_Parametros Contratacion (tal)'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/a_Origen Contratacin'))

if (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/td_Pruebas katalon'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/td_Pruebas katalon'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/input_Cdigo_form_origencontratacioncodigo'), 
    '5')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/input_Descripcin_form_origencontrataciondescripcion'), 
    'Pruebas katalon')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/select_Hoja Vida ExisteIngresa Hoja Manual'), 
    '0')

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/select_Datos de un RequerimientoDatos de una SeleccionNo aplica'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/select_SiNo'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Vinculación/Crear_un_Origen_de_Contratación/a_Guardar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se adiciono el registro correctamente') {
    String Resultado = 'PRUEBA OK'
} else {
    WebUI.acceptAlert()
}

