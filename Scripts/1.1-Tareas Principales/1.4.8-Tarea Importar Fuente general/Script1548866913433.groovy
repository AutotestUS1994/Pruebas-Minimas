import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Sara General/Importar Fuente General/input_Ir_nav_t66_input'), 
    3)

WebUI.setText(findTestObject('Modulo Tarea Sara General/Importar Fuente General/input_Ir_nav_t66_input'), 'Importar Fuente General')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Tarea Sara General/Importar Fuente General/input_Ir_nav_t66_input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Modulo Tarea Sara General/Importar Fuente General/input_Importar Fuente_formImpo'), 'Insertar las liquidaciones periodicas de prestamo')

WebUI.sendKeys(findTestObject('Modulo Tarea Sara General/Importar Fuente General/input_Importar Fuente_formImpo'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Modulo Tarea Sara General/Importar Fuente General/td_Insertar Las Liquidaciones Periodicas De Prestamo'))

//String creado para redireccionar  los archivos requeridos por el test//

String ruta=GlobalVariable.G_rutaarchivos+"ArchivoPlanoLiquidacionNomina.txt"

WebUI.uploadFile(findTestObject('Modulo Tarea Sara General/Importar Fuente General/Archivo Cargue Fuente'), ruta)

filePath = WebUI.getAttribute(findTestObject('Modulo Tarea Sara General/Importar Fuente General/Archivo Cargue Fuente'), 
    'value')

WebUI.click(findTestObject('Modulo Tarea Sara General/Importar Fuente General/a_Importar'))

WebUI.click(findTestObject('Modulo Tarea Sara General/Importar Fuente General/a_Continuar'))

WebUI.closeBrowser()

