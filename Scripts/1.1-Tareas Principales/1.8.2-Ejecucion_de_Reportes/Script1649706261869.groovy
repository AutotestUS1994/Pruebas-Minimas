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

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

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

/*------------------------clic javaScript------------------*/
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Generar'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

/*---------------------------------------------------------*/
WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_El proceso fue ejecutado correctamente'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Procedimiento_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

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

/*--------------------------Clic JavaScript-------------------------*/
WebElement element0 = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Generar'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element0))

/*--------------------------*/
WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_El proceso fue ejecutado correctamente'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Descargar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Procedimiento_ui-icon ui-icon-closethick'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

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

/*set text javaScript*/
WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Correo_popupReportej_idt1323'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element2))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Correo_popupReportej_idt1323'), 
    RamdomNum() + 'noodle@gmail.com')

/*---------------------------Clic  javaScript-------------------------*/
WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Enviar'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Proceso se genera en segundo plano y enviara el correo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

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

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/select_CALIDADMENSUAL ABCMODELO EMPRESA QUINCENALPANSIONADOSPENSIONADOS BASEPRUEBAS'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Generar_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Excel_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/select_40 MIL STAFF (20145   )ABOGADO (20139   )ABOGADO JUNIOR (20117   )'), 
    '2')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Enviar correo_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

/*Click JavaScript*/
WebElement element3 = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Boton_Publicar'),
	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element3))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Regresar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/td_Reporte dinamico Prueba Katalon'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/span_Que desea hacer_ui-radiobutton-icon ui-icon ui-icon-blank ui-c0'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Generar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Descargar'))

WebUI.switchToWindowTitle('SARA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Cerrar popup'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/td_Enviar correo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Correo_popupReportej_idt13230'), 
    RamdomNum() + 'noodle@gmail.com')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Enviar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Regresar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Parmetros_listaReporteFormj_idt64'), 
    'xlsm')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Parmetros_listaReporteFormj_idt64'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/td_columnario xlsm SAGE-000608'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Que desea hacer_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Generar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Descargar'))

WebUI.switchToWindowTitle('SARA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Cerrar popup'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Ejecutar0'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Descargar_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Correo_popupReportej_idt13231'), 
    RamdomNum() + 'noodle@gmail.com')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Enviar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/div_Regresar'))

WebUI.closeBrowser()

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

