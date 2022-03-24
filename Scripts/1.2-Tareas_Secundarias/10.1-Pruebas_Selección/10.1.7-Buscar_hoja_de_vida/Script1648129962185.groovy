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

WebUI.setText(findTestObject('Modulo Selección/Buscar_hoja_de_vida/input_Empresa 1_form_templatej_idt24_input'), 'Buscador Hoja vida')

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida/li_Buscador Hoja Vida (hoj)'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida/label_Las hojas de vidas de los empleados'))

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida/label_Las hojas de vida que cumplan con el perfil de una cargo'))

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida/select_CALIDADMENSUAL ABCMODELO EMPRESA QUINCENAL'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida/select_1111123456ADMINISTRACIONADMINISTRACIONAnalista QA'), 
    8)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Buscar_hoja_de_vida/select_20061    - ANALISTA DE MARKETING20139    - ABOGADO20156    - ANALISTA CONTABLE'), 
    1)

WebUI.click(findTestObject('Modulo Selección/Buscar_hoja_de_vida/a_Aplicar'))

WebUI.closeBrowser()

