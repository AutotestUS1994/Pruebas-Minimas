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
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import java.io.File as File
import com.kms.katalon.entity.testsuite.RunConfigurationDescription as RunConfigurationDescription

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

String RutaA = Systema()

if (RutaA == 'Windows 10') {
    def rutaW = System.getProperty('user.home') + '/Downloads/'

    rutaW = rutaW.replace('/', '\\')

    println('ESTA ES LA RUTA' + rutaW)

    RutaA = rutaW
} else if (RutaA == 'Linux') {
    def rutaW = System.getProperty('user.home') + '/Descargas/'

    println('ESTA ES LA RUTA' + rutaW)

    RutaA = rutaW
} else {
    RutaA = 'ERROR'

    WebUI.acceptAlert()
}

String rutaA = RutaA

println(rutaA)

String Archivo = 'PNP - PAGO DE NOMINA (1).pdf'

String Archivo1 = 'PNP - PAGO DE NOMINA (1).xlsx'

String Archivo2 = 'ACE - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO).pdf'

String Archivo3 = 'ACE - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO).xlsx'

String Archivo4 = 'CMEZ - ACUMULADO MENSUAL CONCEPTOS NOMINA POR EMPLEADO (PAGADO).pdf'

String Archivo5 = 'CMEZ - ACUMULADO MENSUAL CONCEPTOS NOMINA POR EMPLEADO (PAGADO).xlsx'

String Archivo6 = 'CMT - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO).pdf'

String Archivo7 = 'CMT - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO).xlsx'

//-----------------------------------------------------------------------------
String Archivo8 = 'PPN - REPORTE PLANILLA NOMINA.pdf'

String Archivo9 = 'PPN - REPORTE PLANILLA NOMINA.xlsx'

String Archivo10 = 'RECO- RESUMEN  POR CONCEPTO (PAGADO).pdf'

String Archivo11 = 'RECO- RESUMEN  POR CONCEPTO (PAGADO).xlsx'

//-----------------------------------------------------------------------------
String Archivo12 = 'CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA_CCOSTO.pdf'

String Archivo13 = 'CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA_CCOSTO.xlsx'

String Archivo14 = 'PNP - PAGO DE NOMINA.pdf'

String Archivo15 = 'PNP - PAGO DE NOMINA.xlsx'

String Navegador = DriverFactory.getExecutedBrowser()

println(Navegador)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Ir_nav_t66_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Ir_nav_t66_input'), 
    'Ejecutar Reporte Planilla (com)')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/Ejecutar Reporte Planilla (com)'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/Ejecutar Reporte Planilla (com)'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'PNP - PAGO DE NOMINA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA/CCOSTO')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'RECO')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'PPN - REPORTE PLANILLA NOMINA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarRepor'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_SeleccioneTodosFuera de Nmina'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_SeleccioneTodosFuera de Nmina'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'CMT - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaInicio_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaFinal_input'), 
    '30/07/2021')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'CMEZ - ACUMULADO MENSUAL CONCEPTOS NOMINA POR EMPLEADO (PAGADO)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaInicio_input'), 
    '01/07/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaFinal_input'), 
    '30/07/2021')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'ACE - ACUMULADO MENSUAL CONCEPTOS DE NOMINA (PAGADO)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaInicio_input'), 
    '01/11/2018')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Rango Fechas_ejecutarReportePlanillafechaFinal_input'), 
    '30/11/2018')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/input_Actos Administrativos_ejecutarReporte'), 
    'PNP - PAGO DE NOMINA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Actos Administrativos_ejecutarReportePlanillaj_idt61'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/td_CNC- CONSOLIDADO PERIODO DE NOMINA POR LINEA CCOSTO'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_ejecutarReportePlanillaj_idt73'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/select_--  Seleccione  --Periodo CerradoPeriodo en Proceso'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_P. MensualJunio2021'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/label_pdf'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Aplicar'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/span_Reporte_glyphicons glyphicons-article'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Generar Reporte'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Ejecutar Reporte Planilla/a_Periodo Nomina_Cerrar'))

WebUI.delay(2)

//detectar y eliminar archivo
String r1 = ''

String r2 = ''

String r3 = ''

String r4 = ''

String r5 = ''

String r6 = ''

String r7 = ''

String r8 = ''

String r9 = ''

String r10 = ''

String r11 = ''

String r12 = ''

String r13 = ''

String r14 = ''

String r15 = ''

String r16 = ''

if (Navegador == 'Firefox') {
    r1 = 'ok'

    r3 = 'ok'

    r5 = 'ok'

    r7 = 'ok'

    r9 = 'ok'

    r11 = 'ok'

    r13 = 'ok'

    r14 = 'ok'

    r15 = 'ok'

    r16 = 'ok'
}

//Assert.assertTrue(archivoDescargado(rutaA, Archivo, Archivo1, Archivo2, Archivo3, Archivo4, Archivo5, Archivo6, Archivo7, 
       // Archivo8, Archivo9, Archivo10, Archivo11, Archivo12, Archivo13, Archivo14, Archivo15, r1, r2, r3, r4, r5, r6, r7, 
        //r8, r9, r10, r11, r12, r13, r14, r15, r16 //----------------------------------------------------
        //-----------------------------------------------------
        //-----------------------------------------------------
        //-----------------------------------------------------
        //-----------------------------------------------------
        //-----------------------------------------------------
        //-----------------------------------------------------
        //) //-----------------------------------------------------
   // ) //------------------------------------------------------
//------------------------------------------------------
//-------------------------------------------------------
//-------------------------------------------------------
//-------------------------------------------------------
//else if ((dirContenidos[i]).getName().equals(Archivo14)) {
//(dirContenidos[i]).delete()
//System.out.println(dirContenidos)
//r1 = 'ok'
//println(r1)
//}
//dirContenidos[i]).delete()
//else if ((dirContenidos[i]).getName().equals(Archivo15)) {
// (dirContenidos[i]).delete()
//r2 = 'ok'
//println(r2)
//}
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()
//(dirContenidos[i]).delete()

def Systema() {
    String RutaA = System.getProperty('os.name')
}

boolean archivoDescargado(String rutaA, String Archivo, String Archivo1, String Archivo2, String Archivo3, String Archivo4, String Archivo5, String Archivo6, String Archivo7, String Archivo8, String Archivo9, String Archivo10, String Archivo11, String Archivo12, String Archivo13, String Archivo14, String Archivo15, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16) {
    File dir = new File(rutaA)

    File[] dirContenidos = dir.listFiles()

    WebUI.delay(2)

    dirContenidos = dir.listFiles()

    for (int i = 0; i < dirContenidos.length; i++) {
        if ((dirContenidos[i]).getName().equals(Archivo)) {
            (dirContenidos[i]).delete()

            System.out.println(dirContenidos)

            r1 = 'ok'

            System.out.println(r1)
        }
        
        if (r1 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos[i])

        if ((dirContenidos[i]).getName().equals(Archivo1)) {
            (dirContenidos[i]).delete()

            r2 = 'ok'

            System.out.println(r2)
        }
        
        if (r2 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo2)) {
            (dirContenidos[i]).delete()

            r3 = 'ok'

            System.out.println(r3)
        }
        
        if (r3 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo3)) {
            (dirContenidos[i]).delete()

            r4 = 'ok'

            System.out.println(r4)
        }
        
        if (r4 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo4)) {
            (dirContenidos[i]).delete()

            r5 = 'ok'

            System.out.println(r5)
        }
        
        if (r5 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo5)) {
            (dirContenidos[i]).delete()

            r6 = 'ok'

            System.out.println(r6)
        }
        
        if (r6 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo6)) {
            (dirContenidos[i]).delete()

            r7 = 'ok'

            System.out.println(r7)
        }
        
        if (r7 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo7)) {
            (dirContenidos[i]).delete()

            r8 = 'ok'

            System.out.println(r8)
        }
        
        if (r8 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo8)) {
            (dirContenidos[i]).delete()

            r9 = 'ok'

            System.out.println(r9)
        }
        
        if (r9 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo9)) {
            (dirContenidos[i]).delete()

            r10 = 'ok'

            System.out.println(r10)
        }
        
        if (r10 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo10)) {
            (dirContenidos[i]).delete()

            r11 = 'ok'

            System.out.println(r11)
        }
        
        if (r11 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo11)) {
            (dirContenidos[i]).delete()

            r12 = 'ok'

            System.out.println(r12)
        }
        
        if (r12 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos[i])

        System.out.println(Archivo12)

        if ((dirContenidos[i]).getName().equals(Archivo12)) {
            (dirContenidos[i]).delete()

            r13 = 'ok'
        } else {
            r13 = 'falla'
        }
        
        System.out.println(r13)

        if (r13 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos)

        if ((dirContenidos[i]).getName().equals(Archivo13)) {
            (dirContenidos[i]).delete()

            r14 = 'ok'

            System.out.println(r14)
        }
        
        if (r14 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        System.out.println(dirContenidos[i])

        System.out.println(Archivo15)

        if ((dirContenidos[i]).getName().equals(Archivo15)) {
            (dirContenidos[i]).delete()

            r16 = 'ok'

            println(r16)
        }
        
        if (r16 == 'ok') {
            break
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        if ((dirContenidos[i]).getName().equals(Archivo14)) {
            (dirContenidos[i]).delete()

            r15 = 'ok'

            println(r1)
        }
        
        if (r15 == 'ok') {
            break
        }
    }
    
    println(((((((((((((((((((((((((((((((' r1= ' + r1) + ' r2= ') + r2) + ' r3= ') + r3) + ' r4= ') + r4) + ' r5= ') + 
        r5) + ' r6= ') + r6) + ' r7= ') + r7) + ' r8= ') + r8) + ' r9= ') + r9) + ' r10= ') + r10) + ' r11= ') + r11) + 
        ' r12= ') + r12) + ' r13= ') + r13) + ' r14= ') + r14) + 'r15=') + r15) + 'r16=') + r16)

    dirContenidos = dir.listFiles()

    if ((((((((((((((((r1 == 'ok') && (r2 == 'ok')) && (r3 == 'ok')) && (r4 == 'ok')) && (r5 == 'ok')) && (r6 == 'ok')) && 
    (r7 == 'ok')) && (r8 == 'ok')) && (r9 == 'ok')) && (r10 == 'ok')) && (r11 == 'ok')) && (r12 == 'ok')) && (r13 == 'ok')) && 
    (r14 == 'ok')) && (r15 == 'ok')) && (r16 == 'ok')) {
        String Resultado = 'PRUEBA OK-Archivos coincidieron en nombre'

        System.out.println(('Descargas tiene: ' + dirContenidos.length) + ' archivo(s)')

        System.out.println('Se eliminaran archivos diferentes a los descargados...')

        for (int i = 0; i < dirContenidos.length; i++) {
            if (dirContenidos.length > 0) {
                (dirContenidos[i]).delete()

                println('Se eliminó archivo: ' + (dirContenidos[i]).getName())
            }
        }
        
        WebUI.closeBrowser()

        return true
    } else if (dirContenidos.length == 0) {
        String Resultado = 'PRUEBA OK-Descargas quedo vacio'

        WebUI.closeBrowser()

        return true
        
        WebUI.acceptAlert()
    }
}

/*---------------------------------------------------------------------------------------*/ 