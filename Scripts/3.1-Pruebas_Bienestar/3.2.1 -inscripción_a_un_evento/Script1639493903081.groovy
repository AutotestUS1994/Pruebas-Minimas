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

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/input_No search results are available_form_templatej_idt24_input'), 
    'Inscripcion evento (bie)')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/li_Inscripcion Evento (bie)'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/a_Inscripcin'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/a_Nombre_formListadoEventosj_idt185'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/td_'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/select_-- Seleccione --prueba-S-SH'), 
    1)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/input_Referencia Pago_formListadoEventospIReferencia'), 
    '5')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/input_Valor Persona A Pagar_formListadoEventospIValor'), 
    '100')

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/input_Posicin_formListadoEventospIPosicion'), 
    '5')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción_a_un_evento/a_Guardar'))

