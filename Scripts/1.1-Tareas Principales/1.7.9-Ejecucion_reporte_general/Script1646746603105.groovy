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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

String profileName = RunConfiguration.getExecutionProfile()

String ResultCIR

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Empresa 1_form_templatej_idt24_input'), 
    'ejecucion reporte (gna)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/li_Ejecucion Reporte (gna)'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
    'CIR - CERTIFICADO DE INGRESOS Y RETENCIONES')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
    Keys.chord())

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_CIR - CERTIFICADO DE INGRESOS Y RETENCIONES'), 
    0)

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_CIR - CERTIFICADO DE INGRESOS Y RETENCIONES'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Ejecutar_cir'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Ejecutar_cir'))
} else {
    WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_CIR - CERTIFICADO DE INGRESOS Y RETENCIONES'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Ejecutar_cir'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/span_plantilla'))

println(profileName)

if (profileName == 'default') {
    WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/span_descargar'))
} else if (profileName == 'weblogic') {
    WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/span_descargarWeblogic'))
} else {
    WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/span_descargar'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Generar_cir'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Continuar_Generar'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Continuar_Generar'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Continuar_Generar'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Continuar_Generar'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'), 
    0)

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Continuar_Generar'), 
    0)

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'))

    WebUI.switchToWindowIndex(1)

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/descargaArchivosSeguro'), 
        0)) {
    } else {
        ResultCIR = 'no se descargo con exito'
    }
    /*ResultCIR = 'no se descargo con exito'*/
} else {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Continuar_Generar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar_cir'))

    WebUI.switchToWindowIndex(1)

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/descargaArchivosSeguro'), 
        0)) {
    } else {
        ResultCIR = 'no se descargo con exito'
    }
    
    WebUI.switchToWindowIndex(0)
}

WebUI.switchToWindowIndex(0)

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_cerrar'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_cerrar'))
}

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Empresa 1_form_templatej_idt24_input'), 
    'ejecucion reporte (gna)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/li_Ejecucion Reporte (gna)'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
    'pruebas  automaticas')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_pruebas  automaticas'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_pruebas  automaticas'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Campo'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_NIT'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_NIT'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_campo'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_codigo'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_codigo'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_campo'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Nombre'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Nombre'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_campo'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Entrada'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Numero Entero'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Numero Entero'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_entrada'))

        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar entrada'))
    }
    
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Reporte'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_reporte'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar reporte'))

    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_reporte'), 
        1)) {
        WebUI.acceptAlert()
    }
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Nuevo'), 
    2)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Nuevo'))
} else {
    WebUI.refresh()

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Nuevo'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Descripcin_reporteFormdescripcion'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Descripcin_reporteFormdescripcion'), 
    'pruebas  automaticas')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Titulo_reporteFormtitulo'), 
    'Pruebas  katalon')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/select_SeleccioneFIJOFUENTESQL'), 
    3)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/select_--Seleccione--NoSi'), 
    2)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/select_SeleccioneEjecutar limite de tiempo de la sesion'), 
    1)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/textarea_Sql_reporteFormsql'), 
    'SELECT  nemp_empresa "codigo", cemp_nombre "Nombre", memp_nit "NIT" FROM EMPRESA_EMP')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Guardar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Entrada'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Nuevo1'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Descripcin_formPopUpEntradaReporteentradaDescripcion'), 
    'Empresa')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Parmetro_formPopUpEntradaReporteentradaParametro'), 
    'Codempresa')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/select_DirectoLista'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/select_- Seleccione -FechaNumero DecimalNumero EnteroSerie NumeroSerie TextoTexto'), 
    3)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Orden_formPopUpEntradaReporteentradaOrden'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/label_Si'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Guardar1'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/span_No se encontr registros_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Campo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Generar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Tipo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Plantilla_btn_popupInformacion'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Buscar_form_PopupPlantillasj_idt74'), 
    'descargar.xlsx')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_descargar.xlsx'), 
    30)

/*--------------------------------------------------*/
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Nombre De La  Hoja_reporteFormexcel'), 
    'Hoja1')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/select_SeleccioneSin CifrarEncripcion DaviviendaEncripcion Citibank'), 
    1)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Guardar2'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas capacitacion/Comprobar Parametros/a_Ejecutar'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Empresa_popupReportetablaParametroReporte0j_idt477'), 
    '1')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/div_Generar_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/span_Que desea hacer_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Generar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Descargar'))

/*-----------------------------------Sección eliminar --------------------------------------------------------------------*/
WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/span_No se encontr registros_ui-icon ui-icon-closethick1'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Campo'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_NIT'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_NIT'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_campo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_codigo'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_codigo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_campo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
}

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Nombre'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Nombre'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_campo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Entrada'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Numero Entero'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/td_Numero Entero'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_entrada'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar entrada'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Reporte'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_reporte'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Aceptar_eliminar reporte'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Eliminar_reporte'), 
    1)) {
    WebUI.acceptAlert()
} else {
    if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Regresar'), 
        1)) {
        WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/a_Regresar'))

        WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Ejecucion reporte general/input_Actos Administrativos_listaReporteFormj_idt63'), 
            0)
    }
}

//----------Comprobación y eliminado de descarga ----------
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

String Archivo = 'Pruebas__katalon.xlsx'

System.out.println(rutaA)

if (ResultCIR == 'no se descargo con exito') {
    WebUI.acceptAlert()
}

def Systema() {
    String RutaA = System.getProperty('os.name')
}

boolean archivoDescargado(String rutaA, String Archivo) {
    File dir = new File(rutaA)

    File[] dirContenidos = dir.listFiles()

    System.out.println(dirContenidos)

    for (int i = 0; i < dirContenidos.length; i++) {
        if ((dirContenidos[i]).getName().equals(Archivo)) {
            if ((dirContenidos[i]).isFile()) {
                (dirContenidos[i]).delete()

                String ResultF = 'archivo ok'

                System.out.println(ResultF)

                WebUI.closeBrowser()

                return true
            }
        }
    }
    
    return false
    
    WebUI.acceptAlert()
}

