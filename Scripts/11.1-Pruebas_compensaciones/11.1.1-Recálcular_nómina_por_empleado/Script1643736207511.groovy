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

WebUI.setText(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/input_Empresa 1_form_templatej_idt24_input'), 
    'liquidacion nomina')

WebUI.click(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/li_Liquidacion Nomina (com)'))

WebUI.click(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/a_Periodo Nomina_LiquidacionNominaj_idt68'))

WebUI.selectOptionByIndex(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    2)

WebUI.click(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/span_P. MensualJunio2021'))

WebUI.check(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/div_Estado_ui-chkbox-box ui-widget ui-corner-all ui-state-default'))

WebUI.click(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/a_Reclculo Seleccin'))

WebUI.click(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/span_Si'))

if(WebUI.waitForElementVisible(findTestObject('Modulo compensaciones/Recálcular_nómina_por_empleado/p_Recalculo Finalizado'), 
    1))
{
WebUI.delay(2)

WebUI.closeBrowser()
}
