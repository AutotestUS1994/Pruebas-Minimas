import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/input_Empresa 1_form_templatej_idt24_input'), 
    'mantenimiento periodo nomina')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/li_Mantenimiento Periodo Nomina (com)'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/span_NOMINA MENSUAL'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/td_pruebask'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/td_pruebask'))

    WebElement element0 = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Eliminar'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element0))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Aceptar'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/span_Nuevo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/input_Periodo Nomina_popupNuevoPeriodopanelNominaperiodo'), 
    'pruebask')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/input_Descripcin_popupNuevoPeriodopanelNominadescripcion'), 
    'P. MensualOctubre2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/input_Fecha Inicial_popupNuevoPeriodopanelNominafechainicial_input'), 
    '01/10/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/input_Fecha Final_popupNuevoPeriodopanelNominafechafinal_input'), 
    '30/10/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/input_Fecha Pago_popupNuevoPeriodopanelNominafechaPago_input'), 
    '30/10/2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/input_Fecha Pago_popupNuevoPeriodopanelNominafechaPago_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/select_-- seleccione --Ciclo 0Ciclo 1Ciclo 2'), 
    1)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/select_Periodo AbonadoPeriodo CerradoPeriodo en ProcesoPeriodo no Generado'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/select_CausadoPagado'), 
    0)

/*
WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Guardar'))
*/
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Guardar'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

String Alerta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Alerta == 'Registro guardado') {


    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

