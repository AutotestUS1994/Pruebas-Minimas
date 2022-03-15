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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Modulos/Modulo Administracion Compensacion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Ir_nav_t66_input'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Ir_nav_t66_input'), 
    'Administracion Embargos')

WebUI.waitForElementVisible(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Ir_nav_t66_input'), 
    0)

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Ir_nav_t66_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/span_Generacion Por Fechas'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Fecha Inicial_banco_agra'), 
    '01/01/2019')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Fecha Inicial_banco_agra'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Fecha Final_banco_agrari'), 
    '31/01/2019')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Fecha Final_banco_agrari'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Verificacion de campo Total Abonado/a_Nombre Funcionario_listadoEm'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/input_Tipo Periodo_banco_agrar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/span_Generar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/span_Archivo'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Administracion Embargos por Fecha/span_Si'))

