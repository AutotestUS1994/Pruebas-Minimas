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

WebUI.callTestCase(findTestCase('Tareas Administracion Compensacion/Tarea Listado Empleados'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Identificacin_listadoEmp'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Identificacin_listadoEmp'), 
    '10154472')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Identificacin_listadoEmp'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_CONSTA BELFEGORD JHON'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_CONSTA BELFEGORD JHON'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Terminar Contrato'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Terminar Contrato'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Liquidar'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Liquidar'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Fecha de Retiro_cancelac'), 
    '31/07/2021')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Motivo de Retiro'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Motivo de Retiro'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --SUSTITU'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --SUSTITU'))

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --SUSTITU'), 
    '1')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_---SELECCIONE ---Direct'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_---SELECCIONE ---Direct'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_---SELECCIONE ---Direct'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_---SELECCIONE ---Direct'), 
    '1')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Fecha Pago_cancelacion_c'), 
    '31/07/2021')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Calculo Nomina'))

try {
    String a = '65173e58e5fe483e8781783078c8c0dc'

    boolean b = true

    if ((findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --comprob') != 
    a) && b) {
        WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
    } else {
        WebUI.selectOptionByValue(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --comprob'), 
            '65173e58e5fe483e8781783078c8c0dc', true)

        WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Prestaciones Sociales'))

        WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Reporte'))

        WebUI.getText(findTestObject('Alerta/Alerta'))
    }
}
catch (Exception e) {
    e.printStackTrace('error', e)
} 

WebUI.closeBrowser()

