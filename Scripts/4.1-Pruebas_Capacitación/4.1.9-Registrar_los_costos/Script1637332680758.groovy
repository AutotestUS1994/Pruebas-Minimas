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

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/td_Prueba'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/div_Costo'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/a_Registro'))

if(WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/a_REFRIGERIO_formCostoEventopanel_costostabla_costos0j_idt634'), 1))
{
WebUI.click(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/a_REFRIGERIO_formCostoEventopanel_costostabla_costos0j_idt634'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/a_Aceptar'))
}
WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/select_SeleccioneALOJAMIENTOMATERIALESREFRIGERIOSALONTRANSPORTE'), 
    3)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/input_Valor_formCostoEventopanel_costostabla_costosnumero'), 
    '100')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/input_Valor_formCostoEventopanel_costostabla_costosfechaPago_input'), 
    '07/05/2021')

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/input_Valor_formCostoEventopanel_costostabla_costosvalor'), 
    '1000000')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Registrar_los_costos/a_Valor_formCostoEventopanel_costostabla_costosj_idt637'))

