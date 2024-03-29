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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/input_Secciones_form_templatej_idt286j_idt29'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_ADMINISTRADOR DEL SISTEMA - SARA_cerrar_menu'))

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/label_Nueva Hoja Vida'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/label_Nueva Hoja Vida'))

WebUI.waitForElementClickable(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_Listado Hojas de Vida'), 
    0)

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_Listado Hojas de Vida'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/input_Identificacin_listado_hojaVidaj_idt63'), 
    '355682169')

WebUI.sendKeys(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/input_Identificacin_listado_hojaVidaj_idt63'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/td_355682169'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_Adjuntar Archivo'))

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_nuevo'))

WebUI.setText(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/input_Descripcin_hojaVidasecciondescripcion'), 
    'prueba')

WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_Continuar'))

//String creado para redireccionar  los archivos requeridos por el test//
String ra = ''

String ruta = Systema(ra) + 'HojaDeVida.pdf'

println(ruta)

WebUI.uploadFile(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/input_Cargar Archivo_popupCargarArchivoForminputFileName_input'), 
    ruta)

String Result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

while (WebUI.waitForElementVisible(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/span_prueba'), 
    1)) {
    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/td_prueba'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_Eliminar'))

    WebUI.click(findTestObject('2-OBJECTS TAREAS SECUNDARIAS/Pruebas Hoja de Vida/Crear_Nueva_Hoja_de_Vida_(adjuntar_documento)/a_Si'))
}

if (Result == 'Se Ingreso anexo exitosamente') {
    String Resultado = 'PRUEBA OK'

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

