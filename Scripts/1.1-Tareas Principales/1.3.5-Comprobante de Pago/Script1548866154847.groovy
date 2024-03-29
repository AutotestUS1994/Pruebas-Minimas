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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Liquidacion Nomina'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_Periodo Nomina_LiquidacionNominaj_idt63'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_Periodo Nomina_LiquidacionNominaj_idt63'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    2)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/span_P MensualJulio2021'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_Nombre Persona_LiquidacionNo'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_Nombre Persona_LiquidacionNo'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/input_close_popupFiltroEmplead'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/input_close_popupFiltroEmplead'), 
    '66666')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/input_close_popupFiltroEmplead'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/td_SALGADO PAULA'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/td_SALGADO PAULA'), 
    0)

WebUI.check(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/check'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/span_Generar Comprobante'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/input_Publicar_formComprobante'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/select_-- Seleccione --Comprob'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/input_Mensaje'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_Comprobante de Nomina'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/select_-- Seleccione --Comprob'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/span_Comprobante De Nomina'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_Generar'))

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_Comprobante'))

WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_doc'), 
    1) || WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_doc - Copy'), 
    1)) {
    String Result = 'PRUEBA OK'

    WebUI.closeBrowser()
} else if (WebUI.verifyElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Comprobante de Pago/a_doc - Copy'))) {
    String Result = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

