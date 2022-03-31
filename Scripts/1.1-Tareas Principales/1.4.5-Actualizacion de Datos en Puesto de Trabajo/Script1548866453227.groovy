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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

/*Este test genera errores devido a que katalon y la opcion verifyOptionSelectedByIndex detiene el test por lo que se hace necesario agregar  un STOPO_ ON_FAILURE*/
double random_double = (Math.random() * 9999) + 999

random_double = Math.round((random_double * 100) + 1000000)

String identificacion = random_double.toString().replace('.0', '')

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Planta Personal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/span_Administracion'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/span_Administracion'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/a_Abogado_organigramaj_idt110'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/a_Datos De Nomina'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/a_Zona Econmica_datosPuestoTrabajo_formj_idt1277'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/span_Centro Costo de Prueba'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_-- Seleccione empleados_lineacosto'), 
    FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyOptionSelectedByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_-- Seleccione empleados_lineacosto'), 
    1, 0, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_-- Seleccione empleados_lineacosto'), 
        3)
} else {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_-- Seleccione empleados_lineacosto'), 
        1)
}

if (WebUI.verifyOptionSelectedByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_-- Seleccione Ubicacin Fsica'), 
    3, 1, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_-- Seleccione Ubicacin Fsica'), 
        2)
} else {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_-- Seleccione Ubicacin Fsica'), 
        3)
}

if (WebUI.verifyOptionSelectedByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Turno'), 
    4, 1, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Turno'), 
        5)
} else {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Turno'), 
        4)
}

if (WebUI.verifyOptionSelectedByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Tipo Periodo'), 
    7, 1, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Tipo Periodo'), 
        '6')
} else {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Tipo Periodo'), 
        7)
}

if (WebUI.verifyOptionSelectedByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Vinculacion'), 
    '8', 1, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Vinculacion'), 
        9)
} else {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Vinculacion'), 
        8)
}

if (WebUI.verifyOptionSelectedByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Rol'), 
    1, 1, FailureHandling.OPTIONAL)) {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Rol'), 
        3)
} else {
    WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/select_Rol'), 
        1)
}

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/input_Mesada'), 
    identificacion)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Actualizacion de Datos en Puesto de Trabajo/a_Actualizar'))

WebUI.getText(findTestObject('Alerta/Alerta'))

