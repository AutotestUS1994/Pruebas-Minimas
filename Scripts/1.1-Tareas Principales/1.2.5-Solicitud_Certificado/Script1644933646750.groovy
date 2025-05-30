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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Listado Empleados'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Identificacin_listadoEmp'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Identificacin_listadoEmp'), 
    '354968431354')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Identificacin_listadoEmp'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/span_CONSTA BELFEGORD JHON'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Solicitud'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/span_Certificado Personal Planta_ preexistente'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/span_Certificado Personal Planta_ preexistente'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Eliminar'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Eliminar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/span_Si'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/span_Prueba'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Acta De Grado   Diploma_form_solicitudesEmpleadolistaDocumentos0j_idt2892'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Acta De Grado   Diploma_form_solicitudesEmpleadolistaDocumentos0j_idt2892'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Se ha cargado el archivo_popupDocumentoNovedad'), 
    0)

//String creado para redireccionar  los archivos requeridos por el test//
//obtener  sistema  operativo y definir ruta
String ra = ''

String ruta = Systema(ra) + 'certificado_personal_planta.txt'

WebUI.uploadFile(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Se ha cargado el archivo_popupDocumentoNovedad'), 
    ruta)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Vigencia_popupDocumentoNovedad'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Vigencia_popupDocumentoNovedad'), 
    '01/07/2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/input_Vigencia_popupDocumentoNovedad_formvigencia_input'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/textarea_Observacin_popupDocumentoNovedad_formobservacion'), 
    'PRUEBA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Guardar_Solicitud'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Guardar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Solicitud certificado/a_Guardar'))

String Alerta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Alerta == 'SE PROCESARÁ SU SOLICITUD') {
    

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

def Systema(def ra) {
    String RutaA = System.getProperty('os.name')

    if (RutaA == 'Windows 10') {
        def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimientos/Documento para pruebas/'

        rutaW = rutaW.replace('/', '\\')

        println('Esta es la ruta:' + rutaW)

        ra = rutaW
    } else if (RutaA == 'Linux') {
        def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimientos/Documento para pruebas/'

        println('ESTA ES LA RUTA' + rutaW)

        ra = rutaW
    } else {
        ra = 'ERROR'

        WebUI.acceptAlert()
    }
}

