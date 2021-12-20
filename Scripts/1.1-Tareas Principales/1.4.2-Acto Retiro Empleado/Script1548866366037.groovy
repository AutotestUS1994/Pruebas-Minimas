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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Actos Administrativos/Tarea Actos Administrativos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/i_Acto Movimento de planta_gly'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/i_Acto Movimento de planta_gly'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Actos de Retiro del empleado'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Actos de Retiro del empleado'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_terminacion de contrato'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Elaboracin_form_popupSeleccionDerogarj_idt134'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Elaboracin_form_popupSeleccionDerogarj_idt134'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Identificacin_form_actoAusentismoj_idt1208'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Identificacin_form_actoAusentismoj_idt1208'))

WebUI.setText(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/input_Filtro Empleado_form_actoAusentismoj_idt1434'), 
    '66666')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/input_Filtro Empleado_form_actoAusentismoj_idt1434'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_SALGADO PAULA'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/span_SALGADO PAULA'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar'))

WebUI.setText(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/input__form_actoAusentismoj_id'), 
    '31/12/2018')

WebUI.setText(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/input__form_actoAusentismoj_id_6'), 
    '66666')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar_1'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Continuar_1'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Aplicar'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Actos Administrativos/Acto Retiro Empleado/a_Aplicar'))

WebUI.closeBrowser()

