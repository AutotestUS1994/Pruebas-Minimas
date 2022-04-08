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

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    'Listado de empleados')

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/span_Listado de Empleados'), 
    0)

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_ADMINISTRADOR DEL SISTEMA - SARA_form_templatej_idt24_input'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Identificacin_1234567890'), 
    '1234567890')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Identificacin_1234567890'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/span_Gomez Jose'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Incapacidad'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Histrico_Pestaa'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Histrico_Pestaa'))

if (WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/span_Enfermedad General 21'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/span_Enfermedad General 21'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Eliminar_Incapacidad'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Aceptar_Eliminar_Incapacidad'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Nuevo'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/span_Enfermedad General 21'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/span_Enfermedad General 21'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/label_NO'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Salida'), '01/01/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Termina'), '02/01/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Regreso'), '03/01/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Salida Nomina'), 
    '28/02/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Regreso Nomina'), 
    '02/03/2021')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Reales'), '2')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Horas Adicionales'), 
    '500')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Das Acumulados'), 
    '0')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/input_Inicio_form_incapacidadesEmpleadotabsIncapacidadestabfechaInicioIng_input'), 
    '01/01/2021')

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/select_Entidad'), 
    '11')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/textarea_Observacin'), 
    'PRUEBA')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Guardar'))

WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Eliminar_Incapacidad'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Eliminar_Incapacidad'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Crear Histórica Incapacidad/a_Aceptar_Eliminar_Incapacidad'))

WebUI.closeBrowser()

