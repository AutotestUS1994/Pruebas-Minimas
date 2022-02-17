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

WebUI.setText(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/input_Empresa 1_form_templatej_idt24_input'), 'listado persona')

WebUI.click(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/span_Listado Persona'))

WebUI.click(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/td_1010220596'))

WebUI.click(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/a_Sitios de Trabajo'))

WebUI.click(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/li_02-Sede Externo'))

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/td_9'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/td_9'))

	WebElement element0 = WebUiCommonHelper.findWebElement(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/span_Add'),
		30)
	
	WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element0))
}

WebUI.click(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/span_Oficina'))



WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Modulo control tiempo/Sitios_de_Trabajo/span_Add'),
	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))