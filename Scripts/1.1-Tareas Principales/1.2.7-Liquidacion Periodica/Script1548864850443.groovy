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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Tareas Administracion Compensacion/Tarea Listado Empleados'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/input_Identificacin_listadoEmp'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/input_Identificacin_listadoEmp'), 
    '354968431354')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/input_Identificacin_listadoEmp'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/span_CONSTA BELFEGORD JHON'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/span_Liquidacin Periodica'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/span_Liquidacin Periodica'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/a_Nuevo'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/select_-- seleccione --BC - PR'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/select_-- seleccione --BC - PR'))

String option1=WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/opcion_1'))

String option2=WebUI.getText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/opcion_2'))

if (option1 == 'BC - PRESTAMO BANCOLOMBIA') {
	WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/opcion_1'))
}
else if(option2 == 'BC - PRESTAMO BANCOLOMBIA') {
	WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/opcion_2'))
}else {WebUI.acceptAlert()}

WebUI.selectOptionByValue(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/select_-- seleccione --BC - PR'), 
    'BC', true)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/input_Fecha Inicial _form_liqu'), 
    '03/07/2021')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/input_Fecha Inicial _form_liqu'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/a_Guardar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/a_Guardar'))

WebUI.waitForElementVisible(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'), 0)

String x = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

if (x.equals('Se modifico el registro satisfactoriamente')) {
    String Resultado = 'PRUEBA  OK'

    salir()
} else {
    throw Exception('No se obtuvo mensaje esperado=' + x)
}

def salir() {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/a_Empresa 1_cerrar_menu'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/a_Administrador_glyphicons glyphicons-exit'))

    WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Liquidacion Periodica/div_Ingresar Olvide Mi Clave'), 
        0)

    WebUI.closeBrowser()
}

