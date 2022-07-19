import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.util.jar.JavaUtilJarAccessImpl as JavaUtilJarAccessImpl
import org.openqa.selenium.WebElement as WebElement
import org.apache.poi.hssf.record.PageBreakRecord.Break as Break
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

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

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

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

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion_de_Reportes/input_Fecha Terminacion_popupReportetablaParametroReporte0fecha_input'), 
    Keys.chord(Keys.ESCAPE))

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

//---------- Comprobación y eliminado de descarga ----------
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

String Archivo = 'columnario_xlsm_SAGE-000608.xlsm'

String Archivo1 = 'Reporte_Vencimiento_de_Contratos.xls'

System.out.println(rutaA)

Assert.assertTrue(archivoDescargado(rutaA, Archivo, Archivo1))

def Systema() {
    String RutaA = System.getProperty('os.name')
}

boolean archivoDescargado(String rutaA, String Archivo, String Archivo1) {
    File dir = new File(rutaA)

    File[] dirContenidos = dir.listFiles()

    System.out.println(dirContenidos)

    for (int i = 0; i < dirContenidos.length; i++) {
        if ((dirContenidos[i]).getName().equals(Archivo)) {
            if ((dirContenidos[i]).isFile()) {
                (dirContenidos[i]).delete()

                String ResultF = 'archivo borrado'

                System.out.println(ResultF)

                WebUI.closeBrowser()
            }
        }
    }
    
    for (int i = 0; i < dirContenidos.length; i++) {
        if ((dirContenidos[i]).getName().equals(Archivo1)) {
            if ((dirContenidos[i]).isFile()) {
                (dirContenidos[i]).delete()

                String ResultF1 = 'PRUEBA OK'

                System.out.println(ResultF1)

                return true
            }
        }
    }
    
    return false
    
    WebUI.acceptAlert()
}

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

