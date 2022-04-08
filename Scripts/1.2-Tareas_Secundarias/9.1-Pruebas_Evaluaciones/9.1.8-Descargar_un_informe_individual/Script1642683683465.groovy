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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Descargar un informe individual/input_Empresa 1_form_templatej_idt24_input'), 
    'programacion evaluaciones')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Descargar un informe individual/li_Programacion Evaluaciones (tal)'))

WebUI.selectOptionByIndex(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Descargar un informe individual/select_-- Seleccione Fase --ENCUESTA DE RETIRO'), 
    1)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Descargar un informe individual/a_Identificacion Evaluado_listadoFaseGestionHojaj_idt74'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Descargar un informe individual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt680'), 
    '1057596487')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Descargar un informe individual/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt680'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Descargar un informe individual/span_Diaz Blanco Guisell'))

WebUI.comment('los pasos a seguir no son claros')

