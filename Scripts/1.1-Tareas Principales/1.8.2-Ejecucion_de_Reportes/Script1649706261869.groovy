import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Empresa 1_form_templatej_idt24_input'), 
    'Ejecucion Reporte (gna)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Ejecucion Reporte (gna)'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Parmetros_listaReporteFormj_idt64'), 
    'Katalon')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Parmetros_listaReporteFormj_idt64'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/td_Reporte Vencimiento de Contratos Pruebas Katalon'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ver sentencia'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/textarea_select meml_hojavida, ceml_unidad, ceml_zonaeconomica, ceml_centrocosto, ceml_cargo,neml_vinculacion'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Plantilla_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/label_Excel'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/label_Descargar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Fecha())

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Estado Texto_popupReportetablaParametroReporte1j_idt1300'), 
    'L')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Empresa Numero_popupReportetablaParametroReporte2j_idt1302'), 
    '1')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Empresa Decimal_popupReportetablaParametroReporte3j_idt1303'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/select_CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Excel_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/label_Excel'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/select_Lista Cargo Empresa_popupReportetablaParametroReporte5j_idt1304'), 
    2)

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Descargar_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/label_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Generar'))

WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_El proceso fue ejecutado correctamente'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Procedimiento_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Fecha())

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Estado Texto_popupReportetablaParametroReporte1j_idt1300'), 
    'L')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Empresa Numero_popupReportetablaParametroReporte2j_idt1302'), 
    '1')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Empresa Decimal_popupReportetablaParametroReporte3j_idt1303'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/label_Excel'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Excel_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Descargar_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/label_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Generar'))

WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_El proceso fue ejecutado correctamente'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Procedimiento_ui-icon ui-icon-closethick'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Fecha())

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Estado Texto_popupReportetablaParametroReporte1j_idt1300'), 
    'L')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Empresa Numero_popupReportetablaParametroReporte2j_idt1302'), 
    '1')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Empresa Decimal_popupReportetablaParametroReporte3j_idt1303'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/label_Excel'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Excel_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Descargar_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Descargar_ui-radiobutton ui-widget'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Correo_popupReportej_idt1323'), 
    RamdomNum() + 'noodle@gmail.com')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Enviar'))

WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Proceso se genera en segundo plano y enviara el correo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

def RamdomNum() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String identificacion = random_double.toString().replace('.0', '')
}

def Fecha() {
    Date today = new Date()

    String Dia = today.format('dd')

    String Mes = today.format('MM')

    String Año = today.format('yyyy')

    String FechaI = (((Dia + '/') + Mes) + '/') + Año
}

