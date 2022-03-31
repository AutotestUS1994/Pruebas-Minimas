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

WebUI.setText(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/input_Beneficios_form_templatej_idt24_input'), 'beneficio (bie)')

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/span_Beneficio (bie)'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/td_PRUEBAS KATALON'))

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/a_Filtro Seccin'))

if (WebUI.waitForElementVisible(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/a_CONYUGUE_form_dirigidoTipoBeneficiariotabla_dirigido0j_idt689'), 
    1)) {
    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/a_CONYUGUE_form_dirigidoTipoBeneficiariotabla_dirigido0j_idt689'))

    WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/a_Aceptar'))
}

WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/select_--Seleccione--DiscapacidadEdadGeneroParentesco'), 
    4)

WebUI.selectOptionByIndex(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/select_-- Seleccione --CONYUGUEHERMANO (A)HIJO (A)NO DEFINIDOPADRE'), 
    1)

WebUI.click(findTestObject('M-OBJECTS TAREAS SECUNDARIAS/Pruebas Bienestar/Filtro_sección/a_Tipo Campo_form_dirigidoTipoBeneficiariotabla_dirigidoj_idt690'))

