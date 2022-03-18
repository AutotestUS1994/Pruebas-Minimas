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

WebUI.setText(findTestObject('Modulo Selección/Asociar_candidatos/input_Empresa 1_form_templatej_idt24_input'), 'proceso de seleccion')

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/li_Proceso de Seleccion (tal)'))

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Asociar_candidatos/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.setText(findTestObject('Modulo Selección/Asociar_candidatos/input_Fecha Inicial_filtro_procesoseleccionfechaps_input'), 
    '29/06/2017')

WebUI.sendKeys(findTestObject('Modulo Selección/Asociar_candidatos/input_Fecha Inicial_filtro_procesoseleccionfechaps_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/td_8028     - Analista De Sistemas'))

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/div_Candidato'))

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/a_Registro Candidato'))

if(WebUI.waitForElementVisible(findTestObject('Modulo Selección/Asociar_candidatos/td_A A A'), 1))
{
WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/td_A A A'))

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/a_Eliminar'))

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/span_Si'))
}
WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/a_Nuevo'))

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/a_Identificacin_seleccion_procesopanelCandidatoj_idt924'))

WebUI.setText(findTestObject('Modulo Selección/Asociar_candidatos/input_Filtro Candidatos_form_popUpCandidatosSeleccionj_idt171'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo Selección/Asociar_candidatos/input_Filtro Candidatos_form_popUpCandidatosSeleccionj_idt171'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Selección/Asociar_candidatos/span_A A A'))

WebUI.click(findTestObject('a_Guardar'))

