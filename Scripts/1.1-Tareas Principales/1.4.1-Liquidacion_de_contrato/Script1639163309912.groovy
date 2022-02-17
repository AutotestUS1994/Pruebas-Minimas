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

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Listado Empleados'), 
    [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Motivo de Retiro'))

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --SUSTITU'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_---SELECCIONE ---Direct'), 
    '1')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Fecha Pago_cancelacion_c'), 
    '31/07/2021')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --comprob'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Calculo Nomina'))

WebUI.selectOptionByLabel(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/select_-- Seleccione --comprob'), 
    'comprobante planilla liquidacacion', false)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Nuevo0'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_SALARIO BASICO'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Guardar0'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Variable'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Nuevo_variable'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Variable_popupVariablaPeriodo_formj_idt777'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_APLICA PAGO PRIMA VACACIONES'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Valor_popupVariablaPeriodo_formvalorMostrar'), 
    '200000')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Guardar1'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Novedad Fecha'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Nuevo1'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Variable_variableFechaPeriodo_formj_idt200'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_FLEX - AUXILIO MONET'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Base_variableFechaPeriodo_formcantidadFecha_input'), 
    '01/06/2021')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Base_variableFechaPeriodo_formcantidadFecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Valor_variableFechaPeriodo_formvalor'), 
    '100000')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/input_Presupuestal_variableFechaPeriodo_formpresupuestal'), 
    '100000')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/textarea_Observacin_variableFechaPeriodo_formobservacion'), 
    'pruebas k')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Guardar2'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Concepto'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Prestaciones Sociales'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/span_Si'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Reporte'))

WebUI.waitForElementPresent(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Regresar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Liquidar Conceptos y Variables/a_Regresar'))

WebUI.closeBrowser()

