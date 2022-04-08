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

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Masiva_por_cargue/input_Empresa 1_form_templatej_idt24_input'), 
    'Importar Fuente General')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Masiva_por_cargue/li_Importar Fuente General (gna)'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Masiva_por_cargue/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
    'programacion masiva evaluacion')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Masiva_por_cargue/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Masiva_por_cargue/td_Programacion Masiva Evaluacion'))

WebUI.uploadFile(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Evaluacion/Programar_la_evaluación_Masiva_por_cargue/input_Cargar_formImportarFuentetabarchivo_input'), 
    '')

WebUI.comment('Es necesario crear el documento a subir ')

