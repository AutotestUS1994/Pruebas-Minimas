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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/td_Prueba-S-SH'), 0)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/td_Prueba-S-SH'))

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/div_Participante'), 0)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/div_Participante'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/a_Individual'))

if (WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/td_Ardila Julio'), 1)) {
    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/td_Ardila Julio'))

    WebUI.waitForElementPresent(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/a_Cambiar Datos'), 0)

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/a_Cambiar Datos'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/span_Si'))
}

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/a_Inscribirse_Menu'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/select_SeleccioneCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/a_Filtrar'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/select_-- Seleccione --prueba-S-SH'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/span_Momento Evento_ui-button-icon-left ui-icon ui-c ui-icon-triangle-1-s'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/span_Pagina Actual'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Inscripción masiva/a_Inscribirse'))

WebUI.closeBrowser()

