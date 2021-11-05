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

WebUI.callTestCase(findTestCase('Hutilidades/Tareas Administracion Compensacion/Tarea Liquidacion Nomina'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/a_Periodo Nomina_LiquidacionNominaj_idt63'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/a_Periodo Nomina_LiquidacionNominaj_idt63'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'))

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    2)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/span_P MensualJulio2021'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/span_P MensualJulio2021'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/span_Archivo Plano'))

WebUI.selectOptionByValue(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/select_ddMMyyddMMyyyyyyMMddyyy'), 
    'dd/MM/yyyy', true)

WebUI.selectOptionByValue(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/select_Acumular valorAdicionar'), 
    'I', true)

WebUI.uploadFile(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/Archivo'), 
    'E:\\unionweb14\\ArchivoPlanoLiquidacionNomina.txt')

filePath = WebUI.getAttribute(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/Archivo'), 
    'value')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/a_Importar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/a_Importar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/span_Aplicar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Periodo en Proceso - Archivo Plano/Page_SARA/span_Si'))

WebUI.getText(findTestObject('Alerta/Alerta'))

WebUI.closeBrowser()

