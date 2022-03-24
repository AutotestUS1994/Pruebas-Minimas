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

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/td_Prueba'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/div_Programacin'))

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/a_Programacin'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/td_24122021'), 1)) {
    WebUI.check(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/div_Ubicacin_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/a_Aceptar'))
}

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/a_Nuevo'))

WebUI.setText(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/input_Das_diaeventoPopup_formdia_input'), 
    '24/12/2021')

WebUI.sendKeys(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/input_Das_diaeventoPopup_formdia_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_010203040506070809101112_1'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_00153045_1'), 2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_AMPM_1'), 1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_010203040506070809101112_2'), 
    2)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_00153045_2'), 3)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_AMPM_2'), 1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_SeleccionePrueba'), 1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_SeleccioneAula InteligenteSala de JuntasSalon ExternoSalon Principal'), 
    4)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_SeleccionePRUEBA DE MODULO'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/select_Seleccione23913781ALMANZA ROSAS SILVISGUISELLGUTIERREZ ALVAREZ FERNANDA LUCIA'), 
    1)

WebUI.click(findTestObject('Modulo Pruebas Capacitación/Programar_un_evento/a_Guardar'))

