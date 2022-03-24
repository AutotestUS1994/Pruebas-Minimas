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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('input_Empresa 1_form_templatej_idt24_input'), 'listado persona')

WebUI.click(findTestObject('Modulo control tiempo/Dispositivo/span_Listado Persona'))

WebUI.click(findTestObject('Modulo control tiempo/Dispositivo/td_1010220596'))

WebUI.click(findTestObject('Modulo control tiempo/Dispositivo/a_dispositivo'))

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Dispositivo/td_-'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Dispositivo/td_-'))

    WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Modulo control tiempo/Dispositivo/span_Remove All'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))
}

WebUI.click(findTestObject('Modulo control tiempo/Dispositivo/span_Huella Digital'))

WebUI.click(findTestObject('Modulo control tiempo/Dispositivo/span_Huella Digital_ui-button-icon-left ui-icon ui-c ui-icon ui-icon-arrow-1-e'))

if(WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Dispositivo/td_-'), 1))
{
WebUI.closeBrowser()
}
