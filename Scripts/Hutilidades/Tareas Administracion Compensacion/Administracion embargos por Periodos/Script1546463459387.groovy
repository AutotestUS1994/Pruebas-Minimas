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

WebUI.callTestCase(findTestCase('Hutilidades/Modulos/Modulo Administracion Compensacion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Ir_nav_t66_input'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Ir_nav_t66_input'), 
    'Administracion Embargos')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Ir_nav_t66_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Generacin Por Periodos'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/input_BANCO AGRARIO_banco_agra'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/input_BANCO AGRARIO_banco_agra'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/a_Periodo_banco_agrario_t302'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/a_Periodo_banco_agrario_t302'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Mensual Noviembre'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Mensual Noviembre'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Generar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Generar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Archivo'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Archivo'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Periodo/span_Si'))

