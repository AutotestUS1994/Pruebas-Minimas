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

WebUI.setText(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/input_No search results are available_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/span_Proceso de Seleccion'))

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/select_--Seleccione--CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.setText(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/input_Fecha Inicial_filtro_procesoseleccionfechaps_input'), 
    '29/06/2017')

WebUI.setText(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/input_Fecha Final_filtro_procesoseleccionfechaps1_input'), 
    '29/06/2017')

WebUI.sendKeys(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/input_Fecha Final_filtro_procesoseleccionfechaps1_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/td_8028     - Analista De Sistemas'))

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/div_Citacion'))

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/a_Etapas Por Asistente'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/span_A A A_glyphicons glyphicons-user-add'), 
    1)) {
    WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/span_A A A_glyphicons glyphicons-user-add'))

    WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/a_Eliminar'))

    WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/span_Si'))
}

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/a_Jurados'))

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/a_Programar'))

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/td_PRUEBA'))

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/a_Responsable_popupCitacion_formj_idt1947'))

WebUI.setText(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2644'), 
    'constantino jhon')

WebUI.sendKeys(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt2644'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/span_Constantino  Jhon'))

WebUI.setText(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/textarea_Observacin_popupCitacion_formobservacion'), 
    'pr katalon')

WebUI.check(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/div_Evaluacin Artstica_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.setText(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/input_Fecha_popupCitacion_formfecha_inicial_input'), 
    '22/03/2022')

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/select_--010203040506070809101112'), 
    8)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/select_--00153045'), 1)

WebUI.selectOptionByIndex(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/select_--AMPM'), 2)

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/a_Continuar'))

if (WebUI.waitForElementVisible(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/div_Constantino  Jhon9741850_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'), 
    1)) {
    WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/div_Constantino  Jhon9741850_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))
}

WebUI.click(findTestObject('Modulo Selección/Programación_de_etapas_a_un_candidato/a_Generar'))

String Alert = WebUI.getText(findTestObject('Alerta/Alerta'))

WebUI.closeBrowser()

