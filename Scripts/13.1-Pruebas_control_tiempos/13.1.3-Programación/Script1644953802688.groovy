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

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/td_13022022'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Programación/td_13022022'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Eliminar'))

    WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Aceptar'))
}

WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarAusenciaHorario'), 2)

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarDiaria'), 1)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Da_jornada_formdiaDI_input'), '13/02/2022')

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hora Comienza_jornada_formhoraInicialDI'), '08')

WebUI.click(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoInicialDI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoInicialDI'), '10')

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarTurno 01 (0600 - 1400)TURNO 02 (1400 - 2200)Turno 03 (2200-0600)Turno 06 (0800 - 1800)'), 
    4)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input_Hora Termina_jornada_formhoraFinalDI'), '18')

WebUI.click(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoFinalDI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo control tiempo/Programación/input__jornada_formminutoFinalDI'), '10')

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Programación/select_SeleccionarJornada LaboralFranja Adicional Por AutorizarFranja Adicional Autorizada'), 
    1)

WebUI.click(findTestObject('Modulo control tiempo/Programación/a_Guardar'))

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Programación/p_Registro guardado'), 1)) {
    WebUI.closeBrowser()
}
    WebUI.comment('no se muestra programacion por día')


