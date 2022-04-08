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

WebUI.callTestCase(findTestCase('0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Listado de Empleados')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/span_Listado de Empleados'), 
    0)

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Identificacin_1234567890'), 
    '1234567890')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Identificacin_1234567890'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/span_Gomez Jose'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Vacacin'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/span_Programacion De Vacaciones'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/span_Programacion De Vacaciones'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Eliminar_Programacion'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Aceptar_Eliminar_Programacion'))
}

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/td_Programada'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/td_Programada'))

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Eliminar Directo_Programada'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Eliminar Directo_Programada'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Aceptar_Programada'))
}

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Pestaa_Histrico'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Pestaa_Histrico'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Nuevo historico'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/select_Seleccione_PROGRAMACION DE VACACIONES'), 
    0)

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/select_Seleccione_PROGRAMACION DE VACACIONES'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/select_Seleccione_No Aplica'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/select_Seleccione_AUSENTISMO'), 
    '1')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Periodo Disfrute_form_vacaciones_Comienzo'), 
    '01/07/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Periodo Disfrute_form_vacaciones_Final'), 
    '07/07/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Fecha Regreso Nomina'), 
    '08/07/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Dias'), '6')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Periodo Servicio_Inicio'), 
    '01/07/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Periodo Servicio_Final'), 
    '07/07/2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/input_Periodo Servicio_Final'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/textarea_Observacin'), 
    'PRUEBA')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Guardar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Guardar'))

WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Eliminar_Historico'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Eliminar_Historico'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Aceptar_Eliminar_ Historico'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórico Vacaciones/a_Aceptar_Eliminar_ Historico'))

WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

