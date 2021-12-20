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

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Ir_nav_t66_input'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Ir_nav_t66_input'), 
    'Ejecutar Reporte Planilla')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Ir_nav_t66_input'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'PNP - PAGO DE NOMINA')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_html'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xml'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'REPORTE PLANILLA...')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--Seleccione--TodosNOMINA MENSUALNOMINA QUINCENAL'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--Seleccione--TodosNOMINA MENSUALNOMINA QUINCENAL'), 
    '1')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Continuar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'RECO')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_html'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xml'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'PPN - REPORTE PLANILLA NOMINA')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_P. MensualMayo2021'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_SeleccioneTodosFuera de Nmina'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/select_SeleccioneTodosFuera de Nmina'), 
    '1')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_html'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xml'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'CMT - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO)')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaInicio_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaFinal_input'), 
    '30/07/2021')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_html'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xml'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'CMEZ - ACUMULADO MENSUAL CONCEPTOS NOMINA POR EMPLEADO (PAGADO)')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaInicio_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaFinal_input'), 
    '30/07/2021')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_html'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xml'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'ACE - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO)')

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/td_PNP - PAGO DE NOMINA'))

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaInicio_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaFinal_input'), 
    '30/07/2021')

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_html'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/label_xml'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('Modulo Tarea Administracion Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.closeBrowser()

