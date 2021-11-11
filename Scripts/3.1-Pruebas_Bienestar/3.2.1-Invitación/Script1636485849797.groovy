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

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo bienestar-eventos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Pruebas Bienestar/Invitación/td_Prueba-S-SH'), 0)

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/td_Prueba-S-SH'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/div_Participante'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/a_Invitacin'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Invitación/select_SeleccioneCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    '4')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/a_Unidad_invitacionEventosPopupFormj_idt1309'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/a_Filtrar'))

WebUI.check(findTestObject('Modulo Pruebas Bienestar/Invitación/div_Cargo_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/a_Invitacin_boton'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/a_Invitacin'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Bienestar/Invitación/select_SeleccioneCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    '1')

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/a_Filtrar'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/span_ui-button'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/span_Todo'))

WebUI.click(findTestObject('Modulo Pruebas Bienestar/Invitación/a_Invitacin_boton'))

WebUI.closeBrowser()

