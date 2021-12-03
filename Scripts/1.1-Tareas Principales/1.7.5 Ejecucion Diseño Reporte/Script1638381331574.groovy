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

WebUI.setText(findTestObject('Modulo_Ejecucion_Diseño_Reporte/input_Ejecutar Diseo Reporte_form_templatej_idt24_input'), 
    'Ejecutar Diseño De Reporte')

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/li_Ejecutar Diseo De Reporte (com)'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/td_CAUSACION CESANTIAS (FCORTE)'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/a_Generacin'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/span_Generar Tabla'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/a_Si'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/a_Continuar'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/a_Imprimir'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/label_Xlsdata'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/a_Reporte'))

WebUI.delay(3)

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/span_E_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/a_Imprimir'))

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/label_Pdf'))

WebUI.delay(3)

WebUI.click(findTestObject('Modulo_Ejecucion_Diseño_Reporte/span_E_ui-icon ui-icon-closethick'))

WebUI.closeBrowser()

