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

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/input_Secciones_form_templatej_idt286j_idt29'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/label_Parametros de Formularios'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/a_Formulario'))

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/input_Nueva Hoja Vida_form_formularioj_idt61'), 'prueba')

WebUI.sendKeys(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/input_Nueva Hoja Vida_form_formularioj_idt61'), Keys.chord(
        Keys.ENTER))

if (WebUI.waitForElementClickable(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/span_Prueba'), 1)) {
    
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/span_Prueba'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/a_Eliminar'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/a_Aceptar_Eliminar'))
}

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/a_Nuevo'))

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/input_Nombre_form_formularionombre'), 'prueba')

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/input_Cdigo_form_formulariomodulo'), '123')

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Nuevo_Formulario_Hoja_de_vida1/a_Guardar'))

WebUI.closeBrowser()

