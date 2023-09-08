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

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/input_Listado Hojas De Vida_form_templatej_idt24_input'), 
    'Listado Hojas de vida (hoj)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/span_Listado Hojas de Vida'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/input_Identificacin_listado_hojaVidaj_idt68'), 
    '80769954')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/input_Identificacin_listado_hojaVidaj_idt68'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/td_80769954'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/div_Informacin Bsica'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/a_Actualizar Respuestas0'))

informacioBasica = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/div_Formacin Acadmica'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/td_ESTUDIOS TITULO OBTENIDO'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/a_Actualizar Respuestas1'))

formacionA = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/div_Experiencia Laboral'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/td_PRUEBA'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/a_Actualizar Respuestas2'))

experiencia = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/div_Familia'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/td_HERMANO (A)'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/a_Actualizar Respuestas3'))

familia = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/div_Informacin Del Inmueble'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/td_CRA 132'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/a_Actualizar Respuestas4'))

inmueble = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/div_Hoja Intelecto'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/td'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Listado Hojas de Vida/Secciones_hoja_de_vida/a_Actualizar Respuestas'))

intelecto = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if(intelecto == 'Registro Actualizado'&& inmueble == 'Registro Actualizado'&& familia == 'Registro Actualizado'&&experiencia == 'Registro Actualizado'&&formacionA == 'Registro Actualizado'&&informacioBasica == 'Registro Actualizado') {
	WebUI.closeBrowser()
}else {WebUI.acceptAlert()}

