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

WebUI.callTestCase(findTestCase('0-Login/0.1-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/input_Mantenimiento de Vacaciones_form'), 
    0)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/input_Mantenimiento de Vacaciones_form'), 
    'Mantenimiento de Vacaciones')

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/span_mantenimiento de vacaciones reliquidar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/span_mantenimiento de vacaciones reliquidar'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/input_Identificacin_form_mantenimientoVacacionj_idt66'), 
    '1234567890')

WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Mantenimiento de Vacaciones Reliquidar/input_Identificacin_form_mante'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/td_No se encontr registros'), 
    1)) {
    WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.1.7-Generar Vacaciones'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/input_Mantenimiento de Vacaciones_form'), 
        0)

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/input_Mantenimiento de Vacaciones_form'), 
        'Mantenimiento de Vacaciones (com)')

    WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/span_Mantenimiento de Vacaciones tarea'), 
        0)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/span_Mantenimiento de Vacaciones tarea'))

    WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/input_Identificacin_form_mantenimientoVacacionj_idt66'), 
        '1234567890')

    WebUI.sendKeys(findTestObject('Modulo Tarea Administracion Compensacion/Mantenimiento de Vacaciones Reliquidar/input_Identificacin_form_mante'), 
        Keys.chord(Keys.ENTER))
}

WebUI.selectOptionByIndex(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/select_SeleccioneCerradaNo Cerrada'), 
    '2')

WebUI.check(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/div_Estado_ui-chkbox-'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/a_Reliquidacion'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/a_Aceptar_Reliquidacion'))

WebUI.waitForElementClickable(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/a_Continuar_Reliquidar'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/a_Continuar_Reliquidar'))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Compensacion/Periodo en Proceso - Archivo Plano/Mantenimiento de Vacaciones Reliquidar/td_1234567890'), 
    1)) {
    String Resultado = 'PRUEBA OK'
} else {
    WebUI.acceptAlert()
}

