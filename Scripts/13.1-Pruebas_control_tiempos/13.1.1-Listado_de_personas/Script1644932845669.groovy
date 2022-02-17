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

WebUI.setText(findTestObject('Modulo control tiempo/Listado de Personas/input_Empresa 1_form_templatej_idt24_input'), 'listado persona')

WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/span_Listado Persona'))

if (WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Listado de Personas/td_1010220596'), 1)) {
    WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/td_1010220596'))

    WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/a_Eliminar'))

    WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/a_Aceptar'))

    WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/a_Regresar'))
}

WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/a_Nuevo'))

WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/a_Identificacin_form_personaj_idt121'))

WebUI.setText(findTestObject('Modulo control tiempo/Listado de Personas/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1737'), 
    'A A A')

WebUI.sendKeys(findTestObject('Modulo control tiempo/Listado de Personas/input_Filtro Hoja de Vida_formPopupHojaVidaj_idt1737'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/td_A A A'))

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Listado de Personas/select_SeleccionarFijoProgramacin'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Listado de Personas/select_SeleccionarDesarrolloLIQUIDACIN MENSUAL'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Listado de Personas/select_SeleccionarGrupo 2Sociosgrupo 3ClientesGrupo 1'), 
    5)

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Listado de Personas/select_SeleccionarAlternoMltiplenico'), 
    3)

WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/a_Sitio Administracin_form_personaj_idt166'))

WebUI.click(findTestObject('Modulo control tiempo/Listado de Personas/td_Oficina'))

WebUI.waitForElementVisible(findTestObject('Modulo control tiempo/Listado de Personas/select_SeleccionarActivoInactivo'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Listado de Personas/select_SeleccionarActivoInactivo'), 
    1)

WebUI.click(findTestObject('a_Guardar'))

WebUI.selectOptionByIndex(findTestObject('Modulo control tiempo/Listado de Personas/select_SeleccionarPruebaTurno 04 (L-V 730 - 1700 1h Almuerzo, S 700 - 1230)'), 
    1)

WebUI.click(findTestObject('a_Guardar'))

