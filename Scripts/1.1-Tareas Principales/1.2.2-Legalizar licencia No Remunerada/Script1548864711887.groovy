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
import com.kms.katalon.selenium.driver.CChromeDriver as CChromeDriver
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Listado Empleados'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    '354968431354')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Identificacin_listadoEmpleadoIdentificacionEmpleado'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_Consta Belfegord Jhon'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_Consta Belfegord Jhon'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Licencia'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Licencia'))

while (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/td_Licencia No Remunerada'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/td_Licencia No Remunerada'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Eliminar Directo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Aceptar_ELIMINAR'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Incapacidad'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Histrico'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_Enfermedad General 21'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_Enfermedad General 21'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Eliminar'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Aceptar'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Licencia'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'), 
    GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_LICENCIA NO REMUNERADA'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_LICENCIA NO REMUNERADA'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Histrico'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_01012021'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_01012021'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Eliminar liciencia'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Aceptar_ eliminar licencia'))
}

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Pestaa Licencia'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Pestaa Licencia'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Nuevo'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/span_LICENCIA NO REMUNERADA'))
}

WebUI.waitForElementPresent(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida_form_licenc'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida_form_licenc'), 
    '01/01/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Fecha Salida Nomina_form'), 
    '28/02/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/textarea_Observacin_form_licen'), 
    'Prueba 2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Fecha 1_form_licenciaEmp'), 
    '01/01/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Das Ausentismo_form_lice'), 
    '2')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Fecha 1_form_licenciaEmp_11'), 
    '28/02/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/textarea_Area_form_licenciaEmp'), 
    'Prueba 2021')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/textarea_Area_form_licenciaEmpleadotabs'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/textarea_Area_form_licenciaEmpleadotabs'), 
    'Prueba')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Horas adicionales_form_licenciaEmpleadotabs'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Horas adicionales_form_licenciaEmpleadotabs'), 
    '0500')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Afiliacin Eps_form_licenciaEmpleadotabs'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Afiliacin Eps_form_licenciaEmpleadotabs'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/Page_SARA/div_Se ha cargado el archivo_ui-fileupload-_55cbf6'), 
    0)

//WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Se ha cargado el archivo_popupDocumentoNovedad_forminputFileNameArchivo_input'))
/*WebElement element = WebUiCommonHelper.findWebElement(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Se ha cargado el archivo_popupDocumentoNovedad_forminputFileNameArchivo_input'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))*/
WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/Page_SARA/div_Se ha cargado el archivo_ui-fileupload-_55cbf6'))

//String creado para redireccionar  los archivos requeridos por el test//
//obtener  sistema  operativo y definir ruta
String ra = ''

String ruta = Systema(ra) + 'ArchivoPlanoLiquidacionNomina.txt'

println(ruta)

WebUI.uploadFile(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Se ha cargado el archivo_popupDocumento'), 
    ruta)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Vigencia_popupDocumentoNovedad_formvigencia_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/input_Vigencia_popupDocumentoNovedad_formvigencia_input'), 
    '01/12/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/textarea_Observacin_popupDocumentoNovedad_formobservacion'), 
    'PRUEBA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Guardar_archivo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Legalizar Licencia No Remunerada/a_Guardar_1'))

String Alerta = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (Alerta == 'Se modifico exitosamente su solicitud') {
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

