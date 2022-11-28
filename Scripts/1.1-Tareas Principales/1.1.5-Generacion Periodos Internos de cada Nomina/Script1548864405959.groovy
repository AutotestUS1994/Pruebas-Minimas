import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

Date today = new Date()

String todaysDate = today.format('dd/MM/yyyy')

String projectName = 'Regression Project ' + todaysDate

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Mantenimieto Periodo Nomina'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/span_NOMINA MENSUAL'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/span_NOMINA MENSUAL'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/td_P. MensualAgosto2021'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/td_P. MensualAgosto2021'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Eliminar_Periodo Agosto'), 
        0)

    WebElement element = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Eliminar_Periodo Agosto'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Aceptar_ELiminar_Agosto'))
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/td_P. MensualSeptiembre2021'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/td_P. MensualSeptiembre2021'))

    WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Eliminar'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Aceptar'))
}

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Generar Periodicidad'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Generar Periodicidad'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/input_Descripcin Periodo_formPoGePepoGePePeriodicidadDescripcion'), 
    'P. Mensual')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/select_--Seleccione--CatorcenalMensualQuincenalSemanal'), 
    '2')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/input_Prefijo_formPoGePeprefijo'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/input_Prefijo_formPoGePeprefijo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/input_Prefijo_formPoGePeprefijo'), 
    'PM')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/input_Fecha Inicial_formPoGePepoGePeFechaInicial_input'), 
    '01/10/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/input_Fecha Final_formPoGePepoGePeFechaFinal_input'), 
    '30/10/2021')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Generar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Generar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Guardar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/a_Guardar'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/td_P. MensualSeptiembre2021'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion Periodos Internos de Cada Nomina/td_P. MensualSeptiembre2021'))

WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Eliminar'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element2))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Periodos Internos de Cada Nomina/a_Aceptar'))

String Alerta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Alerta == 'Se elimino el registro') {
    

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

