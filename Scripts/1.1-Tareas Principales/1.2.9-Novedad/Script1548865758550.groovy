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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Listado Empleados'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Identificacin_listadoEmp'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Identificacin_listadoEmp'), '354968431354')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Identificacin_listadoEmp'), Keys.chord(
        Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_CONSTA BELFEGORD JHON'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_CONSTA BELFEGORD JHON'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_Novedades'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_Novedades'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_Nuevo'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_Nuevo'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_Adicionar entidad de AFC'))

WebUI.delay(30)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Desde_form_novedadesEmpl'), '01/12/2018')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Desde_form_novedadesEmpl'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Hasta_form_novedadesEmpl'), '31/01/2019')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Hasta_form_novedadesEmpl'), Keys.chord(
        Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/a_Sucursal_form_novedadesEmple'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/a_Sucursal_form_novedadesEmple'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_AFC - HELM BANK'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/span_AFC - HELM BANK'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Cuenta_form_novedadesEmp'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Cuenta_form_novedadesEmp'), '63483135434398')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Valor_form_novedadesEmpl'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/input_Valor_form_novedadesEmpl'), '100')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/select_-- seleccione --Ciclo 0'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/select_-- seleccione --Ciclo 0'), 
    '1', true)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/textarea_Observacin_form_noved'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/textarea_Observacin_form_noved'), 'aaaaaaaaaaa')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/a_Guardar'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Novedades/a_Guardar'))

WebUI.getText(findTestObject('Alerta/Alerta'))

WebUI.closeBrowser()

