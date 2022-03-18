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

WebUI.setText(findTestObject('Modulo Selección/Definir_una_programación_pendiente/input_Empresa 1_form_templatej_idt24_input'), 
    'Evaluacion Proceso Seleccion (tal)')

WebUI.click(findTestObject('Modulo Selección/Definir_una_programación_pendiente/li_Evaluacion Proceso Seleccion (tal)'))

WebUI.click(findTestObject('Modulo Selección/Definir_una_programación_pendiente/span_Pendientes'))

WebUI.click(findTestObject('Modulo Selección/Definir_una_programación_pendiente/span_Quintero Mendez Jose Eduardo'))

WebUI.setText(findTestObject('Modulo Selección/Definir_una_programación_pendiente/input_Fecha_popupEtapaProceso_formseccionfecha_inicial_input'), 
    '28/12/2022')

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Definir_una_programación_pendiente/select_--010203040506070809101112'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Definir_una_programación_pendiente/select_--00153045'), 3)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Definir_una_programación_pendiente/select_--AMPM'), 2)

WebUI.click(findTestObject('Modulo Selección/Definir_una_programación_pendiente/a_Actualizar'))

