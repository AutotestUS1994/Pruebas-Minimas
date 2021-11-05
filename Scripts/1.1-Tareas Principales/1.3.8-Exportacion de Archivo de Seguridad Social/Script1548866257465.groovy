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

WebUI.callTestCase(findTestCase('Hutilidades/Tareas Administracion Compensacion/Tarea Seguridad Social'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/td_Planilla Empleados Empresa'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/td_Planilla Empleados Empresa'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/img_csv'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/img_csv'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/a_Archivo'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/a_Archivo'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/a_Archivo_1'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/a_Si'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Exportacion de Archivo de Seguridad Social/a_Si'))

WebUI.closeBrowser()

