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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import java.util.stream.Collectors as Collectors
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import org.apache.poi.hssf.record.PageBreakRecord.Break as Break
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

String Navegador = DriverFactory.getExecutedBrowser()

println(Navegador)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/input_Generacion Interfaz_form_templatej_idt24_input'), 
    'Generacion Interfaz')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/li_Generacion interfaz (com)'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_INTERFAZ PROVISIONES'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/input_Fecha_generacionInterfazfechacomprobante_input'), 
    '01/07/2017')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_Filtrar'))

if (WebUI.waitForElementPresent(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_01072017'), 
    1)) {
    WebUI.check(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/div_-_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover0'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Ver'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Reversar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Aceptar'))
}

WebUI.waitForElementPresent(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Generar'), 
    0)

WebUI.waitForElementPresent(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Generar'), 
    0)

WebUI.waitForElementPresent(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Generar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Generar'))

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/select_NOMINA MENSUALNOMINA QUINCENAL'), 
    2)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/input_Fecha Inicial_popupGeneracionInterfazinicial_input'), 
    '01/07/2017')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/input_Fecha Final_popupGeneracionInterfazfinal_input'), 
    '31/07/2017')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/input_Fecha Proceso_popupGeneracionInterfazfechaProceso_input'), 
    '01/07/2017')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_Generar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/button_Si'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Continuar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Exportar'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/label_pdf'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Generar Reporte'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Descargar'))

WebUI.switchToWindowTitle('SARA')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Total Otro_ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ui-state-hover'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Total Otro_ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ui-state-hover'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Exportar'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/span_Reporte_glyphicons glyphicons-article'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/label_xlsData'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Generar Reporte'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Generacion_Interfaz_Contable/a_Descargar'))

//-------------- Comprobacion y eliminado de descarga ------------
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

String Archivo = 'Reporte.pdf'

String Archivo1 = 'Reporte.xlsx'

Assert.assertTrue(archivoDescargado(rutaA, Archivo, Archivo1, Navegador))

def Systema() {
    String RutaA = System.getProperty('os.name')
}

boolean archivoDescargado(String rutaA, String Archivo, String Archivo1, Navegador) {
    WebUI.delay(2)

    File dir = new File(rutaA)

    File[] dirContenidos = dir.listFiles()

    System.out.println(dirContenidos)

    for (int i = 0; i < dirContenidos.length; i++) {
        if ((dirContenidos[i]).getName().equals(Archivo1)) {
            if ((dirContenidos[i]).isFile()) {
                (dirContenidos[i]).delete()

                String ResultF = 'archivo1 ok'

                System.out.println(ResultF)
            }
        }
    }
	println(Navegador)
    if(Navegador != 'Firefox'){
    File dir1 = new File(rutaA)

    File[] dirContenidos1 = dir1.listFiles()

    System.out.println(dirContenidos1)
	
    for (int i = 0; i < dirContenidos1.length; i++) {
        if ((dirContenidos1[i]).getName().equals(Archivo)) {
            if ((dirContenidos1[i]).isFile()) {
                (dirContenidos1[i]).delete()

                String ResultF1 = 'prueba ok'

                System.out.println(ResultF1)

                WebUI.closeBrowser()

                return true
            }
        }
    }
    
    return false
    
    WebUI.acceptAlert()
    }else{return true}
}

