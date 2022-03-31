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

WebUI.setText(findTestObject('Modulo compensaciones/Fuente_General/input_Empresa 1_form_templatej_idt24_input'), 'importar fuente general')

WebUI.click(findTestObject('Modulo compensaciones/Fuente_General/li_fuente general (gna)'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
    'Creación prestamos')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Procesos Generados_formImportarListadoFuentej_idt67'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/td_Creacin Prestamos'))

String ruta = GlobalVariable.G_rutaarchivos + 'carguePrestamo.txt'

WebUI.uploadFile(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/input_Cargar_formImportarFuentetabarchivo_input'), 
    ruta)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Importar Fuente General/a_Importar'))

WebUI.waitForElementVisible(findTestObject('Modulo compensaciones/Fuente_General/a_Continuar'), 0)

WebUI.click(findTestObject('Modulo compensaciones/Fuente_General/a_Continuar'))

WebUI.click(findTestObject('Modulo compensaciones/Fuente_General/a_Ejecutar'))

WebUI.click(findTestObject('Modulo compensaciones/Fuente_General/a_Continuar'))

WebUI.waitForElementVisible(findTestObject('Modulo compensaciones/Fuente_General/td_354968431354    PC65000001000020107202118076995478975000'), 
    0)

WebUI.closeBrowser()

