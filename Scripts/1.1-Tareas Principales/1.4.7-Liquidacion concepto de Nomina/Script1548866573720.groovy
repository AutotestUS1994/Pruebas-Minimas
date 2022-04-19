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

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/a_Periodo Nomina_Liquidacion'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/a_Periodo Nomina_Liquidacion'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/select_--  Seleccione  --Periodo Cerrado'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/select_--  Seleccione  --Periodo Cerrado'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/select_--  Seleccione  --Periodo Cerrado'), 
    '2')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_PM202107'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_PM202107'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/a_Nombre Persona_LiquidacionNo'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/a_Nombre Persona_LiquidacionNo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/input_close_popupFiltroEmplead'), 
    '1065')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/input_close_popupFiltroEmplead'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_CONSTA BELFEGORD JHON'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_CONSTA BELFEGORD JHON'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/td_Mendoza 1015 Empleado'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/td_Mendoza 1015 Empleado'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/em_Concepto'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/em_Concepto'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_Liquidar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_Liquidar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_Si'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar licencia Remunerada/Liquidacion Concepto de Nomina/span_Si'))

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Result == 'Liquidación exitosa') {
    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

