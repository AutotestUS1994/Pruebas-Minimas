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

WebUI.setText(findTestObject('Modulo control tiempo/liquidación/input_Empresa 1_form_templatej_idt24_input'), 'Liquidacion (get)')

WebUI.click(findTestObject('Modulo control tiempo/liquidación/li_Liquidacion (get)'))

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/liquidación/td_01072021'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/liquidación/td_01072021'))

    WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Reversar'))

    WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Aceptar'))

    WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/liquidación/a_Continuar'), 0)

    WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Continuar'))
}

WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Nuevo'))

WebUI.setText(findTestObject('Modulo control tiempo/liquidación/input_Fecha Inicial_form_popupFechaLiquidacionBeanfechaInicial_input'), 
    '18/01/2019')

WebUI.sendKeys(findTestObject('Modulo control tiempo/liquidación/input_Fecha Inicial_form_popupFechaLiquidacionBeanfechaInicial_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Modulo control tiempo/liquidación/input_Fecha Final_form_popupFechaLiquidacionBeanfechaFinal_input'), 
    '27/02/2019')

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/liquidación/select_--Seleccione--Proceso de liquidacin DesarrolloProceso de liquidacin Mensual'), 
    1)

WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Aplicar'))

WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Liquidar'))

WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Aceptar'))

WebUI.click(findTestObject('Modulo control tiempo/liquidación/div_Liquidacin realizada con xito'))

WebUI.click(findTestObject('Modulo control tiempo/liquidación/a_Continuar'))

if (WebUI.waitForElementPresent(findTestObject('Modulo control tiempo/liquidación/textarea_Evento del reloj entrada sin salida - Entradas sin autorizar'), 
    1)) {
    WebUI.closeBrowser()
}

