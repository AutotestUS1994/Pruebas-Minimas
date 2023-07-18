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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/input_Empresa 1_form_templatej_idt24_input'), 
    'Tipo de Hoja')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/span_Tipo de Hoja'))

if (WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/span_P1'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/span_P1'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/a_Aceptar'))
}

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/a_Nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/input_Tipo Relacin Hoja_form_tipohojavinculacion'), 
    'P1')

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/input_Descripcin_form_tipohojadescripcion'), 
    'prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/label_No_Novedad Directa'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/label_Si_Crear Hoja'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/label_No_Novedad Aprobada'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/label_No_Novedad Rechazada'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/select_Formulario Asociados'), 
    8)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/select_Hoja Asociar'), 
    3)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/select_Gestion Periodo'), 
    2)

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/select_Modo'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Tipo_de_Hoja/a_Guardar'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Se adiciono el registro correctamente') {
    String Resultado = 'PRUEBAS OK'
} else {
    WebUI.acceptAlert()
}

