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

WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Calendario/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('Modulo Pruebas Bienestar/Calendario/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'evento (bie)')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Pruebas Bienestar/Calendario/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/td_Prueba-S'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/a_Momento Eventos'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/td_prueba'))

if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Calendario/td_MAR-MIE 0500-0600'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/span_Fecha Inscripcin_ui-icon ui-icon-closethick'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/a_Calendario'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/button_Mes'))

    WebUI.scrollToPosition(0, 600)
} else {
    WebUI.callTestCase(findTestCase('3.1-Pruebas_Bienestar/3.1.7-Programacion_Múltiple'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/a_Calendario'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Calendario/button_Mes'))

    WebUI.scrollToPosition(0, 100)
}

