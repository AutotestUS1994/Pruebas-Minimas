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

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Empresa 1_form_templatej_idt24_input'), 
    'Rol Acceso (gna)')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/span_Rol Acceso (gna)'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Permisos Por Login Usuario'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_filtro'), 'PruebasKatalon')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_filtro'), Keys.chord(
        Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_PruebasKatalon'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_PruebasKatalon'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Eliminar Permisos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Aceptar'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Permisos Por Login Usuario'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Nuevo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Control Acceso_rolAccesousuario'), 
    'PruebasKatalon')

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Login Par_rolAccesologinAutoriza'), 
    'saraadmin')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Actualizar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Periodo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Asociar todo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Si'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_DesasociarTodo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Si'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Filtrar por Cdigo_rolAccesotablaDisponiblej_idt979filter'), 
    '36363')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Filtrar por Cdigo_rolAccesotablaDisponiblej_idt979filter'), 
    Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_36363'))

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_kataloon'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Eliminar Permisos'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Aceptar'))

WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Permisos Por Rol'), 
    0)

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Permisos Por Rol'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_filtro'), 'PruebasKatalonPorRol')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_filtro'), Keys.chord(
        Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_pruebasKatalonPorPeriodo'), 
    1)) {
    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_pruebasKatalonPorPeriodo'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Eliminar Permisos'))

    WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Aceptar'))
}

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Nuevo'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Control Acceso_rolAccesousuario'), 
    'PruebasKatalonPorRol')

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Aplicar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Copiar Permisos'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/label_Borrar Permisos Actuales y Copiar Todo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_saraadmin'))

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Tipo Copia_form_popupCopiarPermisosRolAccesolistadoPermisosj_idt233'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Copiar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Aceptar'))

String result = WebUI.getText(findTestObject('3-OBJECTS UTILIDADES/Alerta/Alerta'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Regresar'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/span_Para asociar o desasociar realice clic sobre el registro_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Periodo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Asociar todo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Si'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_DesasociarTodo'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Si'))

WebUI.setText(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Filtrar por Cdigo_rolAccesotablaDisponiblej_idt979filter'), 
    '36363')

WebUI.sendKeys(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/input_Filtrar por Cdigo_rolAccesotablaDisponiblej_idt979filter'), 
    Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_36363'))

WebUI.doubleClick(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/td_kataloon'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Eliminar Permisos'))

WebUI.click(findTestObject('1-OBJECTS TAREAS PRINCIPALES/Modulo Tarea Sara General/Permisos Rol Acceso/a_Aceptar'))

if (result == 'Se ha realizado la copia de permisos') {
    String Resultado = 'PRUEBA OK'

    WebUI.callTestCase(findTestCase('Utilidades-(atajos_para _tareas)/Cerrar_sesion_sara/cerrar_sesion'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

