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

WebUI.setText(findTestObject('input_Empresa 1_form_templatej_idt24_input'), 'Listado persona')

WebUI.click(findTestObject('Modulo control tiempo/Programación/span_Listado Persona'))

WebUI.click(findTestObject('Modulo control tiempo/Programación/td_1010220596'))

WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Programacin'))

while (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/td_Horario Predefinido2021'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Programación/td_Horario Predefinido2021'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Eliminar2021'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Aceptar2021'))
}

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/td_13022022'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Programación/td_13022022'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Eliminar'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Aceptar'))
}

WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarAusenciaHorario'), 2)

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarDiaria'), 1)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hora Comienza_jornada_formhoraInicialDI'), 'TTTTTLL')

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Da_jornada_formdiaDI_input'), '13/02/2022')

WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/input_Hora Comienza_jornada_formhoraInicialCI'), 
    0)

WebUI.click(findTestObject('Modulo control tiempo/Programación/input_Hora Comienza_jornada_formhoraInicialCI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hora Comienza_jornada_formhoraInicialCI'), '10')

WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoInicialCI'), 0)

WebUI.click(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoInicialCI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoInicialCI'), '04')

WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/input_Hora Termina_jornada_formhoraFinalCI'), 
    0)

WebUI.click(findTestObject('Modulo control tiempo/Programación/input_Hora Termina_jornada_formhoraFinalCI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hora Termina_jornada_formhoraFinalCI'), '18')

WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoFinalCI'), 0)

WebUI.click(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoFinalCI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoFinalCI'), '10')

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarJornada LaboralFranja Adicional Por AutorizarFranja Adicional Autorizada'), 
    1)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hasta_jornada_formhastaCI_input'), '13/02/2022')

WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Guardar'))

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/a_Programacin Por Da'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Programacin Por Da'))

    WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarTurno 01 (0600 - 1400)TURNO 02 (1400 - 2200)Turno 03 (2200-0600)'), 
        4)

    WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Desde_jornadaPorDia_formdesdeTU_input'), '01/07/2021')

    WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hasta_jornadaPorDia_formhastaTU_input'), '02/07/2021')

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Guardar2'))
} else {
    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Persona'))

    WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarFijoProgramacin'), 2)

    WebUI.click(findTestObject('Modulo Parametros/Comprobar Parametros/a_Guardar'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Programacin'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Programacin Por Da'))

    WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarTurno 01 (0600 - 1400)TURNO 02 (1400 - 2200)Turno 03 (2200-0600)'), 
        4)

    WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Desde_jornadaPorDia_formdesdeTU_input'), '01/07/2021')

    WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hasta_jornadaPorDia_formhastaTU_input'), '02/07/2021')

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Guardar2'))
}

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/p_Registro guardado'), 1)) {
    WebUI.closeBrowser()
}

