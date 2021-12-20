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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Control Evento Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/td_Prueba'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/div_Asistentes'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/a_Invitacin'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/span_PLANTA'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/select_SeleccioneCALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/a_Unidad_invitacioneventoPopup_formlinkPopupUnidad'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/input_Unidad Organizacional_invitacioneventoPopup_formdescripciones'), 
    'a')

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/input_Unidad Organizacional_invitacioneventoPopup_formdescripciones'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/span_A1'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/a_Cargo_invitacioneventoPopup_formfiltroPopupCargo'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/span_ANALISTA DE SISTEMAS'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/a_Empleado_invitacioneventoPopup_formlinkPopupCoordinador'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1714'), 
    'a')

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1714'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/span_A A A'))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/select_SeleccionePrueba'), 1)

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/input_Asunto_invitacioneventoPopup_formasunto'), 
    'null')

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Enviar_una_invitación/a_Invitacin1'))

WebUI.closeBrowser()

